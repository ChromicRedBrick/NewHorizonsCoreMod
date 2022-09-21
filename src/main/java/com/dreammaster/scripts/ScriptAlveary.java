package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import gregtech.api.enums.ItemList;
import net.minecraft.item.ItemStack;

public class ScriptAlveary implements IScriptLoader {

    public ScriptAlveary() {}

    @Override
    public void initScriptData() {
        scriptName.setLength(0);
        scriptName.append("Alveary");
        dependencies.clear();
        dependencies.addAll(java.util.Arrays.asList(
                ModIds.Forestry.toString(),
                ModIds.GregTech.toString(),
                ModIds.Gendustry.toString(),
                ModIds.ExtraBees.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack Alveary_1 = getModItem(ModIds.ExtraBees.toString(), "alveary", 1, 1);
        final ItemStack Alveary_3 = getModItem(ModIds.ExtraBees.toString(), "alveary", 1, 3);
        final ItemStack Alveary_7 = getModItem(ModIds.Forestry.toString(), "alveary", 1, 7);
        final ItemStack Chipset_1 = getModItem(ModIds.Forestry.toString(), "chipsets", 1, 1);
        final ItemStack ROBOT_ARM_HV = ItemList.Robot_Arm_HV.get(1);
        final ItemStack FR_CASING_STURDY = ItemList.FR_Casing_Sturdy.get(1);
        final ItemStack INDUSTRIAL_APIARY = ItemList.Machine_IndustrialApiary.get(1);

        addShapedRecipe(INDUSTRIAL_APIARY, new Object[] {
            Alveary_1, Chipset_1, Alveary_1,
            ROBOT_ARM_HV, FR_CASING_STURDY, ROBOT_ARM_HV,
            Alveary_3, Alveary_7, Alveary_3
        });
    }
}
