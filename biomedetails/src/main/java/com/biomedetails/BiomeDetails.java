package com.biomedetails;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(BiomeDetails.MODID)
public class BiomeDetails {
    public static final String MODID = "biomedetails";

    public BiomeDetails(IEventBus modEventBus) {
        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModItems.FROZEN_BUSH.get());
            event.accept(ModItems.PURPLE_WILDFLOWERS.get());
            event.accept(ModItems.ORANGE_WILDFLOWERS.get());
            event.accept(ModItems.FROST_SAGE.get());
            event.accept(ModItems.EMBER_SAGE.get());
            event.accept(ModItems.WHITE_SAGE.get());
            event.accept(ModItems.WHITE_JACK_O_LANTERN.get());
            event.accept(ModItems.PALE_ROSE_BUSH.get());
            event.accept(ModItems.SCULK_WEEPING_VINES.get());
            event.accept(ModItems.SCULK_TWISTING_VINES.get());
            event.accept(ModItems.SCULK_PROTRUSION.get());
            event.accept(ModItems.SMALL_YELLOW_AMETHYST_BUD.get());
            event.accept(ModItems.MEDIUM_YELLOW_AMETHYST_BUD.get());
        }
    }
}
