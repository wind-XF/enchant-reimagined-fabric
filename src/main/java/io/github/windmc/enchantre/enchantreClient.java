package io.github.windmc.enchantre;

import io.github.windmc.enchantre.init.modBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class enchantreClient implements ClientModInitializer{

    public static void registerCutout(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
    }
    @Override
    public void onInitializeClient() {
        registerCutout(modBlocks.CRYSTAL_TABLE);
        registerCutout(modBlocks.AMETHYST_COPPER_TABLE_BLOCK);
    }
}
