package com.scp096port;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Scp096Mod.MODID);

    public static final RegistryObject<Item> SPAWN_EGG = ITEMS.register("scp096_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SCP096, 0xE8E0D0, 0x7A1E1E, new Item.Properties()));

    private ModItems() {}
}
