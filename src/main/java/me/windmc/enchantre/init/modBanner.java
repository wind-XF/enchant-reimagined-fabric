package me.windmc.enchantre.init;

import me.windmc.enchantre.enchantre;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;


public class modBanner {
    public static RegistryEntry<BannerPattern> SAKURA;
    public static RegistryEntry<BannerPattern> LOGO;


    private static RegistryEntry<BannerPattern> regPattern(String id, String shortId) {
        BannerPattern pattern = Registry.register(Registries.BANNER_PATTERN, new Identifier(enchantre.Modid,id), new BannerPattern(enchantre.Modid + "_" + shortId));
        return Registries.BANNER_PATTERN.getEntry(Registries.BANNER_PATTERN.getKey(pattern).get()).get();
    }

    public static void init() {
        SAKURA = regPattern("sakura", "sk");
        LOGO = regPattern("logo", "l");
    }
}
