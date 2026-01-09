package de.jaypi4c.mineduino.survival.item;

import de.jaypi4c.mineduino.survival.MineDuinoSurvival;
import de.jaypi4c.mineduino.survival.block.MineDuinoSurvivalBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MineDuinoSurvivalItemGroups {


    public static final ItemGroup MINEDUINO_SURVIVAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MineDuinoSurvival.MOD_ID, "mineduino_survival_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack((MineDuinoSurvivalItems.ADIOMANTIUM_INGOT)))
                    .displayName(Text.translatable("itemgroup.mineduino-survival.items"))
                    .entries(((ignored, entries) -> {
                        // items
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_DUST);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_INGOT);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_CORE);
                        entries.add(MineDuinoSurvivalItems.COMPRESSED_ADIOMANTIUM_CORE_FRAGMENT);
                        entries.add(MineDuinoSurvivalItems.COMPRESSED_ADIOMANTIUM_CORE);
                        entries.add(MineDuinoSurvivalItems.LEATHER_HANDLE);
                        entries.add(MineDuinoSurvivalItems.TOOL_ROD);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_MULTITOOLBLADE);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_MULTICORE);

                        // blocks
                        entries.add(MineDuinoSurvivalBlocks.ADIOMANTIUM_BLOCK);
                        entries.add(MineDuinoSurvivalBlocks.ADIOMANTIUM_ORE);

                        // tools
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_SWORD);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_SHOVEL);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_PICKAXE);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_AXE);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_HOE);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_MULTITOOL);

                        // armor
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_HELMET);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_CHESTPLATE);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_LEGGINGS);
                        entries.add(MineDuinoSurvivalItems.ADIOMANTIUM_BOOTS);
                    }))
                    .build());

    public static void registerItemGroups() {
        MineDuinoSurvival.LOGGER.info("Registering Item Groups for " + MineDuinoSurvival.MOD_ID);
    }

}
