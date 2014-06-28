package com.hirvio.stainedglass.block;

import com.hirvio.stainedglass.StainedGlass;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by Hirvio on 2014-06-28.
 */
public class BlockGlassFurnace extends BlockContainer {

    public BlockGlassFurnace(){
        super(Material.rock);
        setCreativeTab(StainedGlass.stainedglasstab);
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return null;
    }
}
