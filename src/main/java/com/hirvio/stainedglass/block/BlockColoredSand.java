package com.hirvio.stainedglass.block;

import com.hirvio.stainedglass.StainedGlass;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
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

    @SideOnly(Side.CLIENT)
    private IIcon texture;

    public BlockColoredSand(){
        super(Material.sand);
        setCreativeTab(StainedGlass.stainedglasstab);
        setBlockName("stainedglass");
    }

    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
        for (int ix = 0; ix < 16; ix++) {
            subItems.add(new ItemStack(this, 1, ix));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister){
        texture = par1IconRegister.registerIcon("stainedglass:coloredsand");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List){
        for(int var4 = 0; var4 < 16; ++var4) {
            par3List.add(new ItemStack(StainedGlassBlocks.coloredSand, 1, var4));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta){
        return texture;
    }



    @Override
    public int damageDropped(int meta){
        return meta;
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
