package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import com.dreammaster.gthandler.CustomItemList;
import cpw.mods.fml.common.registry.GameRegistry;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.api.util.GT_Utility;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import shedar.mods.ic2.nuclearcontrol.gui.ConfigGui;

import java.util.Map;

public class ScriptAE2FC implements IScriptLoader {

    public ScriptAE2FC() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("AE2FC");
        dependencies.clear();
        dependencies.addAll(java.util.Arrays.asList(
                ModIds.AE2FC.toString(),
                ModIds.AE2.toString(),
                ModIds.ExtraCells.toString(),
                ModIds.OpenComputers.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack AE2_INTERFACE = getModItem(ModIds.AE2.toString(), "tile.BlockInterface", 1);
        final ItemStack AE2_PROCESS_ENG = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 24);
        final ItemStack AE2_STORAGE_BUS = getModItem(ModIds.AE2.toString(), "item.ItemMultiPart", 1, 220);
        final ItemStack AE2_GLASS_CABLE = getModItem(ModIds.AE2.toString(), "item.ItemMultiPart", 1, 16);
        final ItemStack AE2_PROCESS_CAL = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 23);
        final ItemStack AE2_WORK_BENCH = getModItem(ModIds.AE2.toString(), "tile.BlockCellWorkbench", 1);
        final ItemStack AE2_PATTERN_TERM = getModItem(ModIds.AE2.toString(), "item.ItemMultiPart", 1, 340);
        final ItemStack AE2_PROCESS_LOG = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 22);
        final ItemStack AE2_QUARTZ_GLASS = getModItem(ModIds.AE2.toString(), "tile.BlockQuartzGlass", 1);
        final ItemStack AE2_LAMP_GLASS = getModItem(ModIds.AE2.toString(), "tile.BlockQuartzLamp", 1);
        final ItemStack AE2_CELL_HOUSING = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 39);
        final ItemStack AE2_CORE_ANN = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 44);
        final ItemStack AE2_CORE_FOM = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 43);
        final ItemStack AE2_BLANK_PATTERN = getModItem(ModIds.AE2.toString(), "item.ItemMultiMaterial", 1, 52);
        final ItemStack BUCKET = new ItemStack(Items.bucket, 1);
        final ItemStack IRON_BAR = new ItemStack(Blocks.iron_bars, 1);
        final ItemStack IRON_PLATE = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Iron, 1L);
        final ItemStack LAPIS_PLATE = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Lapis, 1L);
        final ItemStack NIOBIUM_PLATE = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NiobiumTitanium, 1L);
        final ItemStack NETHER_QUARTZ_PLATE = GT_OreDictUnificator.get(OrePrefixes.plate, Materials.NetherQuartz, 1L);
        final ItemStack LAPIS_SCREW = GT_OreDictUnificator.get(OrePrefixes.screw, Materials.Lapis, 1L);

        final ItemStack FLUID_CORE_1 = com.dreammaster.item.ItemList.EngineeringProcessorFluidDiamondCore.getIS();

        final ItemStack CELL_1 = getModItem(ModIds.AE2FC.toString(), "fluid_storage1", 1, 0);
        final ItemStack CELL_4 = getModItem(ModIds.AE2FC.toString(), "fluid_storage4", 1, 0);
        final ItemStack CELL_16 = getModItem(ModIds.AE2FC.toString(), "fluid_storage16", 1, 0);
        final ItemStack CELL_64 = getModItem(ModIds.AE2FC.toString(), "fluid_storage64", 1, 0);
        final ItemStack CELL_256 = getModItem(ModIds.AE2FC.toString(), "fluid_storage256", 1, 0);
        final ItemStack CELL_1024 = getModItem(ModIds.AE2FC.toString(), "fluid_storage1024", 1, 0);
        final ItemStack CELL_4096 = getModItem(ModIds.AE2FC.toString(), "fluid_storage4096", 1, 0);
        final ItemStack COMPONENT_1 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 0);
        final ItemStack COMPONENT_4 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 1);
        final ItemStack COMPONENT_16 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 2);
        final ItemStack COMPONENT_64 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 3);
        final ItemStack COMPONENT_256 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 4);
        final ItemStack COMPONENT_1024 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 5);
        final ItemStack COMPONENT_4096 = getModItem(ModIds.AE2FC.toString(), "fluid_part", 1, 6);
        final ItemStack AE2FC_INTERFACE = getModItem(ModIds.AE2FC.toString(), "fluid_interface", 1, 0);
        final ItemStack AE2FC_INTERFACE_SMALL = getModItem(ModIds.AE2FC.toString(), "part_fluid_interface", 1, 0);
        final ItemStack AE2FC_DISCRETIZER = getModItem(ModIds.AE2FC.toString(), "fluid_discretizer", 1, 0);
        final ItemStack AE2FC_ENCODER = getModItem(ModIds.AE2FC.toString(), "fluid_pattern_encoder", 1, 0);
        final ItemStack AE2FC_DECODER = getModItem(ModIds.AE2FC.toString(), "fluid_packet_decoder", 1, 0);
        final ItemStack AE2FC_BUFFER = getModItem(ModIds.AE2FC.toString(), "ingredient_buffer", 1, 0);
        final ItemStack AE2FC_BUFFER_LARGE = getModItem(ModIds.AE2FC.toString(), "large_ingredient_buffer", 1, 0);
        final ItemStack AE2FC_TERMINAL = getModItem(ModIds.AE2FC.toString(), "part_fluid_pattern_terminal", 1, 0);
        final ItemStack AE2FC_TERMINAL_PRO = getModItem(ModIds.AE2FC.toString(), "part_fluid_pattern_terminal_ex", 1, 0);
        final ItemStack AE2FC_EXPORTBUS = getModItem(ModIds.AE2FC.toString(), "part_fluid_export", 1, 0);
        final ItemStack AE2FC_IMPORTBUS = getModItem(ModIds.AE2FC.toString(), "part_fluid_import", 1, 0);
        final ItemStack AE2FC_OCEDITOR = getModItem(ModIds.AE2FC.toString(), "oc_pattern_editor", 1, 0);

        final ItemStack CHARGED_CERTUS_QUARTZ = CustomItemList.ChargedCertusQuartzDust.get(1);

        final ItemStack ELECTRIC_PUMP_MV = ItemList.Electric_Pump_EV.get(1);
        final ItemStack ASSEMBLING_MACHINE_HV = ItemList.Machine_HV_Assembler.get(1);
        final ItemStack DISASSEMBLER_HV = ItemList.Machine_HV_Disassembler.get(1);
        final ItemStack SUPER_TANK_I = ItemList.Super_Tank_LV.get(1);
        final ItemStack SUPER_CHEST_I = ItemList.Super_Chest_LV.get(1);
        final ItemStack CONVEYOR_MODULE_LUV = ItemList.Conveyor_Module_LuV.get(1);
        final ItemStack ELECTRIC_MOTOR_LUV = ItemList.Electric_Motor_LuV.get(1);
        final ItemStack ROBOT_ARM_LUV = ItemList.Robot_Arm_LuV.get(1);
        final ItemStack ELECTRIC_PISTON_LV = ItemList.Electric_Piston_LV.get(1);
        final ItemStack CHARGED_CERTUS_QUARTZ_DUST_2 = CustomItemList.ChargedCertusQuartzDust.get(2);
        final ItemStack ELECTRIC_PUMP_LV = ItemList.Electric_Pump_LV.get(1);
        final ItemStack COATED_CIRCUIT_BOARD = ItemList.Circuit_Board_Basic.get(1);
        final ItemStack CIRCUIT_ULV_2 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Primitive, 2);
        final ItemStack CIRCUIT_CONFIG_1 = GT_Utility.getIntegratedCircuit(1);
        final ItemStack CIRCUIT_LV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 4);
        final ItemStack CIRCUIT_ULV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Primitive, 16);
        final ItemStack ELECTRIC_PUMP_LV_2 = ItemList.Electric_Pump_LV.get(2);
        final ItemStack CIRCUIT_BOARD = ItemList.Circuit_Board_Coated_Basic.get(1);
        final ItemStack CIRCUIT_MV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 4);
        final ItemStack CIRCUIT_LV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Basic, 16);
        final ItemStack GOOD_CIRCUIT_BOARD = ItemList.Circuit_Board_Phenolic_Good.get(1);
        final ItemStack CIRCUIT_HV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 4);
        final ItemStack CIRCUIT_MV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Good, 16);
        final ItemStack ELECTRIC_PUMP_MV_2 = ItemList.Electric_Pump_MV.get(2);
        final ItemStack ADVANCED_CIRCUIT_BOARD = ItemList.Circuit_Board_Epoxy_Advanced.get(1);
        final ItemStack CIRCUIT_EV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 4);
        final ItemStack CIRCUIT_HV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Advanced, 16);
        final ItemStack ELECTRIC_PUMP_HV = ItemList.Electric_Pump_HV.get(1);
        final ItemStack MORE_ADVANCED_CIRCUIT_BOARD = ItemList.Circuit_Board_Epoxy_Advanced.get(1);
        final ItemStack CIRCUIT_IV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 4);
        final ItemStack CIRCUIT_EV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Data, 16);
        final ItemStack ELECTRIC_PUMP_HV_2 = ItemList.Electric_Pump_HV.get(2);
        final ItemStack ELITE_CIRCUIT_BOARD = ItemList.Circuit_Board_Multifiberglass_Elite.get(1);
        final ItemStack CIRCUIT_LUV_4 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Master, 4);
        final ItemStack CIRCUIT_IV_16 = GT_OreDictUnificator.get(OrePrefixes.circuit, Materials.Elite, 16);
        final ItemStack ELECTRIC_PUMP_EV = ItemList.Electric_Pump_EV.get(2);
        final ItemStack EXTREME_WETWARE_LIFESUPPORT_CIRCUIT_BOARD = ItemList.Circuit_Board_Wetware_Extreme.get(1);

        final ItemStack CHIP_T1 = getModItem("OpenComputers", "item", 1, 24);

        final ItemStack[] cells = new ItemStack[]{CELL_1, CELL_4, CELL_16, CELL_64, CELL_256, CELL_1024, CELL_4096};

        final ItemStack[] components = new ItemStack[]{
                COMPONENT_1, COMPONENT_4, COMPONENT_16, COMPONENT_64, COMPONENT_256, COMPONENT_1024, COMPONENT_4096
        };

        for (int i = 0; i < cells.length; i++) {
            GameRegistry.addShapelessRecipe(cells[i], new Object[]{AE2_CELL_HOUSING, components[i]});
            addShapedRecipe(cells[i], new Object[]{
                    AE2_QUARTZ_GLASS, "dustRedstone", AE2_QUARTZ_GLASS,
                    "dustRedstone", components[i], "dustRedstone",
                    "ingotIron", "ingotIron", "ingotIron"
            });
        }

        // recursive components for those who want to do this weird stuff
        addShapedRecipe(COMPONENT_1, new Object[]{
                "dyeBlue", CHARGED_CERTUS_QUARTZ, "dyeBlue",
                CHARGED_CERTUS_QUARTZ, AE2_PROCESS_ENG, CHARGED_CERTUS_QUARTZ,
                "dyeBlue", CHARGED_CERTUS_QUARTZ, "dyeBlue"
        });

        addShapedRecipe(COMPONENT_4, new Object[]{
                "dyeBlue", AE2_PROCESS_CAL, "dyeBlue",
                COMPONENT_1, AE2_QUARTZ_GLASS, COMPONENT_1,
                "dyeBlue", COMPONENT_1, "dyeBlue"
        });

        addShapedRecipe(COMPONENT_16, new Object[]{
                "dyeBlue", AE2_PROCESS_LOG, "dyeBlue",
                COMPONENT_4, AE2_QUARTZ_GLASS, COMPONENT_4,
                "dyeBlue", COMPONENT_4, "dyeBlue"
        });

        addShapedRecipe(COMPONENT_64, new Object[]{
                "dyeBlue", AE2_PROCESS_ENG, "dyeBlue",
                COMPONENT_16, AE2_QUARTZ_GLASS, COMPONENT_16,
                "dyeBlue", COMPONENT_16, "dyeBlue"
        });

        addShapedRecipe(COMPONENT_256, new Object[]{
                "dyeBlue", AE2_PROCESS_CAL, "dyeBlue",
                COMPONENT_64, AE2_LAMP_GLASS, COMPONENT_64,
                "dyeBlue", COMPONENT_64, "dyeBlue"
        });

        addShapedRecipe(COMPONENT_1024, new Object[]{
                "dyeBlue", AE2_PROCESS_LOG, "dyeBlue",
                COMPONENT_256, AE2_LAMP_GLASS, COMPONENT_256,
                "dyeBlue", COMPONENT_256, "dyeBlue"
        });

        addShapedRecipe(COMPONENT_4096, new Object[]{
                "dyeBlue", AE2_PROCESS_ENG, "dyeBlue",
                COMPONENT_1024, AE2_LAMP_GLASS, COMPONENT_1024,
                "dyeBlue", COMPONENT_1024, "dyeBlue"
        });

        // interface
        addShapedRecipe(AE2FC_INTERFACE, new Object[] {
                IRON_PLATE, LAPIS_PLATE, IRON_PLATE,
                FLUID_CORE_1, AE2_INTERFACE, FLUID_CORE_1,
                IRON_PLATE, LAPIS_PLATE, IRON_PLATE
        });

        // Fluid discretizer
        addShapedRecipe(AE2FC_DISCRETIZER, new Object[] {
                IRON_PLATE, BUCKET, IRON_PLATE,
                AE2_STORAGE_BUS, ELECTRIC_PUMP_MV, AE2_STORAGE_BUS,
                IRON_PLATE, AE2_PROCESS_ENG, IRON_PLATE
        });

        // Fluid encoder
        addShapedRecipe(AE2FC_ENCODER, new Object[] {
                LAPIS_PLATE, ASSEMBLING_MACHINE_HV, LAPIS_PLATE,
                IRON_PLATE, AE2_WORK_BENCH, IRON_PLATE,
                IRON_PLATE, IRON_PLATE, IRON_PLATE
        });

        // Fluid decoder
        addShapedRecipe(AE2FC_DECODER, new Object[] {
                IRON_PLATE, DISASSEMBLER_HV, IRON_PLATE,
                AE2_GLASS_CABLE, AE2_WORK_BENCH, AE2_GLASS_CABLE,
                IRON_PLATE, IRON_PLATE, IRON_PLATE
        });

        // Ingredient Buffer
        addShapedRecipe(AE2FC_BUFFER, new Object[] {
                IRON_PLATE, FLUID_CORE_1, IRON_PLATE,
                BUCKET, AE2_WORK_BENCH, BUCKET,
                IRON_PLATE, AE2_PROCESS_CAL, IRON_PLATE
        });

        // Large Ingredient Buffer
        addShapedRecipe(AE2FC_BUFFER_LARGE, new Object[] {
                NIOBIUM_PLATE, FLUID_CORE_1, NIOBIUM_PLATE,
                SUPER_TANK_I, AE2FC_BUFFER, SUPER_CHEST_I,
                NIOBIUM_PLATE, AE2_PROCESS_CAL, NIOBIUM_PLATE
        });

        // Fluid Terminal
        addShapedRecipe(AE2FC_TERMINAL, new Object[] {
                NIOBIUM_PLATE, FLUID_CORE_1, NIOBIUM_PLATE,
                BUCKET, AE2_PATTERN_TERM, BUCKET,
                NIOBIUM_PLATE, AE2_PROCESS_CAL, NIOBIUM_PLATE
        });

        // Fluid Processing Terminal
        addShapedRecipe(AE2FC_TERMINAL_PRO, new Object[] {
                LAPIS_PLATE, AE2FC_TERMINAL, LAPIS_PLATE,
                CONVEYOR_MODULE_LUV, AE2_CORE_ANN, CONVEYOR_MODULE_LUV,
                ELECTRIC_MOTOR_LUV, ROBOT_ARM_LUV, ELECTRIC_MOTOR_LUV
        });

        // Fluid Export Bus
        addShapedRecipe(AE2FC_EXPORTBUS, new Object[] {
                IRON_PLATE, LAPIS_PLATE, IRON_PLATE,
                LAPIS_SCREW, AE2_CORE_FOM, LAPIS_SCREW,
                NETHER_QUARTZ_PLATE, ELECTRIC_PISTON_LV, NETHER_QUARTZ_PLATE
        });

        // Fluid Import Bus
        addShapedRecipe(AE2FC_IMPORTBUS, new Object[] {
                IRON_PLATE, LAPIS_PLATE, IRON_PLATE,
                LAPIS_SCREW, AE2_CORE_ANN, LAPIS_SCREW,
                NETHER_QUARTZ_PLATE, ELECTRIC_PISTON_LV, NETHER_QUARTZ_PLATE
        });

        // Interface from Small to Block and opposite
        GameRegistry.addShapelessRecipe(AE2FC_INTERFACE_SMALL, AE2FC_INTERFACE);
        GameRegistry.addShapelessRecipe(AE2FC_INTERFACE, AE2FC_INTERFACE_SMALL);

        // OC Component
        addShapedRecipe(AE2FC_OCEDITOR, new Object[] {
            IRON_BAR, CHIP_T1, IRON_BAR,
            "oc:cable", BUCKET, "oc:cable",
            IRON_BAR, AE2_BLANK_PATTERN, IRON_BAR

        });

        Materials[] assemblingFluid = new Materials[]{Materials.Lead, Materials.Tin, Materials.SolderingAlloy};
        int[] assemblingFluidQuantities = new int[]{288, 144, 72};

        // 1k ME Storage Component
        for (int i = 0; i < assemblingFluid.length; i++) {
            GT_Values.RA.addCircuitAssemblerRecipe(
                    new ItemStack[]{
                            CIRCUIT_ULV_2,
                            CHARGED_CERTUS_QUARTZ_DUST_2,
                            ELECTRIC_PUMP_LV,
                            COATED_CIRCUIT_BOARD,
                            CIRCUIT_CONFIG_1
                    },
                    assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                    COMPONENT_1,
                    200,
                    30,
                    false);

        // 4k ME Storage Component
        GT_Values.RA.addCircuitAssemblerRecipe(
                new ItemStack[]{
                        CIRCUIT_LV_4,
                        CIRCUIT_ULV_16,
                        ELECTRIC_PUMP_LV_2,
                        CIRCUIT_BOARD,
                        CIRCUIT_CONFIG_1
                },
                assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                COMPONENT_4,
                200,
                30,
                true);

        // 16k ME Storage Component
        GT_Values.RA.addCircuitAssemblerRecipe(
                new ItemStack[]{
                        CIRCUIT_MV_4,
                        CIRCUIT_LV_16,
                        ELECTRIC_PUMP_MV,
                        GOOD_CIRCUIT_BOARD,
                        CIRCUIT_CONFIG_1
                },
                assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                COMPONENT_16,
                200,
                120,
                true);

        // 64k ME Storage Component
        GT_Values.RA.addCircuitAssemblerRecipe(
                new ItemStack[]{
                        CIRCUIT_HV_4,
                        CIRCUIT_MV_16,
                        ELECTRIC_PUMP_MV_2,
                        ADVANCED_CIRCUIT_BOARD,
                        CIRCUIT_CONFIG_1
                },
                assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                COMPONENT_64,
                200,
                480,
                true);

        // 256k ME Storage Component
        GT_Values.RA.addCircuitAssemblerRecipe(
                new ItemStack[]{
                        CIRCUIT_EV_4,
                        CIRCUIT_HV_16,
                        ELECTRIC_PUMP_HV,
                        MORE_ADVANCED_CIRCUIT_BOARD,
                        CIRCUIT_CONFIG_1
                },
                assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                COMPONENT_256,
                200,
                1920,
                true);

        // 1024k ME Storage Component
        GT_Values.RA.addCircuitAssemblerRecipe(
                new ItemStack[]{
                        CIRCUIT_IV_4,
                        CIRCUIT_EV_16,
                        ELECTRIC_PUMP_HV_2,
                        ELITE_CIRCUIT_BOARD,
                        CIRCUIT_CONFIG_1
                },
                assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                COMPONENT_1024,
                200,
                7680,
                true);

        // 4096k ME Storage Component
        GT_Values.RA.addCircuitAssemblerRecipe(
                new ItemStack[]{
                        CIRCUIT_LUV_4,
                        CIRCUIT_IV_16,
                        ELECTRIC_PUMP_EV,
                        EXTREME_WETWARE_LIFESUPPORT_CIRCUIT_BOARD,
                        CIRCUIT_CONFIG_1
                },
                assemblingFluid[i].getMolten(assemblingFluidQuantities[i]),
                COMPONENT_4096,
                200,
                30720,
                true);
        }
    }
}
