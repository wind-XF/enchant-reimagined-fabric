package io.github.windmc.enchantre.init;

import io.github.windmc.enchantre.block.CoppertableBlock;
import io.github.windmc.enchantre.block.CrystaltableBlock;
import io.github.windmc.enchantre.block.GoldentableBlock;
import io.github.windmc.enchantre.enchantre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class modBlocks{

    public static final GoldentableBlock GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final GoldentableBlock GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    public static final CoppertableBlock AMETHYST_COPPER_TABLE_BLOCK = new CoppertableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK).requiresTool());

    /*public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());*/
    public static final CrystaltableBlock CRYSTAL_TABLE = new CrystaltableBlock(FabricBlockSettings.copyOf(Blocks.ENCHANTING_TABLE).requiresTool().nonOpaque());

    public static void init() {
        regblock(GOLDEN_STONE_TABLE_BLOCK,"golden_stone_table");
        regblock(GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK,"golden_chiseled_deepslate_table");
        regblock(AMETHYST_COPPER_TABLE_BLOCK,"amethyst_copper_table");
        regblock(CRYSTAL_TABLE,"crystal_table");
    }

    public static void regblock(Block block, String name) {
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,name), block);
    }
}