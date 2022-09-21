package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import gregtech.api.enums.ItemList;
import java.util.Arrays;
import net.minecraft.item.ItemStack;

public class ScriptEnderIO implements IScriptLoader {

    public ScriptEnderIO() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("EnderIO");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.AE2.toString(),
                ModIds.Avaritia.toString(),
                ModIds.EnderIO.toString(),
                ModIds.GregTech.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack DENSE_ENERGY_CELL = getModItem(ModIds.AE2.toString(), "tile.BlockDenseEnergyCell", 1);
        final ItemStack ENERGY_CELL = getModItem(ModIds.AE2.toString(), "tile.BlockEnergyCell", 1);

        final ItemStack ENDEST_PEARL = getModItem(ModIds.Avaritia.toString(), "Endest_Pearl", 1);

        final ItemStack CREATIVE_STAFF_OF_TRAVELLING = getModItem(ModIds.EnderIO.toString(), "itemInfiniteTravelStaff", 1);
        final ItemStack STAFF_OF_TRAVELLING = getModItem(ModIds.EnderIO.toString(), "itemTravelStaff", 1, wildcard);

        final ItemStack FIELD_GENERATOR_ZPM = ItemList.Field_Generator_ZPM.get(1);

        ExtremeCraftingManager.getInstance()
                .addExtremeShapedOreRecipe(
                        CREATIVE_STAFF_OF_TRAVELLING,
                        "      aaa",
                        "     abca",
                        "    abcba",
                        "   abcba ",
                        "   daba  ",
                        "  deda   ",
                        " dfd     ",
                        "dfd      ",
                        " d       ",
                        'a',
                        "plateDenseObsidian",
                        'b',
                        DENSE_ENERGY_CELL,
                        'c',
                        ENERGY_CELL,
                        'd',
                        STAFF_OF_TRAVELLING,
                        'e',
                        ENDEST_PEARL,
                        'f',
                        FIELD_GENERATOR_ZPM);
    }
}
