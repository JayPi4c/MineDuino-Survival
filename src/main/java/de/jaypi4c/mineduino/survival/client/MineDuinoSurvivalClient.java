package de.jaypi4c.mineduino.survival.client;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import net.fabricmc.api.ClientModInitializer;

public class MineDuinoSurvivalClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MineDuinoSurvival.LOGGER.info("Initializing Client for " + MineDuinoSurvival.MOD_ID);
    }
}
