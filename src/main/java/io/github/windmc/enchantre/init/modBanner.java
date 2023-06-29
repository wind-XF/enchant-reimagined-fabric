package io.github.windmc.enchantre.init;

import io.github.windmc.enchantre.enchantre;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;


public class modBanner {
    public static RegistryEntry<BannerPattern> SAKURA;

    private static RegistryEntry<BannerPattern> regPattern(String id, String shortId) {
        BannerPattern pattern = Registry.register(Registries.BANNER_PATTERN, new Identifier(enchantre.Modid,id), new BannerPattern(enchantre.Modid + "_" + shortId));
        return Registries.BANNER_PATTERN.getEntry(Registries.BANNER_PATTERN.getKey(pattern).get()).get();
    }//banner reg is needed to be fixed

    public static void init() {
        SAKURA = regPattern("sakura", "sk");
    }
}
