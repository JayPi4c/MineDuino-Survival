package de.jaypi4c.mineduino.survival.item.tools;

import de.jaypi4c.mineduino.survival.datagen.tag.Tags;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;

public class MultitoolItem extends MiningToolItem {

    /// *Notice:* This tool is created to be efficient for blocks that are minable by pickaxes and axes.
    ///
    /// @param material The tool material of the multitool.
    /// @param settings The item settings.
    public MultitoolItem(ToolMaterial material, Settings settings) {
        super(material, Tags.Blocks.MULTITOOL_MINEABLE, settings);
    }

}
