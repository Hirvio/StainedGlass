package com.hirvio.stainedglass.item;

import com.hirvio.stainedglass.block.StainedGlassBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by Hirvio on 2014-06-28.
 */
public class ItemBlockColoredSand extends ItemBlock {

    private final static String[] SUBNAMES = {"White", "Orange", "Magenta", "Lightblue", "Yellow", "Lightgreen", "Pink", "Darkgrey", "Lightgrey", "Cyan", "Purple", "Blue", "Brown", "Green", "Red", "Black"};

    public ItemBlockColoredSand(Block block){
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getItemStackDisplayName(ItemStack is){
        return SUBNAMES[is.getItemDamage()] + " Stained Sand";
    }

    @Override
    public int getMetadata(int meta){
        return meta;
    }


}
