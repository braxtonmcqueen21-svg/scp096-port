package com.scp096port;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Scp096Mod.MODID);

    public static final RegistryObject<SoundEvent> ANGER = reg("scp096.anger"); // played the moment someone sees its face
    public static final RegistryObject<SoundEvent> CRY   = reg("scp096.cry");   // idle sobbing
    public static final RegistryObject<SoundEvent> CHASE = reg("scp096.chase"); // 11 s scream loop while hunting
    public static final RegistryObject<SoundEvent> GRUNT = reg("scp096.grunt"); // hurt / death

    private static RegistryObject<SoundEvent> reg(String name) {
        return SOUNDS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Scp096Mod.MODID, name)));
    }

    private ModSounds() {}
}
