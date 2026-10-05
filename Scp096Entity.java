package com.scp096port.entity;

import com.scp096port.ModSounds;
import com.scp096port.Scp096Config;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * SCP-096 "Shy Guy" - port of the 1.12.2 SCP: Lockdown EntityShyGuy behaviour.
 *
 * Flow (taken from the 1.12.2 bytecode):
 *  SITTING/WALKING (passive, wanders, sobs every 35 s)
 *   -> anyone looks at its face  => added to kill list (max 3), anger sound, state CRYING
 *  CRYING  (29 s wind-up, stands still)
 *   -> RUNNING: hunts the kill list at 2x speed, 40 damage, screams (11 s loop), optionally breaks blocks
 *  RUNNING ends when the kill list is empty (targets dead / creative) => back to SITTING
 */
public class Scp096Entity extends PathfinderMob {
    private static final EntityDataAccessor<Byte> DATA_STATE =
            SynchedEntityData.defineId(Scp096Entity.class, EntityDataSerializers.BYTE);

    public static final int MAX_TARGETS = 3;
    private static final int CRY_WINDUP_TICKS = 29 * 20;
    private static final int CRY_SOUND_INTERVAL = 35 * 20;
    private static final int SCREAM_TICKS = 11 * 20;

    private final List<UUID> killList = new ArrayList<>();
    private int cryTimer;
    private int idleCryTicks;
    private int chaseScreamTicks;

    public Scp096Entity(EntityType<? extends Scp096Entity> type, Level level) {
        super(type, level);
        this.setMaxUpStep(1.0F);
        this.xpReward = 0;
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 1024.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.29D)
                .add(Attributes.FOLLOW_RANGE, 100.0D)
                .add(Attributes.ATTACK_DAMAGE, 40.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 0.0D);
    }

    // ---------------------------------------------------------------- state
    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_STATE, (byte) Scp096State.SITTING.ordinal());
    }

    public Scp096State getState() {
        Scp096State[] v = Scp096State.values();
        return v[Mth.clamp(this.entityData.get(DATA_STATE), 0, v.length - 1)];
    }

    public void setState(Scp096State s) {
        this.entityData.set(DATA_STATE, (byte) s.ordinal());
    }

    @Override
    protected float getStandingEyeHeight(Pose pose, EntityDimensions dims) {
        switch (getState()) {
            case SITTING: return 1.1875F;
            case CRYING:  return dims.height * 0.85F;
            default:      return dims.height - 0.1875F;
        }
    }

    // ---------------------------------------------------------------- goals
    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RageMeleeGoal(this));
        this.goalSelector.addGoal(2, new PassiveWanderGoal(this));
    }

    private static class RageMeleeGoal extends MeleeAttackGoal {
        private final Scp096Entity shy;
        RageMeleeGoal(Scp096Entity m) { super(m, 2.0D, true); this.shy = m; }
        @Override public boolean canUse() { return shy.getState() == Scp096State.RUNNING && super.canUse(); }
        @Override public boolean canContinueToUse() { return shy.getState() == Scp096State.RUNNING && super.canContinueToUse(); }
    }

    private static class PassiveWanderGoal extends WaterAvoidingRandomStrollGoal {
        private final Scp096Entity shy;
        PassiveWanderGoal(Scp096Entity m) { super(m, 1.0D); this.shy = m; }
        @Override public boolean canUse() { return shy.getState().passive && super.canUse(); }
        @Override public boolean canContinueToUse() { return shy.getState().passive && super.canContinueToUse(); }
    }

    // ---------------------------------------------------------------- brain
    @Override
    public void tick() {
        super.tick();
        if (!this.level().isClientSide) serverTick();
    }

    private void serverTick() {
        if (getState() == Scp096State.CRYING) cryTimer++;
        if (this.tickCount % 4 == 0) observe();
        purgeKillList();

        // someone saw the face while it was calm -> anger sound + wind-up
        if (!killList.isEmpty() && getState().passive) {
            this.level().playSound(null, this.blockPosition(), ModSounds.ANGER.get(), SoundSource.HOSTILE, 4.0F, 1.0F);
            setState(Scp096State.CRYING);
            cryTimer = 0;
            this.getNavigation().stop();
            this.setTarget(null);
        }

        switch (getState()) {
            case CRYING -> {
                if (killList.isEmpty()) calm();
                else if (cryTimer >= CRY_WINDUP_TICKS) startRage();
            }
            case RUNNING -> {
                if (killList.isEmpty()) { calm(); }
                else { ensureTarget(); breakBlocksInPath(); screamWhileChasing(); }
            }
            default -> passiveTick();
        }
    }

    private void passiveTick() {
        boolean moving = !this.getNavigation().isDone();
        if (!moving && getState() != Scp096State.SITTING) setState(Scp096State.SITTING);
        else if (moving && getState() != Scp096State.WALKING) setState(Scp096State.WALKING);

        if (idleCryTicks > 0) idleCryTicks--;
        else if (Scp096Config.CRY_SOUND.get()) {
            this.level().playSound(null, this.blockPosition(), ModSounds.CRY.get(), SoundSource.HOSTILE,
                    1.5F, 0.7F + this.random.nextFloat() * 0.3F);
            idleCryTicks = CRY_SOUND_INTERVAL;
        }
    }

    private void startRage() {
        setState(Scp096State.RUNNING);
        cryTimer = 0;
        chaseScreamTicks = 0;
        ensureTarget();
    }

    private void calm() {
        setState(Scp096State.SITTING);
        killList.clear();
        cryTimer = 0;
        chaseScreamTicks = 0;
        this.setTarget(null);
        this.getNavigation().stop();
    }

    private void screamWhileChasing() {
        if (chaseScreamTicks > 0) { chaseScreamTicks--; return; }
        boolean moving = this.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D;
        if (Scp096Config.CHASE_SOUND.get() && (moving || this.getTarget() != null)) {
            chaseScreamTicks = SCREAM_TICKS;
            this.level().playSound(null, this.blockPosition(), ModSounds.CHASE.get(), SoundSource.HOSTILE, 5.0F, 1.0F);
        }
    }

    // ---------------------------------------------------------------- "seeing its face"
    private void observe() {
        double range = this.getAttributeValue(Attributes.FOLLOW_RANGE);
        List<LivingEntity> viewers = this.level().getEntitiesOfClass(LivingEntity.class,
                this.getBoundingBox().inflate(range), this::canObserve);
        for (LivingEntity e : viewers) {
            if (killList.size() >= MAX_TARGETS) break;
            if (!killList.contains(e.getUUID())) killList.add(e.getUUID());
        }
    }

    private boolean canObserve(LivingEntity e) {
        if (e == this || !e.isAlive()) return false;
        if (e instanceof Player p) { if (!isSurvival(p)) return false; }
        else if (!Scp096Config.TRIGGER_ON_MOBS.get() || e instanceof Scp096Entity) return false;
        return isLookingAtMe(e);
    }

    private boolean isLookingAtMe(LivingEntity viewer) {
        Vec3 from = viewer.getEyePosition();
        Vec3 to = this.getEyePosition();
        Vec3 dir = to.subtract(from);
        double dist = dir.length();
        if (dist > this.getAttributeValue(Attributes.FOLLOW_RANGE) || dist < 1.0E-4D) return false;
        double cos = viewer.getViewVector(1.0F).normalize().dot(dir.scale(1.0D / dist));
        if (cos < Math.cos(Math.toRadians(Scp096Config.FOV_DEGREES.get() / 2.0D))) return false;
        // VISUAL shape: glass does not block the view (1.12.2 explicitly let glass through)
        return this.level().clip(new ClipContext(from, to, ClipContext.Block.VISUAL, ClipContext.Fluid.NONE, viewer))
                .getType() == HitResult.Type.MISS;
    }

    private static boolean isSurvival(Player p) {
        return p.isAlive() && !p.isCreative() && !p.isSpectator();
    }

    private LivingEntity resolve(UUID id) {
        if (this.level() instanceof ServerLevel sl) {
            Entity e = sl.getEntity(id);
            if (e instanceof LivingEntity le) return le;
        }
        return null;
    }

    private void purgeKillList() {
        killList.removeIf(id -> {
            LivingEntity e = resolve(id);
            return e == null || !e.isAlive() || (e instanceof Player p && !isSurvival(p));
        });
    }

    private void ensureTarget() {
        LivingEntity cur = this.getTarget();
        if (cur != null && cur.isAlive() && killList.contains(cur.getUUID())) return;
        LivingEntity best = null;
        double bestD = Double.MAX_VALUE;
        for (UUID id : killList) {
            LivingEntity e = resolve(id);
            if (e == null) continue;
            double d = this.distanceToSqr(e);
            if (d < bestD) { bestD = d; best = e; }
        }
        this.setTarget(best);
    }

    // ---------------------------------------------------------------- block breaking
    private void breakBlocksInPath() {
        if (Scp096Config.BLOCK_BREAKING.get() == Scp096Config.BlockBreaking.OFF) return;
        if (this.tickCount % 5 != 0 || !this.getNavigation().isDone()) return;
        if (!ForgeEventFactory.getMobGriefingEvent(this.level(), this)) return;
        Direction d = this.getDirection();
        for (int up = 0; up <= 1; up++) {
            BlockPos p = this.blockPosition().relative(d).above(up);
            BlockState s = this.level().getBlockState(p);
            if (s.isAir() || !s.getFluidState().isEmpty() || s.getDestroySpeed(this.level(), p) < 0) continue;
            if (Scp096Config.BLOCK_BREAKING.get() == Scp096Config.BlockBreaking.ON || isListed(s))
                this.level().destroyBlock(p, true, this);
        }
    }

    private static boolean isListed(BlockState s) {
        ResourceLocation key = ForgeRegistries.BLOCKS.getKey(s.getBlock());
        for (String entry : Scp096Config.BREAKABLE.get()) {
            if (entry.startsWith("#")) {
                ResourceLocation tag = ResourceLocation.tryParse(entry.substring(1));
                if (tag != null && s.is(TagKey.create(Registries.BLOCK, tag))) return true;
            } else if (key != null && key.toString().equals(entry)) return true;
        }
        return false;
    }

    // ---------------------------------------------------------------- misc
    @Override
    public boolean hurt(DamageSource src, float amount) {
        if (!this.level().isClientSide && src.getEntity() instanceof Player p && isSurvival(p)
                && killList.size() < MAX_TARGETS && !killList.contains(p.getUUID()))
            killList.add(p.getUUID());   // 1.12.2 added the revenge target to the kill list
        return super.hurt(src, amount);
    }

    @Override protected SoundEvent getHurtSound(DamageSource s) { return ModSounds.GRUNT.get(); }
    @Override protected SoundEvent getDeathSound() { return ModSounds.GRUNT.get(); }
    @Override public boolean removeWhenFarAway(double d) { return false; }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        ListTag list = new ListTag();
        for (UUID id : killList) list.add(NbtUtils.createUUID(id));
        tag.put("players", list);
        tag.putByte("state", (byte) getState().ordinal());
        tag.putInt("Crytime", cryTimer);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        killList.clear();
        for (Tag t : tag.getList("players", Tag.TAG_INT_ARRAY)) killList.add(NbtUtils.loadUUID(t));
        cryTimer = tag.getInt("Crytime");
        Scp096State[] v = Scp096State.values();
        setState(v[Mth.clamp(tag.getByte("state"), 0, v.length - 1)]);
    }
}
