package com.hirvio.stainedglass.block;

import com.hirvio.stainedglass.StainedGlass;
import com.hirvio.stainedglass.tileentity.TileEntityGlassPane;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Hirvio on 2014-06-30.
 */
public class BlockGlassPane extends BlockContainer {

    public BlockGlassPane(){
        super(Material.glass);
        setCreativeTab(StainedGlass.stainedglasstab);
        setBlockName("glasspane");
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2) {
        return new TileEntityGlassPane();
    }
}
