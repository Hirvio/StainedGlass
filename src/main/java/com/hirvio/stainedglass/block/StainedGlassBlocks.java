package com.hirvio.stainedglass.block;

import com.hirvio.stainedglass.item.ItemBlockColoredSand;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

/**
 * Created by Hirvio on 2014-06-28.
 */
public class StainedGlassBlocks {

    public static Block coloredSand;


    public static void init(){
        coloredSand = new BlockColoredSand();
        GameRegistry.registerBlock(coloredSand, ItemBlockColoredSand.class, "coloredsand");
    }
}
