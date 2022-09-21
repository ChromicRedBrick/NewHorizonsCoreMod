package com.dreammaster.scripts;

import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Arrays;

public class ScriptHoloInventory implements IScriptLoader {

    public ScriptHoloInventory() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("HoloInventory");
        dependencies.clear();
        dependencies.add(ModIds.HoloInventory.toString());
    }

    @Override
    public void loadRecipes() {
        final ItemStack HOLO_GLASSES = getModItem("holoinventory", "Hologlasses", 1);
        
        addShapedRecipe(HOLO_GLASSES, new Object[] {
            "stickSteel", "screwSteel", "stickSteel",
            "ringSteel", "boltSteel", "ringSteel",
            "lensInfusedEntropy", "craftingToolScrewdriver", "lensInfusedEntropy"
        });
    }
}
