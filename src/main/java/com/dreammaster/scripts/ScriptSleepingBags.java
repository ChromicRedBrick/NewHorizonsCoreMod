package com.dreammaster.scripts;

import binnie.core.Mods;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.addShapelessCraftingRecipe;
import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Arrays;

public class ScriptSleepingBags implements IScriptLoader {

    public ScriptSleepingBags() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("SleepingBags");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.AdventureBackpack.toString(),
                ModIds.Backpack.toString(),
                ModIds.OpenBlocks.toString(),
                ModIds.SleepingBags.toString()));
    }

    @Override
    public void loadRecipes() {
        final ItemStack ANY_CARPET = getModItem(ModIds.Minecraft.toString(), "carpet", 1, wildcard);
        final ItemStack TANNED_LEATHER = getModItem(ModIds.Backpack.toString(), "tannedLeather", 1);
        final ItemStack SLEEPING_BAG = getModItem(ModIds.SleepingBags.toString(), "sleepingBag", 1);
        final ItemStack AB_SLEEPING_BAG = getModItem("adventurebackpack", "backpackComponent", 1, 1);
        final ItemStack OB_SLEEPING_BAG = getModItem("OpenBlocks", "sleepingBag", 1);

        addShapedRecipe(SLEEPING_BAG, new Object[] {
                ANY_CARPET,ANY_CARPET,ANY_CARPET,
                "blockWool","blockWool","blockWool",
                TANNED_LEATHER, TANNED_LEATHER, TANNED_LEATHER
        });

        addShapelessCraftingRecipe(SLEEPING_BAG, new Object[] {AB_SLEEPING_BAG});
        addShapelessCraftingRecipe(AB_SLEEPING_BAG, new Object[] {OB_SLEEPING_BAG});
    }
}
