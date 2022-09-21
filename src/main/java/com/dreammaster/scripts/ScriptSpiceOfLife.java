package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.addShapelessCraftingRecipe;
import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Arrays;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ScriptSpiceOfLife implements IScriptLoader {

    public ScriptSpiceOfLife() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("SpiceOfLife");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.IC2.toString(),
                ModIds.SpiceOfLife.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack LUNCH_BAG = getModItem(ModIds.SpiceOfLife.toString(), "lunchbag", 1);
        final ItemStack LUNCH_BOX = getModItem(ModIds.SpiceOfLife.toString(), "lunchbox", 1);
        final ItemStack FOOD_JOURNAL = getModItem(ModIds.SpiceOfLife.toString(), "bookfoodjournal", 1);

        final ItemStack PAPER = getModItem(ModIds.Minecraft.toString(), "paper", 1);
        final ItemStack WHEAT = getModItem(ModIds.Minecraft.toString(), "wheat", 1);

        final ItemStack STICKY_RESIN = getModItem(ModIds.IC2.toString(), "itemHarz", 1);

        addShapedRecipe(LUNCH_BAG, new Object[] {
                PAPER, null, PAPER,
                STICKY_RESIN, PAPER, STICKY_RESIN,
                null, null, null
        });

        addShapedRecipe(LUNCH_BOX, new Object[] {
            "plateDoubleIron", "craftingToolScrewdriver", "plateDoubleIron",
            "screwAnyIron", "plateDoubleIron", "screwAnyIron",
            null, null, null
        });

        addShapelessCraftingRecipe(FOOD_JOURNAL, new Object[] {WHEAT, PAPER});
    }
}
