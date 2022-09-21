package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ScriptAppliedEnergistics2 implements IScriptLoader {

    public ScriptAppliedEnergistics2() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("AppliedEnergistics2");
        dependencies.clear();
        dependencies.add(ModIds.AE2.toString());
    }

    @Override
    public void loadRecipes() {
        final ItemStack CRAFTING_UNIT = getModItem(ModIds.AE2.toString(), "tile.BlockCraftingUnit", 1);
        final ItemStack CO_CRAFTING_UNIT_4X = getModItem(ModIds.AE2.toString(), "tile.BlockCraftingUnit", 1, 2);
        final ItemStack CO_CRAFTING_UNIT_16X = getModItem(ModIds.AE2.toString(), "tile.BlockCraftingUnit", 1, 3);

        final Object IV_CIRCUIT_OREDICT = OrePrefixes.circuit.get(Materials.Elite);
        final Object UHV_SUPERCONDUCTOR = OrePrefixes.circuit.get(Materials.Superconductor);
        final FluidStack NO_FLUID = GT_Values.NF;

        GT_Values.RA.addAssemblerRecipe(
                CRAFTING_UNIT, IV_CIRCUIT_OREDICT, 2, GT_Values.NF, CO_CRAFTING_UNIT_4X, 100, 480);

        GT_Values.RA.addAssemblerRecipe(
                CRAFTING_UNIT,
                UHV_SUPERCONDUCTOR,
                2,
                NO_FLUID,
                CO_CRAFTING_UNIT_16X,
                100,
                30720);
    }
}
