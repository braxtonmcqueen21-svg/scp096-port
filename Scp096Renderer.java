package com.scp096port.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.scp096port.Scp096Mod;
import com.scp096port.client.model.Scp096Layers;
import com.scp096port.client.model.Scp096Model;
import com.scp096port.entity.Scp096Entity;
import com.scp096port.entity.Scp096State;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.EnumMap;
import java.util.Map;

public class Scp096Renderer extends MobRenderer<Scp096Entity, Scp096Model> {
    private static final ResourceLocation PASSIVE = new ResourceLocation(Scp096Mod.MODID, "textures/entity/scp096_passive.png");
    private static final ResourceLocation ACTIVE  = new ResourceLocation(Scp096Mod.MODID, "textures/entity/scp096_active.png");
    /** SCP096Anim.SCALE in the 1.12.2 jar is 1.25 - change here if it looks too big/small. */
    private static final float SCALE = 1.25F;

    private final Map<Scp096State, Scp096Model> models = new EnumMap<>(Scp096State.class);

    public Scp096Renderer(EntityRendererProvider.Context ctx) {
        super(ctx, new Scp096Model(ctx.bakeLayer(Scp096Layers.layer(Scp096State.WALKING)), Scp096State.WALKING), 0.5F);
        for (Scp096State s : Scp096State.values())
            models.put(s, new Scp096Model(ctx.bakeLayer(Scp096Layers.layer(s)), s));
    }

    @Override
    public void render(Scp096Entity e, float yaw, float partial, PoseStack ps, MultiBufferSource buf, int light) {
        this.model = models.get(e.getState());   // swap the pose model by state, like the 1.12.2 RenderShyGuy
        super.render(e, yaw, partial, ps, buf, light);
    }

    @Override
    protected void scale(Scp096Entity e, PoseStack ps, float partial) {
        ps.scale(SCALE, SCALE, SCALE);
    }

    @Override
    public ResourceLocation getTextureLocation(Scp096Entity e) {
        return e.getState() == Scp096State.RUNNING ? ACTIVE : PASSIVE;
    }
}
