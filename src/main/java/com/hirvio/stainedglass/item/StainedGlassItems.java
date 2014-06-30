package com.hirvio.stainedglass.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Hirvio on 2014-06-30.
 */
public class StainedGlassItems {

    public static Item ironDroplet;

    public static void init(){
        ironDroplet = new ItemIronDroplet().setUnlocalizedName("irondroplet");
        GameRegistry.registerItem(ironDroplet, "irondroplet");
    }

}
