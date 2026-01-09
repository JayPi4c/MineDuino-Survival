package de.jaypi4c.mineduino.survival.item;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import de.jaypi4c.mineduino.survival.tools.MineDuinoSurvivalToolMaterial;
import de.jaypi4c.mineduino.survival.tools.MultitoolItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MineDuinoSurvivalItems {

    public static final Item ADIOMANTIUM_DUST = registerItem("adiomantium_dust", new Item(new Item.Settings()));
    public static final Item ADIOMANTIUM_INGOT = registerItem("adiomantium_ingot", new Item(new Item.Settings()));

    // Tools
    public static final Item ADIOMANTIUM_SWORD = registerItem("adiomantium_sword", new SwordItem(MineDuinoSurvivalToolMaterial.ADIOMANTIUM, new Item.Settings()));
    public static final Item ADIOMANTIUM_SHOVEL = registerItem("adiomantium_shovel", new ShovelItem(MineDuinoSurvivalToolMaterial.ADIOMANTIUM, new Item.Settings()));
    public static final Item ADIOMANTIUM_PICKAXE = registerItem("adiomantium_pickaxe", new PickaxeItem(MineDuinoSurvivalToolMaterial.ADIOMANTIUM, new Item.Settings()));
    public static final Item ADIOMANTIUM_AXE = registerItem("adiomantium_axe", new AxeItem(MineDuinoSurvivalToolMaterial.ADIOMANTIUM, new Item.Settings()));
    public static final Item ADIOMANTIUM_HOE = registerItem("adiomantium_hoe", new HoeItem(MineDuinoSurvivalToolMaterial.ADIOMANTIUM, new Item.Settings()));
    public static final Item ADIOMANTIUM_MULTITOOL = registerItem("adiomantium_multitool", new MultitoolItem(MineDuinoSurvivalToolMaterial.ADIOMANTIUM, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MineDuinoSurvival.MOD_ID, name), item);
    }

    public static void registerItems() {
        MineDuinoSurvival.LOGGER.info("Registering Items for " + MineDuinoSurvival.MOD_ID);
    }


}
    
    
