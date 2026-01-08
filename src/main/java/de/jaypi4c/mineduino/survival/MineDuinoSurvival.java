package de.jaypi4c.mineduino.survival;

import de.jaypi4c.mineduino.survival.block.MineDuinoSurvivalBlocks;
import de.jaypi4c.mineduino.survival.item.MineDuinoSurvivalItemGroups;
import de.jaypi4c.mineduino.survival.item.MineDuinoSurvivalItems;
import de.jaypi4c.mineduino.survival.worldgen.MineDuinoSurvivalOreGen;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MineDuinoSurvival implements ModInitializer {
    public static final String MOD_ID = "mineduino-survival";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        MineDuinoSurvivalItemGroups.registerItemGroups();
        MineDuinoSurvivalItems.registerItems();
        MineDuinoSurvivalBlocks.registerBlocks();
        MineDuinoSurvivalOreGen.registerOreGeneration();
    }
}