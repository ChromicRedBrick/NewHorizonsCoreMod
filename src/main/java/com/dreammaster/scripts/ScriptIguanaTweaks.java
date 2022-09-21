package com.dreammaster.scripts;

import static gregtech.api.util.GT_ModHandler.getModItem;

import com.dreammaster.item.ItemList;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;

import java.util.Arrays;

public class ScriptIguanaTweaks implements IScriptLoader {
    @Override
    public void initScriptData() {

        scriptName.setLength(0);
        scriptName.append("Iguana Tweaks Tinker Construct");
        dependencies.clear();
        dependencies.addAll(Arrays.asList(
                ModIds.IguanaTweaks.toString(),
                ModIds.Natura.toString()
        ));
    }

    @Override
    public void loadRecipes() {
        final ItemStack UNFIRED_CLAY_BUCKET = getModItem(ModIds.IguanaTweaks.toString(), "clayBucketUnfired", 1);
        final ItemStack CLAY_BUCKET = getModItem(ModIds.IguanaTweaks.toString(), "clayBucketFired", 1);
        final ItemStack WATER_CLAY_BUCKET = getModItem(ModIds.IguanaTweaks.toString(), "clayBucketWater", 1);
        
        final ItemStack CACTUS_JUICE = getModItem(ModIds.Natura.toString(), "waterdrop", 1);

        // --- Unfired Clay Bucket
        // If you change this recipe, be sure to update gregtech.api.enums.OrePrefixes!
        // bucketClay.mSecondaryMaterial controls what the clay bucket pulverizes into.
        addShapedRecipe(UNFIRED_CLAY_BUCKET, new Object[] {
                null, null, null,
                "dustClay", null, "dustClay",
                "dustClay", "dustClay", "dustClay"
        });

        addShapedRecipe(WATER_CLAY_BUCKET, new Object[] {
            CACTUS_JUICE, CACTUS_JUICE, CACTUS_JUICE,
            CACTUS_JUICE, CLAY_BUCKET, CACTUS_JUICE,
            CACTUS_JUICE, CACTUS_JUICE, CACTUS_JUICE
        });

        /*
        oredict so the recipes modified in iguanatweaks will work
        those are exceptionnally in iguanatweaks because the items in the recipes are registered at PostInit
         */
        GT_OreDictUnificator.registerOre("toolHeadSawArdite", ItemList.SawBladeArdite.getIS());
        GT_OreDictUnificator.registerOre("toolHeadSawManyullyn", ItemList.SawBladeManyullyn.getIS());
    }
}
