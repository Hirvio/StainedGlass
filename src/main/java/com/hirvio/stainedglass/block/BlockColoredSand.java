package com.hirvio.stainedglass.block;

import com.hirvio.stainedglass.StainedGlass;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

import java.util.List;

/**
 * Created by Hirvio on 2014-06-28.
 */
public class BlockColoredSand extends BlockFalling {

    public BlockColoredSand(){
        super(Material.sand);
        setCreativeTab(StainedGlass.stainedglass);
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int ix = 0; ix < 16; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }

    @Override
    public MapColor getMapColor(int metadata) {
        // I hope this take metaData
        switch(metadata){

            default:
                return MapColor.sandColor;
        }
    }
}
