package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.addShapelessCraftingRecipe;
import static gregtech.api.util.GT_ModHandler.getModItem;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import fox.spiteful.avaritia.Config;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import sun.plugin2.util.ParameterNames;

public class ScriptAvaritiaAddons implements IScriptLoader {
    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("Avaritia addons");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.Avaritia.toString(),
                ModIds.AvaritiaAddons.toString(),
                ModIds.EternalSingularity.toString(),
                ModIds.ExtraCells.toString(),
                ModIds.GregTech.toString(),
                ModIds.Witchery.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack DIRE_CRAFTING_TABLE = getModItem(ModIds.Avaritia.toString(), "Dire_Crafting", 1);
        final ItemStack DIAMOND_LATTICE = getModItem(ModIds.Avaritia.toString(), "Resource", 1);
        final ItemStack INFINITY_CATALYST = getModItem(ModIds.Avaritia.toString(), "Resource", 1, 5);

        final ItemStack COMPRESSED_CHEST = getModItem(ModIds.AvaritiaAddons.toString(), "CompressedChest", 1);
        final ItemStack DIRE_AUTOCRAFTING_TABLE = getModItem(ModIds.AvaritiaAddons.toString(), "ExtremeAutoCrafter", 1);
        final ItemStack ANY_DIRE_AUTOCRAFTING_TABLE = getModItem(ModIds.AvaritiaAddons.toString(), "ExtremeAutoCrafter", 1, wildcard);
        final ItemStack INFINITY_CHEST = getModItem(ModIds.AvaritiaAddons.toString(), "InfinityChest", 1);

        final ItemStack  ETERNAL_SINGULARITY = getModItem(ModIds.EternalSingularity.toString(), "eternal_singularity", 1);

        final ItemStack ME_STORAGE_COMPONENT_16384k = getModItem(ModIds.ExtraCells.toString(), "storage.component", 1, 3);

        final ItemStack OBSIDIAN_CHEST = getModItem(ModIds.IronChests.toString(), "BlockIronChest", 1, 6);
        final ItemStack DIAMOND_CHEST = getModItem(ModIds.IronChests.toString(), "BlockIronChest", 1, 2);
        final ItemStack DIAMOND_CHEST_2 = getModItem(ModIds.IronChests.toString(), "BlockIronChest", 2, 2);

        final ItemStack ELECTRIC_PISTON_HV = ItemList.Electric_Piston_HV.get(1);
        final ItemStack ELECTRIC_MOTOR_EV = ItemList.Electric_Motor_EV.get(1);
        final ItemStack CONVEYOR_MODULE_EV = ItemList.Conveyor_Module_EV.get(1);
        final ItemStack CRAFTING_TABLE_COVER = ItemList.Cover_Crafting.get(1);
        final ItemStack QUANTUM_CHEST_V = ItemList.Quantum_Chest_IV.get(1);
        final ItemStack DENSE_OBSIDIAN_PLATE_4 = GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Obsidian, 4);
        final ItemStack DENSE_OBSIDIAN_PLATE_2 = GT_OreDictUnificator.get(OrePrefixes.plateDense, Materials.Obsidian, 2);
        final ItemStack CIRCUIT_CONFIG_1 = GT_Utility.getIntegratedCircuit(1);
        final ItemStack CIRCUIT_CONFIG_2 = GT_Utility.getIntegratedCircuit(2);
        final FluidStack NO_FLUID = GT_Values.NF;

        final ItemStack DRAGON_EGG = getModItem(ModIds.Minecraft.toString(), "dragon_egg", 1);

        final ItemStack INFINITY_EGG = getModItem(ModIds.Witchery.toString(), "infinityegg", 1);
        final ItemStack DEMON_HEART = getModItem(ModIds.Witchery.toString(), "ingredient", 1, 23);
        final ItemStack STEW = getModItem(ModIds.Witchery.toString(), "stew", 1);
        final ItemStack INFERNAL_CHALK = getModItem(ModIds.Witchery.toString(), "chalkinfernal", 1);
        final ItemStack OTHERWHERE_CHALK = getModItem(ModIds.Witchery.toString(), "chalkotherwhere", 1);

        addShapedRecipe(COMPRESSED_CHEST, new Object[] {
            "plateDenseObsidian", "plateDenseObsidian", "plateDenseObsidian",
            "chestDiamond", ELECTRIC_PISTON_HV, "chestDiamond",
            "plateDenseObsidian", "plateDenseObsidian", "plateDenseObsidian"
        });
        addShapedRecipe(COMPRESSED_CHEST, new Object[] {
            "stickObsidian", ELECTRIC_PISTON_HV, "stickObsidian",
            "plateDenseObsidian", "chestObsidian", "plateDenseObsidian",
            "craftingToolWrench", "chestDiamond", "craftingToolScrewdriver"
        });

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    DIAMOND_CHEST_2,
                    ELECTRIC_PISTON_HV,
                    DENSE_OBSIDIAN_PLATE_4,
                    CIRCUIT_CONFIG_1,
                },
                NO_FLUID,
                COMPRESSED_CHEST,
                600,
                480);

        GT_Values.RA.addAssemblerRecipe(
                new ItemStack[] {
                    OBSIDIAN_CHEST,
                    DIAMOND_CHEST,
                    ELECTRIC_PISTON_HV,
                    DENSE_OBSIDIAN_PLATE_2,
                    CIRCUIT_CONFIG_2,
                },
                NO_FLUID,
                COMPRESSED_CHEST,
                600,
                480);

        addShapedRecipe(DIRE_AUTOCRAFTING_TABLE, new Object[] {
            "plateRedAlloy", CRAFTING_TABLE_COVER, "plateRedAlloy",
            ELECTRIC_MOTOR_EV, DIRE_CRAFTING_TABLE, ELECTRIC_MOTOR_EV,
            CONVEYOR_MODULE_EV, "circuitElite", CONVEYOR_MODULE_EV
        });

        // clearing NBT of the dire autocrafting table
        addShapelessCraftingRecipe(DIRE_AUTOCRAFTING_TABLE, new Object[] {ANY_DIRE_AUTOCRAFTING_TABLE, "platePaper"});

        // Infinity Chest
        ExtremeCraftingManager.getInstance()
                .addExtremeShapedOreRecipe(
                        INFINITY_CHEST,
                        "abbbcbbba",
                        "bddefeddb",
                        "bbbbabbbb",
                        "bbbbabbbb",
                        "cgggggggc",
                        "bghhhhhgb",
                        "bghhhhhgb",
                        "bgggggggb",
                        "abbbcbbba",
                        'a',
                        "blockCosmicNeutronium",
                        'b',
                        DIAMOND_LATTICE,
                        'c',
                        "blockInfinity",
                        'd',
                        "ingotInfinity",
                        'e',
                        INFINITY_CATALYST,
                        'f',
                        ETERNAL_SINGULARITY,
                        'g',
                        QUANTUM_CHEST_V,
                        'h',
                        ME_STORAGE_COMPONENT_16384k
                );

        // Infinity Egg (Witchery)
        if (Config.witch) {
            ExtremeCraftingManager.getInstance()
                    .addExtremeShapedOreRecipe(
                            INFINITY_EGG,
                            " NNNNNNN ",
                            "NCIIAIICN",
                            "NIIIDIIIN",
                            "NIIDHDIIN",
                            "NAIHEHIAN",
                            "NIIDHDIIN",
                            "NIIIDIIIN",
                            "NCIIAIICN",
                            " NNNNNNN ",
                            'D',
                            DEMON_HEART,
                            'N',
                            "plateCosmicNeutronium",
                            'H',
                            DRAGON_EGG,
                            'E',
                            STEW,
                            'C',
                            INFERNAL_CHALK,
                            'A',
                            OTHERWHERE_CHALK,
                            'I',
                            "plateInfinity");
        }
    }
}
