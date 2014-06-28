package com.hirvio.stainedglass;

import com.hirvio.stainedglass.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Hirvio on 2014-06-28.
 */

@Mod(modid="stainedglass", name = "Stained Glass", version = "0.1")
public class StainedGlass {

    @SidedProxy(clientSide = "com.hirvio.stainedglass.proxies.ClientProxy", serverSide = "com.hirvio.staomedgöass.proxies.CommonProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs stainedglass = new CreativeTabs("stainedglass")
    {

        @Override
        public Item getTabIconItem()
        {
            return Item.getItemFromBlock(Blocks.stained_glass);
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return "Stained Glass";
        }
    };

    @Mod.Instance
    public StainedGlass instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){



    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }




}
