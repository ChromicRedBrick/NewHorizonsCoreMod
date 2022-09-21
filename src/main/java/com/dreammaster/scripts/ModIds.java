package com.dreammaster.scripts;

public enum ModIds {

    AdventureBackpack("adventurebackpack"),
    AE2FC("ae2fc"),
    AE2("appliedenergistics2"),
    AFSU("AFSU"),
    ArchitectureCraft("ArchitectureCraft"),
    Avaritia("Avaritia"),
    AvaritiaAddons("avaritiaddons"),
    Backpack("Backpack"),
    Bartworks("bartworks"),
    BetterQuesting("betterquesting"),
    BiblioCraft("BiblioCraft"),
    BiblioWoodsBOP("BiblioWoodsBoP"),
    BiomesOPlanty("BiomesOPlenty"),
    Computronics("computronics"),
    EnderIO("EnderIO"),
    EnderStorage("EnderStorage"),
    EnderZoo("EnderZoo"),
    EternalSingularity("eternalsingularity"),
    ExtraBees("ExtraBees"),
    ExtraCells("extracells"),
    ExtraTrees("ExtraTrees"),
    ExtraUtilities("ExtraUtilities"),
    FloodLights("FloodLights"),
    Forestry("Forestry"),
    ForgeMicroblocks("ForgeMicroblock"),
    GregTech("gregtech"),
    Gendustry("gendustry"),
    HoloInventory("holoinventory"),
    IC2("IC2"),
    IC2NuclearControl("IC2NuclearControl"),
    IguanaTweaks("IguanaTweaksTConstruct"),
    IronChests("IronChest"),
    JABBA("JABBA"),
    Minecraft("minecraft"),
    Natura("Natura"),
    OpenBlocks("OpenBlocks"),
    OpenComputers("OpenComputers"),
    PamsHarvestCraft("harvestcraft"),
    RandomThings("RandomThings"),
    RailCraft("Railcraft"),
    SleepingBags("sleepingbag"),
    SpiceOfLife("SpiceOfLife"),
    Thaumcraft("Thaumcraft"),
    TinkerConstruct("TConstruct"),
    Translocators("Translocator"),
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
