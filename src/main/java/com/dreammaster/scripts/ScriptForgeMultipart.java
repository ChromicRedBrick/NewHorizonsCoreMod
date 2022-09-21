package com.dreammaster.scripts;

import com.dreammaster.item.ItemList;
import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Arrays;

public class ScriptForgeMultipart implements IScriptLoader {

    public ScriptForgeMultipart() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("Forge Multipart");
        dependencies.clear();
        dependencies.add(ModIds.ForgeMicroblocks.toString());
    }

    @Override
    public void loadRecipes() {
        final ItemStack STONE_SAW = getModItem("ForgeMicroblock", "sawStone", 1);
        final ItemStack IRON_SAW = getModItem("ForgeMicroblock", "sawIron", 1);
        final ItemStack DIAMOND_SAW = getModItem("ForgeMicroblock", "sawDiamond", 1);
        final ItemStack STONE_ROD_2 = getModItem("ForgeMicroblock", "stoneRod", 2);
        final ItemStack STONE_ROD_4 = getModItem("ForgeMicroblock", "stoneRod", 4);

        final ItemStack STONE_SAW_BLADE = ItemList.SawBladeStone.getIS();
        final ItemStack DIAMOND_SAW_BLADE = ItemList.SawBladeDiamond.getIS();

        addShapedRecipe(STONE_SAW, new Object[] {
            "stickWood", "stickStone", "stickStone",
            "stickWood", STONE_SAW_BLADE, "stickStone",
            null, null, null
        });

        addShapedRecipe(IRON_SAW, new Object[] {
            "stickWood", "stickIron", "stickIron",
            "stickWood", "toolHeadSawIron", "stickIron",
            null, null, null
        });

        addShapedRecipe(DIAMOND_SAW, new Object[] {
            "stickWood", "stickSteel", "stickSteel",
            "stickWood", DIAMOND_SAW_BLADE, "stickSteel",
            null, null, null
        });

        addShapedRecipe(STONE_ROD_2, new Object[] {
            "stone", null, null,
            "stone", null, null,
            null, null, null
        });

        addShapedRecipe(STONE_ROD_4, new Object[] {
            "craftingToolSaw", null, null,
            "stone", null, null,
            "stone", null, null
        });
    }
}
