package io.github.windmc.enchantre.init;

import io.github.windmc.enchantre.enchantre;
import net.minecraft.block.entity.BannerPattern;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class modTags {
    public static final TagKey<BannerPattern> SAKURA_TAG = of("pattern_item/sakura");
    public static final TagKey<BannerPattern> LOGO_TAG = of("pattern_item/logo");
    private static TagKey<BannerPattern> of(String id) {
        return TagKey.of(RegistryKeys.BANNER_PATTERN, new Identifier(enchantre.Modid,id));
    }
    public static void init() {
    }
}
