package de.jaypi4c.mineduino.survival.worldgen;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

import static de.jaypi4c.mineduino.survival.MineDuinoSurvival.MOD_ID;

public class MineDuinoSurvivalOreGen {

    public static final RegistryKey<PlacedFeature> ADIOMANTIUM_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, "ore_adiomantium"));

    public static void registerOreGeneration() {
        MineDuinoSurvival.LOGGER.info("Registering Ore Generation for " + MineDuinoSurvival.MOD_ID);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ADIOMANTIUM_ORE_PLACED_KEY);
    }


}
