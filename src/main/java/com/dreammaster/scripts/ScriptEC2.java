package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ScriptEC2 implements IScriptLoader {

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("EC2");
        dependencies.clear();
        dependencies.addAll(java.util.Arrays.asList(
                ModIds.Avaritia.toString(),
                ModIds.EternalSingularity.toString(),
                ModIds.ExtraCells.toString(),
                ModIds.GregTech.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack INFINITY_CATALYST = getModItem(ModIds.Avaritia.toString(), "Resource", 1, 5);

        final ItemStack  ETERNAL_SINGULARITY = getModItem(ModIds.EternalSingularity.toString(), "eternal_singularity", 1);

        final ItemStack EC2_ADVANCED_HOUSING = getModItem(ModIds.ExtraCells.toString(), "storage.casing", 1);
        final ItemStack EC2_FLUID_HOUSING = getModItem(ModIds.ExtraCells.toString(), "storage.casing", 1, 1);
        final ItemStack ME_DIGITAL_SINGULARITY = getModItem(ModIds.ExtraCells.toString(), "storage.physical.advanced.singularity", 1);
        final ItemStack ME_STORAGE_COMPONENT_16384k = getModItem(ModIds.ExtraCells.toString(), "storage.component", 1, 3);
        final ItemStack ME_QUANTUM_STORAGE = getModItem(ModIds.ExtraCells.toString(), "storage.physical.advanced.quantum", 1);

        final ItemStack CERTUS_PLATE = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.CertusQuartz, 1L);
        final ItemStack CHROME_PLATE_3 = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Chrome, 3L);
        final ItemStack TITANIUM_PLATE_3 = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Titanium, 3);
        final ItemStack CERTUS_QUARTZ_SCREW_2 = GT_OreDictUnificator.get(OrePrefixes.screw, Materials.CertusQuartz, 2L);
        final ItemStack CIRCUIT_CONFIG_3 = GT_Utility.getIntegratedCircuit(3);
        final ItemStack QUANTUM_CHEST_V = ItemList.Quantum_Chest_IV.get(1);
        final FluidStack NO_FLUID = GT_Values.NF;

        final ItemStack GLASS_PANE = getModItem(ModIds.Minecraft.toString(), "glass_pane", 1);

        // EC2 Housings
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    GLASS_PANE,
                    CERTUS_PLATE,
                    CHROME_PLATE_3,
                    CERTUS_QUARTZ_SCREW_2,
                    CIRCUIT_CONFIG_3
                },
                NO_FLUID,
                EC2_ADVANCED_HOUSING,
                100,
                16);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    GLASS_PANE,
                    CERTUS_PLATE,
                    TITANIUM_PLATE_3,
                    CERTUS_QUARTZ_SCREW_2,
                    CIRCUIT_CONFIG_3
                },
                NO_FLUID,
                EC2_FLUID_HOUSING,
                100,
                16);

        // ME Digital Singularity
        ExtremeCraftingManager.getInstance()
                .addExtremeShapedOreRecipe(
                        ME_DIGITAL_SINGULARITY,
                        "----a----",
                        "---aba---",
                        "--ecdce--",
                        "-acdddca-",
                        "abddfddba",
                        "-acdddca-",
                        "--ecdce--",
                        "---aba---",
                        "----a----",
                        'a',
                        "blockCosmicNeutronium",
                        'b',
                        INFINITY_CATALYST,
                        'c',
                        QUANTUM_CHEST_V,
                        'd',
                        ME_STORAGE_COMPONENT_16384k,
                        'e',
                        "blockInfinity",
                        'f',
                        ETERNAL_SINGULARITY);

        // ME Quantum Storage
        ExtremeCraftingManager.getInstance()
                .addExtremeShapedOreRecipe(
                        ME_QUANTUM_STORAGE,
                        "---------",
                        "----a----",
                        "---bdb---",
                        "--bcdcb--",
                        "-addedda-",
                        "--bcdcb--",
                        "---bdb---",
                        "----a----",
                        "---------",
                        'a',
                        "blockCosmicNeutronium",
                        'b',
                        "plateDenseNeutronium",
                        'c',
                        "circuitInfinite",
                        'd',
                        ME_STORAGE_COMPONENT_16384k,
                        'e',
                        EC2_ADVANCED_HOUSING);

        // ME Void Storage
        addShapedRecipe(getModItem("extracells", "storage.physical.void", 1), new Object[] {
            "craftingToolHardHammer", "plateCertusQuartz", "screwCertusQuartz",
            "plateTungsten", "gemEnderEye", "plateTungsten",
            "screwCertusQuartz", "plateTungsten", "craftingToolScrewdriver"
        });
    }
}
