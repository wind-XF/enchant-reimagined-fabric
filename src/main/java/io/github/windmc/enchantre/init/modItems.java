package io.github.windmc.enchantre.init;

import io.github.windmc.enchantre.enchantre;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BannerPatternItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class modItems {

    public static final Item GOLDEN_STONE_TABLE_BLOCK = new BlockItem(modBlocks.GOLDEN_STONE_TABLE_BLOCK, new FabricItemSettings());
    public static final Item GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK = new BlockItem(modBlocks.GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK, new FabricItemSettings());
    public static final Item CRYSTAL_TABLE = new BlockItem(modBlocks.CRYSTAL_TABLE, new FabricItemSettings());
    public static final Item SAKURA_BANNER_PATTERN = new BannerPatternItem(modTags.SAKURA_TAG,new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON));
    public static final Item LOGO_BANNER_PATTERN = new BannerPatternItem(modTags.LOGO_TAG,new FabricItemSettings().maxCount(1).rarity(Rarity.EPIC));
    public static void init() {
        Registry.register(Registries.ITEM, new Identifier(enchantre.Modid,"golden_stone_table"), GOLDEN_STONE_TABLE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(enchantre.Modid,"golden_chiseled_deepslate_table"), GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(enchantre.Modid,"crystal_table"),CRYSTAL_TABLE);
        Registry.register(Registries.ITEM, new Identifier(enchantre.Modid,"sakura_banner_pattern"),SAKURA_BANNER_PATTERN);
        Registry.register(Registries.ITEM, new Identifier(enchantre.Modid,"logo_banner_pattern"),LOGO_BANNER_PATTERN);

        ItemGroupEvents.modifyEntriesEvent(enchantre.ENCHANT_REIMAGINED).register(content -> {
            content.add(GOLDEN_STONE_TABLE_BLOCK);
            content.add(GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK);
            content.add(CRYSTAL_TABLE);
            content.add(SAKURA_BANNER_PATTERN);
            content.add(LOGO_BANNER_PATTERN);
        });
    }
}
