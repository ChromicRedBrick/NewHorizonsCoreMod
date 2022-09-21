package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import java.util.Arrays;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

public class ScriptJABBA implements IScriptLoader {

    public ScriptJABBA() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("JABBA");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.Bartworks.toString(),
                ModIds.BiomesOPlanty.toString(),
                ModIds.EnderStorage.toString(),
                ModIds.ExtraTrees.toString(),
                ModIds.ExtraUtilities.toString(),
                ModIds.Forestry.toString(),
                ModIds.GregTech.toString(),
                ModIds.JABBA.toString(),
                ModIds.Natura.toString(),
                ModIds.RailCraft.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack ANY_BOP_PLANK_8 = getModItem(ModIds.BiomesOPlanty.toString(), "planks", 8, wildcard);

        final ItemStack ANY_EXTRATREES_PLANK_8 = getModItem(ModIds.ExtraTrees.toString(), "planks", 8, wildcard);

        final ItemStack ANY_EXTRA_UTILITIES_PLANK_8 = getModItem(ModIds.ExtraUtilities.toString(), "colorWoodPlanks", 8, wildcard);

        final ItemStack ANY_FORESTRY_PLANK_8 = getModItem(ModIds.Forestry.toString(), "planks", 8, wildcard);
        final ItemStack ANY_FORESTRY_FIREPROOF_PLANK_8 = getModItem(ModIds.Forestry.toString(), "planksFireproof", 8, wildcard);

        final ItemStack ANY_NATURA_PLANK_8 = getModItem(ModIds.Natura.toString(), "planks", 8, wildcard);

        final ItemStack BARREL = getModItem(ModIds.JABBA.toString(), "barrel", 1);
        final ItemStack STORAGE_UPGRADE = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1);
        final ItemStack STORAGE_UPGRADE_X3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 4);
        final ItemStack STORAGE_UPGRADE_X9 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 5);
        final ItemStack STORAGE_UPGRADE_X27 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 6);
        final ItemStack STORAGE_UPGRADE_X81 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 8);
        final ItemStack STORAGE_UPGRADE_X243 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 9);
        final ItemStack STORAGE_UPGRADE_X729 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 11);
        final ItemStack STORAGE_UPGRADE_X2187 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 12);
        final ItemStack STORAGE_UPGRADE_X6561 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 13);

        final ItemStack STORAGE_UPGRADE_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3);
        final ItemStack STORAGE_UPGRADE_X3_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 4);
        final ItemStack STORAGE_UPGRADE_X9_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 5);
        final ItemStack STORAGE_UPGRADE_X27_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 6);
        final ItemStack STORAGE_UPGRADE_X81_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 8);
        final ItemStack STORAGE_UPGRADE_X243_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 9);
        final ItemStack STORAGE_UPGRADE_X729_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 11);
        final ItemStack STORAGE_UPGRADE_X2187_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 12);
        final ItemStack STORAGE_UPGRADE_X6561_3 = getModItem(ModIds.JABBA.toString(), "upgradeCore", 3, 13);

        final ItemStack STRUCTURAL_MK_I = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1);
        final ItemStack STRUCTURAL_MK_II = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 1);
        final ItemStack STRUCTURAL_MK_III = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 2);
        final ItemStack STRUCTURAL_MK_IV = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 3);
        final ItemStack STRUCTURAL_MK_V = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 4);
        final ItemStack STRUCTURAL_MK_VI = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 5);
        final ItemStack STRUCTURAL_MK_VII = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 6);
        final ItemStack STRUCTURAL_MK_VIII = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 7);
        final ItemStack STRUCTURAL_MK_IX = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 8);
        final ItemStack STRUCTURAL_MK_X = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 9);
        final ItemStack STRUCTURAL_MK_XI = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 10);
        final ItemStack STRUCTURAL_MK_XII = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 11);
        final ItemStack STRUCTURAL_MK_XIII = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 12);
        final ItemStack STRUCTURAL_MK_XIV = getModItem(ModIds.JABBA.toString(), "upgradeStructural", 1, 13);

        final ItemStack BSPACE_UPGRADE = getModItem(ModIds.JABBA.toString(), "upgradeCore", 2, 1);
        final ItemStack REDSTONE_UPGRADE = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 2);
        final ItemStack HOPPER_UPGRADE = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 3);
        final ItemStack VOID_UPGRADE = getModItem(ModIds.JABBA.toString(), "upgradeCore", 1, 7);
        final ItemStack BARREL_HAMMER = getModItem(ModIds.JABBA.toString(), "hammer", 1);
        final ItemStack BSPACE_TUNING_FORK = getModItem(ModIds.JABBA.toString(), "tuningFork", 1);
        final ItemStack DOLLY = getModItem(ModIds.JABBA.toString(), "mover", 1);
        final ItemStack DIAMOND_DOLLY = getModItem(ModIds.JABBA.toString(), "moverDiamond", 1);

        final ItemStack VOID_CHEST = getModItem(ModIds.RailCraft.toString(), "machine.beta", 1, 11);

        final ItemStack ADVANCED_ENDER_CHEST = getModItem(ModIds.EnderStorage.toString(), "enderChest", 1);

        final ItemStack ELECTRIC_PISTON_LV = ItemList.Electric_Piston_LV.get(1);
        final ItemStack ELECTRIC_PISTON_MV = ItemList.Electric_Piston_MV.get(1);
        final ItemStack ELECTRIC_PISTON_HV = ItemList.Electric_Piston_HV.get(1);
        final ItemStack ELECTRIC_PISTON_EV = ItemList.Electric_Piston_EV.get(1);
        final ItemStack ELECTRIC_PISTON_IV = ItemList.Electric_Piston_IV.get(1);
        final ItemStack ELECTRIC_PISTON_LUV = ItemList.Electric_Piston_LuV.get(1);
        final ItemStack ELECTRIC_PISTON_ZPM = ItemList.Electric_Piston_ZPM.get(1);
        final ItemStack ELECTRIC_PISTON_UV = ItemList.Electric_Piston_UV.get(1);
        final ItemStack CIRCUIT_MV_2 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 2L);
        final ItemStack CIRCUIT_HV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4L);
        final ItemStack CIRCUIT_EV_8 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 8);
        final ItemStack CIRCUIT_IV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 16);
        final ItemStack CIRCUIT_LUV_32 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 32);
        final ItemStack CIRCUIT_ZPM_64 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Ultimate, 64);
        final ItemStack CIRCUIT_UV_64 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Superconductor, 64);
        final ItemStack CIRCUIT_LV = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 1L);
        final ItemStack CIRCUIT_CONFIG_1 = GT_Utility.getIntegratedCircuit(1);
        final ItemStack CIRCUIT_CONFIG_2 = GT_Utility.getIntegratedCircuit(2);
        final ItemStack CIRCUIT_CONFIG_3 = GT_Utility.getIntegratedCircuit(3);
        final ItemStack IRON_MINECART_WHEEL=ItemList.Component_Minecart_Wheels_Iron.get(1);
        final ItemStack STEEL_MINECART_WHEEL=ItemList.Component_Minecart_Wheels_Iron.get(1);
        final FluidStack NO_FLUID = GT_Values.NF;

        final ItemStack HOPPER = getModItem(ModIds.Minecraft.toString(), "hopper", 1);
        final ItemStack REDSTONE_BLOCK = getModItem(ModIds.Minecraft.toString(), "redstone_block", 1);
        final ItemStack PISTON = getModItem(ModIds.Minecraft.toString(), "piston", 1);
        final ItemStack STICKY_PISTON = getModItem(ModIds.Minecraft.toString(), "sticky_piston", 1);
        final ItemStack ANY_MINECRAFT_PLANK_8 = getModItem(ModIds.Minecraft.toString(), "planks", 8, wildcard);
        final ItemStack CHEST = getModItem(ModIds.Minecraft.toString(), "chest", 1);

        ItemStack[] ANY_PLANK_8 = new ItemStack[]{
                ANY_MINECRAFT_PLANK_8,
                ANY_BOP_PLANK_8,
                ANY_EXTRATREES_PLANK_8,
                ANY_EXTRA_UTILITIES_PLANK_8,
                ANY_FORESTRY_PLANK_8,
                ANY_FORESTRY_FIREPROOF_PLANK_8,
                ANY_NATURA_PLANK_8
        };

        final ItemStack[] storageUpgrades_3 = new ItemStack[]{
                STORAGE_UPGRADE_3,
                STORAGE_UPGRADE_X3_3,
                STORAGE_UPGRADE_X9_3,
                STORAGE_UPGRADE_X27_3,
                STORAGE_UPGRADE_X81_3,
                STORAGE_UPGRADE_X243_3,
                STORAGE_UPGRADE_X729_3,
                STORAGE_UPGRADE_X2187_3
        };

        final ItemStack[] storageUpgrades = new ItemStack[]{
                STORAGE_UPGRADE_X3,
                STORAGE_UPGRADE_X9,
                STORAGE_UPGRADE_X27,
                STORAGE_UPGRADE_X81,
                STORAGE_UPGRADE_X243,
                STORAGE_UPGRADE_X729,
                STORAGE_UPGRADE_X2187,
                STORAGE_UPGRADE_X6561
        };

        final ItemStack[] circuits = new ItemStack[]{
                CIRCUIT_LV,
                CIRCUIT_MV_2,
                CIRCUIT_HV_4,
                CIRCUIT_EV_8,
                CIRCUIT_IV_16,
                CIRCUIT_LUV_32,
                CIRCUIT_ZPM_64
        };

        ItemStack[] pistons = new ItemStack[]{
                ELECTRIC_PISTON_LV,
                ELECTRIC_PISTON_MV,
                ELECTRIC_PISTON_HV,
                ELECTRIC_PISTON_EV,
                ELECTRIC_PISTON_IV,
                ELECTRIC_PISTON_LUV,
                ELECTRIC_PISTON_ZPM
        };

        final ItemStack[] upgradeStructural = new ItemStack[]{
                STRUCTURAL_MK_I,
                STRUCTURAL_MK_II,
                STRUCTURAL_MK_III,
                STRUCTURAL_MK_IV,
                STRUCTURAL_MK_V,
                STRUCTURAL_MK_VI,
                STRUCTURAL_MK_VII,
                STRUCTURAL_MK_VIII,
                STRUCTURAL_MK_IX,
                STRUCTURAL_MK_X,
                STRUCTURAL_MK_XI,
                STRUCTURAL_MK_XII,
                STRUCTURAL_MK_XIII,
                STRUCTURAL_MK_XIV,
        };

        final String[] prefix = new String[]{
                "Wood",
                "Copper",
                "Iron",
                "Bronze",
                "Steel",
                "Aluminium",
                "StainlessSteel",
                "Titanium",
                "TungstenSteel",
                "Rhodium-PlatedPalladium",
                "Iridium",
                "Osmium",
                "Neutronium",
                "BlackPlutonium"
        };


        int euCost;

        for (ItemStack anyPlank8 : ANY_PLANK_8) {
            GT_Values.RA.addAssemblerRecipe(
                    new ItemStack[]{anyPlank8, CHEST},
                    NO_FLUID,
                    BARREL,
                    200,
                    16
            );
        }

        // base storage upgrade
        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                        BARREL,
                        PISTON,
                        CIRCUIT_CONFIG_1
                },
                NO_FLUID,
                STORAGE_UPGRADE,
                1200,
                16);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                        BARREL,
                        STICKY_PISTON,
                        CIRCUIT_CONFIG_1
                },
                NO_FLUID,
                STORAGE_UPGRADE,
                1200,
                16);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                        BARREL,
                        ELECTRIC_PISTON_LV,
                        CIRCUIT_CONFIG_2,
                },
                NO_FLUID,
                STORAGE_UPGRADE,
                1200,
                16);

        //Storage upgrade without recursion
        for(int i=0; i<circuits.length; i++){
            euCost = (int) (30*Math.pow(4,i));

            GT_Values.RA.addAssemblerRecipe(
                    new ItemStack[] {
                            STORAGE_UPGRADE,
                            pistons[i],
                            circuits[i],
                            CIRCUIT_CONFIG_1
                    },
                    NO_FLUID,
                    storageUpgrades[i],
                    1200,
                    euCost
            );
        }

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                        STORAGE_UPGRADE,
                        ELECTRIC_PISTON_UV,
                        CIRCUIT_UV_64,
                        CIRCUIT_UV_64,
                        CIRCUIT_CONFIG_1
                },
                NO_FLUID,
                STORAGE_UPGRADE_X6561,
                1200,
                491520);

        // Storage upgrade with recursion
        for (int i=0; i<storageUpgrades_3.length;i++) {

            euCost = (int) (30*Math.pow(4, i));

            GT_Values.RA.addAssemblerRecipe(
                    new ItemStack[]{
                            storageUpgrades_3[i], CIRCUIT_CONFIG_3
                    },
                    NO_FLUID,
                    storageUpgrades[i],
                    200,
                    euCost
            );
        }

        //Barrel
        addShapedRecipe(BARREL, new Object[] {
                "logWood", "slabWood", "logWood",
                "logWood", CHEST, "logWood",
                "logWood", "logWood", "logWood"
        });

        //Dolly
        addShapedRecipe(DOLLY, new Object[] {
                "stickAnyIron","stickAnyIron","roundAnyRubber",
                "stickAnyIron","craftingToolWrench","roundAnyRubber",
                IRON_MINECART_WHEEL,"plateSteel",IRON_MINECART_WHEEL
        });

        //Diamond Dolly
        addShapedRecipe(DIAMOND_DOLLY, new Object[] {
                "stickDiamond","stickDiamond","roundPlastic",
                "stickDiamond","craftingToolWrench","roundPlastic",
                STEEL_MINECART_WHEEL,"plateNetherStar",STEEL_MINECART_WHEEL
        });

        //Barrel Hammer
        addShapedRecipe(BARREL_HAMMER, new Object[] {
                "ingotIron", "plateAnyIron", "ingotIron",
                "screwAnyIron", "stickAnyIron", "screwAnyIron",
                "craftingToolHardHammer", "stickAnyIron", "craftingToolScrewdriver"
        });

        //BSpace tunning fork
        addShapedRecipe(BSPACE_TUNING_FORK, new Object[] {
                "craftingToolScrewdriver","stickAnyIron",null,
                "screwAnyIron","plateAnyIron","stickAnyIron",
                "stickAnyIron","screwAnyIron","craftingToolHardHammer"
        });

        String stick;
        String plate;
        for (int i=0;i<upgradeStructural.length;i++) {
            stick = "stick"+prefix[i];
            plate = "plate"+prefix[i];

            addShapedRecipe(upgradeStructural[i], new Object[] {
                    stick, plate, stick,
                    plate, BARREL, plate,
                    stick, plate ,stick
            });
        }

        //BSpace upgrade
        addShapedRecipe(BSPACE_UPGRADE, new Object[] {
                "plateEnderEye", "craftingPiston", "plateEnderEye",
                "craftingPiston", ADVANCED_ENDER_CHEST, "craftingPiston",
                "plateEnderEye", "craftingPiston", "plateEnderEye"
        });

        //Redstone upgrade
        addShapedRecipe(REDSTONE_UPGRADE, new Object[] {
                "plateRedAlloy", "craftingPiston", "plateRedAlloy",
                "craftingPiston", REDSTONE_BLOCK, "craftingPiston",
                "plateRedAlloy", "craftingPiston", "plateRedAlloy"
        });

        //hopper upgrade
        addShapedRecipe(HOPPER_UPGRADE, new Object[] {
                "plateIron", "craftingPiston","plateIron",
                "craftingPiston", HOPPER, "craftingPiston",
                "plateIron", "craftingPiston", "plateIron"
        });

        //void upgrade
        addShapedRecipe(VOID_UPGRADE, new Object[] {
                "plateIron","craftingPiston","plateIron",
                "craftingPiston",VOID_CHEST,"craftingPiston",
                "plateIron","craftingPiston","plateIron"
        });

        //storage upgrade
        addShapedRecipe(STORAGE_UPGRADE, new Object[] {
                "screwSteel", "craftingPiston", "screwSteel",
                "screwSteel", BARREL, "screwSteel",
                null, "craftingToolScrewdriver", null
        });
    }
}
