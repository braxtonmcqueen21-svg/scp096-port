package com.scp096port;

import com.scp096port.entity.Scp096Entity;
import com.scp096port.entity.Scp096State;
import com.scp096port.client.Scp096Renderer;
import com.scp096port.client.model.Scp096Layers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Scp096Mod.MODID)
public class Scp096Mod {
    public static final String MODID = "scp096port";

    public Scp096Mod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModEntities.ENTITIES.register(bus);
        ModItems.ITEMS.register(bus);
        ModSounds.SOUNDS.register(bus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Scp096Config.SPEC);
        bus.addListener(this::onAttributes);
        bus.addListener(this::onCreativeTab);
    }

    private void onAttributes(EntityAttributeCreationEvent e) {
        e.put(ModEntities.SCP096.get(), Scp096Entity.createAttributes().build());
    }

    private void onCreativeTab(BuildCreativeModeTabContentsEvent e) {
        if (e.getTabKey() == CreativeModeTabs.SPAWN_EGGS) e.accept(ModItems.SPAWN_EGG);
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEvents {
        @SubscribeEvent
        public static void layers(EntityRenderersEvent.RegisterLayerDefinitions e) {
            for (Scp096State s : Scp096State.values())
                e.registerLayerDefinition(Scp096Layers.layer(s), () -> Scp096Layers.definition(s));
        }

        @SubscribeEvent
        public static void renderers(EntityRenderersEvent.RegisterRenderers e) {
            e.registerEntityRenderer(ModEntities.SCP096.get(), Scp096Renderer::new);
        }
    }
}
