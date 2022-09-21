package com.dreammaster.scripts;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import gregtech.common.items.GT_MetaGenerated_Item_02;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

import static gregtech.api.util.GT_ModHandler.addShapelessCraftingRecipe;
import static gregtech.api.util.GT_ModHandler.getModItem;

import java.util.Arrays;

public class ScriptArchitectureCraft implements IScriptLoader {

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("Architecture Craft");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.ArchitectureCraft.toString(),
                ModIds.GregTech.toString(),
                ModIds.TinkerConstruct.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack SAWBENCH = getModItem(ModIds.ArchitectureCraft.toString(), "sawbench", 1);
        final ItemStack SAW_BLADE = getModItem(ModIds.ArchitectureCraft.toString(), "sawblade", 1);
        final ItemStack LARGE_PULLEY = getModItem(ModIds.ArchitectureCraft.toString(), "largePulley", 1);
        final ItemStack HAMMER = getModItem(ModIds.ArchitectureCraft.toString(), "hammer", 1);
        final ItemStack CHISEL = getModItem(ModIds.ArchitectureCraft.toString(), "chisel", 1);

        final ItemStack HEAVY_WEIGHTED_PRESSURE_PLATE = getModItem(ModIds.Minecraft.toString(), "heavy_weighted_pressure_plate", 1);

        final ItemStack OAK_BARRICADE = getModItem(ModIds.TinkerConstruct.toString(), "trap.barricade.oak", 1);

        final ItemStack GT_IRON_BUZZSAW_BLADE = GT_OreDictUnificator.get(OrePrefixes.toolHeadBuzzSaw, Materials.Iron, 1);

        addShapedRecipe(SAWBENCH, new Object[] {
            "screwSteel", HEAVY_WEIGHTED_PRESSURE_PLATE, "screwSteel",
            OAK_BARRICADE, SAW_BLADE, OAK_BARRICADE,
            "craftingToolScrewdriver", LARGE_PULLEY, "craftingToolHardHammer"
        });

        addShapedRecipe(LARGE_PULLEY, new Object[] {
            "screwSteel", "craftingToolScrewdriver", "screwSteel",
            "gearGtSmallAnyIron", "gearWood", "gearGtSmallAnyIron",
            "screwSteel", "craftingToolHardHammer", "screwSteel"
        });

        addShapedRecipe(HAMMER, new Object[] {
            "plateSteel", "plateSteel", "ingotIron",
            "craftingToolFile", "stickWood", "ingotIron",
            null, "stickWood", "craftingToolHardHammer"
        });

        addShapedRecipe(CHISEL, new Object[] {
            "craftingToolHardHammer", "plateIron", "plateSteel",
            "screwIron", "stickIron", "plateIron",
            "stickWood", "screwIron", "craftingToolScrewdriver"
        });

        addShapelessCraftingRecipe(SAW_BLADE, new Object[] {"toolHeadBuzzSawAnyIron"});

        addShapelessCraftingRecipe(GT_IRON_BUZZSAW_BLADE, new Object[] {SAW_BLADE});
    }
}
