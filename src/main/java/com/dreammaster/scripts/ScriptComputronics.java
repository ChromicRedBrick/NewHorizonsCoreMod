package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.ItemList;
import fox.spiteful.avaritia.crafting.ExtremeCraftingManager;
import net.minecraft.item.ItemStack;

import java.util.Arrays;

public class ScriptComputronics implements IScriptLoader {

    public ScriptComputronics() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("Computronics");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.Avaritia.toString(),
                ModIds.Computronics.toString(),
                ModIds.GregTech.toString(),
                ModIds.OpenComputers.toString(),
                ModIds.Thaumcraft.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack SALIS_MUNDUS = getModItem(ModIds.Thaumcraft.toString(), "ItemResource", 1, 14);

        final ItemStack APU_T3 = getModItem(ModIds.OpenComputers.toString(), "item", 1, 103);

        final ItemStack PIKO_POWER_IC = ItemList.Circuit_Chip_PPIC.get(1);

        final ItemStack EXTREMELY_PRIMORDIAL_PEARL = getModItem(ModIds.Avaritia.toString(), "big_pearl", 1);

        final ItemStack MAGICAL_MEMORY = getModItem("computronics", "computronics.ocSpecialParts", 1);

        ExtremeCraftingManager.getInstance()
                .addExtremeShapedOreRecipe(
                        MAGICAL_MEMORY,
                        "aaaaaaaaa",
                        "abbbbbbbc",
                        "abdefedbc",
                        "abgggggbc",
                        "abdhihdbc",
                        "abgggggbc",
                        "abdefedbc",
                        "abbbbbbbc",
                        "aaaaaaaaa",
                        'a',
                        "plateNeutronium",
                        'b',
                        "oc:ram6",
                        'c',
                        "wireGt04ElectrumFlux",
                        'd',
                        "circuitBio",
                        'e',
                        SALIS_MUNDUS,
                        'f',
                        APU_T3,
                        'g',
                        PIKO_POWER_IC,
                        'h',
                        "ingotInfinity",
                        'i',
                        EXTREMELY_PRIMORDIAL_PEARL);
    }
}
