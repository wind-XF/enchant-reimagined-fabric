package io.github.windmc.enchantre;

import io.github.windmc.enchantre.init.modBanner;
import io.github.windmc.enchantre.init.modBlocks;
import io.github.windmc.enchantre.init.modItems;
import io.github.windmc.enchantre.init.modTags;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class enchantre implements ModInitializer {

    public static final String Modid = "enchantre";

    public static final RegistryKey<ItemGroup> ENCHANT_REIMAGINED = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Modid, "enchant_reimagined_group"));


    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM_GROUP, ENCHANT_REIMAGINED, FabricItemGroup.builder()
            .icon(() -> new ItemStack(modBlocks.CRYSTAL_TABLE))
            .displayName(Text.translatable("enchantre.enchant_reimagined_group"))
            .build());
        modBlocks.init();
        modTags.init();
        modBanner.init();
        modItems.init();
    }
}

