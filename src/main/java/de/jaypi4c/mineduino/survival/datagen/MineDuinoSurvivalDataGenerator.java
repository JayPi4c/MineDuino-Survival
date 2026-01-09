package de.jaypi4c.mineduino.survival.datagen;

import de.jaypi4c.mineduino.survival.datagen.tag.MineDuinoSurvivalMultitoolMinableTagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MineDuinoSurvivalDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(MineDuinoSurvivalMultitoolMinableTagProvider::new);
    }
}
