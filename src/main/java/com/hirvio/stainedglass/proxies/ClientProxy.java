package com.hirvio.stainedglass.proxies;

import com.hirvio.stainedglass.renders.GlassPaneRender;
import com.hirvio.stainedglass.tileentity.TileEntityGlassPane;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * Created by Hirvio on 2014-06-23.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void registerEventHandlers()
    {
        super.registerEventHandlers();
    }

    @Override
    public void initRenderingAndTextures()
    {

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlassPane.class, new GlassPaneRender());
    }

}
