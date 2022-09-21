package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.GT_Values;
import java.util.Arrays;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ScriptEnderZoo implements IScriptLoader {

    public ScriptEnderZoo() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("EnderZoo");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.EnderIO.toString(),
                ModIds.GregTech.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final FluidStack NO_FLUID = GT_Values.NF;

        final ItemStack CONFUSING_CHARGE = getModItem("EnderZoo", "blockConfusingCharge", 1);
        final ItemStack ENDER_CHARGE = getModItem("EnderZoo", "blockEnderCharge", 1);
        final ItemStack CONCUSSION_CHARGE_2 = getModItem("EnderZoo", "blockConcussionCharge", 2);
        final ItemStack CONFUSING_POWDER_4 = getModItem("EnderZoo", "confusingDust", 4);
        final ItemStack ENDER_FRAGMENT_4 = getModItem("EnderZoo", "enderFragment", 4);

        final ItemStack TNT = getModItem("minecraft", "tnt", 1);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {TNT, CONFUSING_POWDER_4},
                NO_FLUID,
                CONFUSING_CHARGE,
                400,
                16);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {TNT, ENDER_FRAGMENT_4},
                NO_FLUID,
                ENDER_CHARGE,
                400,
                16);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {CONFUSING_CHARGE, ENDER_CHARGE},
                NO_FLUID,
                CONCUSSION_CHARGE_2,
                400,
                30);
    }
}
