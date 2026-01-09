package de.jaypi4c.mineduino.survival.datagen.tag;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import static de.jaypi4c.mineduino.survival.datagen.tag.Tags.Blocks.MULTITOOL_MINEABLE;

public class MineDuinoSurvivalIncorrectForAdiomantiumTagProvider extends FabricTagProvider<Block> {

    public MineDuinoSurvivalIncorrectForAdiomantiumTagProvider(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        // here is the point to define, which blocks are NOT mineable by Adiomantium Tools
        // For now, it's just as powerful as Diamond
        getOrCreateTagBuilder(MULTITOOL_MINEABLE)
                .addOptionalTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL);
    }
}
