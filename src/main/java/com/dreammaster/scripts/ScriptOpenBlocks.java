package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.addShapelessCraftingRecipe;
import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.GT_Values;
import gregtech.api.util.GT_Utility;
import java.util.Arrays;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class ScriptOpenBlocks implements IScriptLoader {

    public ScriptOpenBlocks() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("OpenBlocks");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.OpenBlocks.toString(),
                ModIds.RandomThings.toString(),
                ModIds.ExtraUtilities.toString(),
                ModIds.GregTech.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack DEV_NULL = getModItem(ModIds.OpenBlocks.toString(), "devnull", 1);

        final ItemStack VOID_DROP_FILTER = getModItem(ModIds.RandomThings.toString(), "dropFilter", 1, 1);

        final ItemStack TRASH_CAN = getModItem(ModIds.ExtraUtilities.toString(), "trashcan", 1);

        final ItemStack CIRCUIT_CONFIG_2 = GT_Utility.getIntegratedCircuit(2);
        FluidStack LIQUID_ENDER_250 = FluidRegistry.getFluidStack("ender", 250);

        addShapelessCraftingRecipe(DEV_NULL, new Object[] {VOID_DROP_FILTER});

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {TRASH_CAN, CIRCUIT_CONFIG_2},
                LIQUID_ENDER_250,
                DEV_NULL,
                300,
                30
        );
    }
}
