package com.scp096port;

import net.minecraftforge.common.ForgeConfigSpec;
import java.util.List;

public final class Scp096Config {
    public enum BlockBreaking { OFF, ON, SPECIFIC }

    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.EnumValue<BlockBreaking> BLOCK_BREAKING;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> BREAKABLE;
    public static final ForgeConfigSpec.BooleanValue CRY_SOUND, CHASE_SOUND, TRIGGER_ON_MOBS;
    public static final ForgeConfigSpec.IntValue FOV_DEGREES;

    static {
        ForgeConfigSpec.Builder b = new ForgeConfigSpec.Builder();
        BLOCK_BREAKING = b.comment("OFF = never breaks blocks, ON = breaks anything breakable in its way, SPECIFIC = only the list below (entries starting with # are block tags)")
                .defineEnum("blockBreaking", BlockBreaking.SPECIFIC);
        BREAKABLE = b.defineListAllowEmpty("breakableBlocks",
                List.of("#minecraft:doors", "#minecraft:trapdoors", "#minecraft:fence_gates", "#minecraft:planks",
                        "#minecraft:wooden_fences", "#forge:glass", "#forge:glass_panes"),
                o -> o instanceof String);
        CRY_SOUND = b.define("crySound", true);
        CHASE_SOUND = b.define("chaseSound", true);
        TRIGGER_ON_MOBS = b.comment("If true any living mob that sees its face is also added to the kill list (the 1.12.2 version did this). Default: players only.")
                .define("triggerOnMobs", false);
        FOV_DEGREES = b.comment("How wide the viewer's field of view is for 'seeing its face' (1.12.2 used 90).")
                .defineInRange("faceFovDegrees", 90, 10, 180);
        SPEC = b.build();
    }

    private Scp096Config() {}
}
