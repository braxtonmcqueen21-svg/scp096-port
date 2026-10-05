package com.scp096port;

import com.scp096port.entity.Scp096Entity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(net.minecraftforge.registries.ForgeRegistries.ENTITY_TYPES, Scp096Mod.MODID);

    public static final RegistryObject<EntityType<Scp096Entity>> SCP096 = ENTITIES.register("scp096",
            () -> EntityType.Builder.of(Scp096Entity::new, MobCategory.MONSTER)
                    .sized(0.9F, 1.9F)          // same hitbox as the 1.12.2 version
                    .clientTrackingRange(10)
                    .build("scp096"));

    private ModEntities() {}
}
