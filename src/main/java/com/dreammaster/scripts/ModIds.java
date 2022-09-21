package com.dreammaster.scripts;

public enum ModIds {

    AE2FC("ae2fc"),
    AE2("appliedenergistics2"),
    AFSU("AFSU"),
    ArchitectureCraft("ArchitectureCraft"),
    Avaritia("Avaritia"),
    AvaritiaAddons("avaritiaddons"),
    BetterQuesting("betterquesting"),
    BiblioCraft("BiblioCraft"),
    BiblioWoodsBOP("BiblioWoodsBoP"),
    BiomesOPlanty("BiomesOPlenty"),
    Computronics("computronics"),
    EnderIO("EnderIO"),
    EnderZoo("EnderZoo"),
    EternalSingularity("eternalsingularity"),
    ExtraBees("ExtraBees"),
    ExtraCells("extracells"),
    FloodLights("FloodLights"),
    Forestry("Forestry"),
    ForgeMicroblocks("ForgeMicroblock"),
    GregTech("gregtech"),
    Gendustry("gendustry"),
    HoloInventory("holoinventory"),
    IronChests("IronChest"),
    Minecraft("minecraft"),
    OpenComputers("OpenComputers"),
    PamsHarvestCraft("harvestcraft"),
    Thaumcraft("Thaumcraft"),
    TinkerConstruct("TConstruct"),
    Witchery("witchery");

    private String modId;

    ModIds(String ModId) {
        this.modId = modId;
    }

    @Override
    public String toString(){
        return this.modId;
    }
}
