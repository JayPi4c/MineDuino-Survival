package de.jaypi4c.mineduino.survival.item;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MineDuinoSurvivalItems {

    public static final Item ADIOMANTIUM_DUST = registerItem("adiomantium_dust", new Item(new Item.Settings()));
    public static final Item ADIOMANTIUM_INGOT = registerItem("adiomantium_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MineDuinoSurvival.MOD_ID, name), item);
    }

    public static void registerItems() {
        MineDuinoSurvival.LOGGER.info("Registering Items for " + MineDuinoSurvival.MOD_ID);
    }


}
    
    
