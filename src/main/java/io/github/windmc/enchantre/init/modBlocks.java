package io.github.windmc.enchantre.init;

import io.github.windmc.enchantre.block.CrystaltableBlock;
import io.github.windmc.enchantre.block.GoldentableBlock;
import io.github.windmc.enchantre.enchantre;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class modBlocks{

    public static final GoldentableBlock GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final GoldentableBlock GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.CHISELED_DEEPSLATE).requiresTool());
    /*public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());
    public static final Block GOLDEN_STONE_TABLE_BLOCK = new GoldentableBlock(FabricBlockSettings.copyOf(Blocks.STONE).requiresTool());*/
    public static final CrystaltableBlock CRYSTAL_TABLE = new CrystaltableBlock(FabricBlockSettings.copyOf(Blocks.ENCHANTING_TABLE).requiresTool().nonOpaque());

    public static void init() {
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_chiseled_deepslate_table"), GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK);
        /*Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);*/
        Registry.register(Registries.BLOCK, new Identifier(enchantre.Modid,"crystal_table"),CRYSTAL_TABLE);
    }

}