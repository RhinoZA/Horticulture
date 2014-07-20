package com.rhinoza.horticulture;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Rijnhardt on 2014-07-20.
 */

@Mod(modid = "Horticulture", name = "horticulture", version = "1.7.10-1.0")
public class Horticulture {

    @Mod.Instance("horticulture")
    public static Horticulture instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //ITEMS, BLOCKS

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        //GUIs
        //TILE ENTITIES

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //AFTER OTHER MODS

    }
}
