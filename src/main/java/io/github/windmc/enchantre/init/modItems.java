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
    public static void init() {
        regitem(GOLDEN_STONE_TABLE_BLOCK,"golden_stone_table");
        regitem(GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK,"golden_chiseled_deepslate_table");
        regitem(CRYSTAL_TABLE,"crystal_table");
        regitem(SAKURA_BANNER_PATTERN,"sakura_banner_pattern");

        ItemGroupEvents.modifyEntriesEvent(enchantre.ENCHANT_REIMAGINED).register(content -> {
            content.add(GOLDEN_STONE_TABLE_BLOCK);
            content.add(GOLDEN_CHISELED_DEEPSLATE_TABLE_BLOCK);
            content.add(CRYSTAL_TABLE);
            content.add(SAKURA_BANNER_PATTERN);
        });
    }
    public static void regitem(Item item, String name) {
        Registry.register(Registries.ITEM, new Identifier(enchantre.Modid,name), item);
    }
}
