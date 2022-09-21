package com.dreammaster.scripts;

import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.getModItem;

public class ScriptBetterQuesting implements IScriptLoader {

    public ScriptBetterQuesting() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("BetterQuesting");
        dependencies.clear();
        dependencies.add(ModIds.BetterQuesting.toString());
    }

    @Override
    public void loadRecipes() {
        final ItemStack CHEST = getModItem("minecraft", "chest", 1);
        final ItemStack OBJECT_SUBMISSION_STATION = getModItem("betterquesting", "submit_station", 1);

        addShapedRecipe(OBJECT_SUBMISSION_STATION, new Object[] {
            "plateWood", "plateSteel", "plateWood",
            "plateSteel", "gearSteel", "plateSteel",
            "plateWood", CHEST, "plateWood"
        });
    }
}
