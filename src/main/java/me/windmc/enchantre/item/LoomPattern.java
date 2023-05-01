package me.windmc.enchantre.item;

import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.entry.RegistryEntry;

import java.util.List;
public interface LoomPattern {
    RegistryEntry<BannerPattern> getPattern();

    default List<RegistryEntry<BannerPattern>> getPatterns() {
        return List.of(getPattern());
    }

}
