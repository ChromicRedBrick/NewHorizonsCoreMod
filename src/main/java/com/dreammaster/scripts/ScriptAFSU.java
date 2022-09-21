package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ScriptAFSU implements IScriptLoader {

    public ScriptAFSU() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("AFSU");
        dependencies.clear();
        dependencies.addAll(java.util.Arrays.asList(
                ModIds.AFSU.toString(),
                ModIds.GregTech.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack AFSU = getModItem("AFSU", "AFSU", 1);
        final ItemStack ALC = getModItem("AFSU", "ALC", 1);

        final ItemStack MACHINE_HULL_IV = ItemList.Hull_IV.get(1);
        final ItemStack LAPOTRONIC_ENERGY_ORB = ItemList.Energy_LapotronicOrb.get(1);
        final ItemStack QUANTUMPROCESSOR_ASSEMBLY = ItemList.Circuit_Quantumcomputer.get(1);
        final ItemStack ELITE_NANOCOMPUTER = ItemList.Circuit_Elitenanocomputer.get(1);
        final ItemStack CRYSTALPROCESSOR = ItemList.Circuit_Crystalprocessor.get(1);
        final FluidStack NO_FLUID = GT_Values.NF;

        addShapedRecipe(AFSU, new Object[] {
            "cableGt01Platinum", "itemCasingTungstenSteel", "cableGt01Platinum",
            "itemCasingTungstenSteel", MACHINE_HULL_IV, "itemCasingTungstenSteel",
            "circuitMaster", ALC, "circuitMaster"
        });

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    QUANTUMPROCESSOR_ASSEMBLY,
                    LAPOTRONIC_ENERGY_ORB
                },
                NO_FLUID,
                ALC,
                2400,
                1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    ELITE_NANOCOMPUTER,
                    LAPOTRONIC_ENERGY_ORB
                },
                NO_FLUID,
                ALC,
                2400,
                1920);
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    CRYSTALPROCESSOR,
                    LAPOTRONIC_ENERGY_ORB
                },
                NO_FLUID,
                ALC,
                2400,
                1920);
    }
}
