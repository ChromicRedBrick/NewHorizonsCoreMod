package com.dreammaster.scripts;

public enum ModIds {

    AE2FC("ae2fc"),
    AE2("appliedenergistics2"),
    AFSU("AFSU"),
    ArchitectureCraft("ArchitectureCraft"),
    Avaritia("Avaritia"),
    AvaritiaAddons("avaritiaddons"),
    BetterQuesting("betterquesting"),
    EternalSingularity("eternalsingularity"),
    ExtraBees("ExtraBees"),
    ExtraCells("extracells"),
    Forestry("Forestry"),
    GregTech("gregtech"),
    Gendustry("gendustry"),
    OpenComputers("OpenComputers"),
    BiblioCraft("BiblioCraft"),
    PamsHarvestCraft("harvestcraft"),
    FloodLights("FloodLights"),
    BiomesOPlanty("BiomesOPlenty"),
    BiblioWoodsBOP("BiblioWoodsBoP"),




    ;








    private String modId;

    ModIds(String ModId) {
        this.modId = modId;
    }

    @Override
    public String toString(){
        return this.modId;
    }
}
