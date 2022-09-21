package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ScriptNuclearControl implements IScriptLoader {

    public ScriptNuclearControl() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("NuclearControl");
        dependencies.clear();
        dependencies.addAll(java.util.Arrays.asList(
                ModIds.IC2NuclearControl.toString(),
                ModIds.GregTech.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack NC2_REMOTE_SENSOR_KIT = getModItem(ModIds.IC2NuclearControl.toString(), "ItemRemoteSensorKit", 1, 0);
        final ItemStack NC2_PANEL_MEMORY_CARD = getModItem(ModIds.IC2NuclearControl.toString(), "ItemPanelMemoryCard", 1, 0);

        final ItemStack CARBON_PLATE_2 = GT_OreDictUnificator.get(OrePrefixes.plateAlloy, Materials.Carbon, 2);
        final ItemStack CIRCUIT_LV_2 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 2);
        final FluidStack NO_FLUID = GT_Values.NF;

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    NC2_REMOTE_SENSOR_KIT,
                    CARBON_PLATE_2,
                    CIRCUIT_LV_2,
                },
                NO_FLUID,
                NC2_PANEL_MEMORY_CARD,
                200,
                16);
    }
}
