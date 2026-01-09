package de.jaypi4c.mineduino.survival.datagen.tag;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class Tags {

    public static final class Blocks {
        public static final TagKey<Block> MULTITOOL_MINEABLE = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MineDuinoSurvival.MOD_ID, "multitool_minable"));
        public static final TagKey<Block> INCORRECT_FOR_ADIOMANTIUM_TOOL = TagKey.of(RegistryKeys.BLOCK, Identifier.of(MineDuinoSurvival.MOD_ID, "incorrect_for_adiomantium_tool"));
    }
}
