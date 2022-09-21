package com.dreammaster.scripts;

import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.getModItem;

public class ScriptTranslocator implements IScriptLoader {

    public ScriptTranslocator() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("Translocators");
        dependencies.clear();
        dependencies.add(ModIds.Translocators.toString());
    }

    @Override
    public void loadRecipes() {
        final ItemStack ITEM_TRANSLOCATOR_2 = getModItem("Translocator", "translocator", 2);
        final ItemStack FLUID_TRANSLOCATOR_2 = getModItem("Translocator", "translocator", 2, 1);

        addShapedRecipe(ITEM_TRANSLOCATOR_2, new Object[] {
            "itemCasingAluminium", "plateRedAlloy", "itemCasingAluminium",
            "pipeMediumBrass", "gemEnderPearl", "pipeMediumBrass",
            "itemCasingAluminium", "plateRedAlloy", "itemCasingAluminium"
        });
        addShapedRecipe(FLUID_TRANSLOCATOR_2, new Object[] {
            "itemCasingAluminium", "plateRedAlloy", "itemCasingAluminium",
            "pipeMediumSteel", "gemEnderPearl", "pipeMediumSteel",
            "itemCasingAluminium", "plateRedAlloy", "itemCasingAluminium"
        });
    }
}
