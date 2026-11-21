package com.biomedetails;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BiomeDetails.MODID);

    public static final DeferredItem<BlockItem> FROZEN_BUSH = ITEMS.registerSimpleBlockItem(ModBlocks.FROZEN_BUSH);
    public static final DeferredItem<BlockItem> PURPLE_WILDFLOWERS = ITEMS.registerSimpleBlockItem(ModBlocks.PURPLE_WILDFLOWERS);
    public static final DeferredItem<BlockItem> ORANGE_WILDFLOWERS = ITEMS.registerSimpleBlockItem(ModBlocks.ORANGE_WILDFLOWERS);
    public static final DeferredItem<BlockItem> FROST_SAGE = ITEMS.registerSimpleBlockItem(ModBlocks.FROST_SAGE);
    public static final DeferredItem<BlockItem> EMBER_SAGE = ITEMS.registerSimpleBlockItem(ModBlocks.EMBER_SAGE);
    public static final DeferredItem<BlockItem> WHITE_SAGE = ITEMS.registerSimpleBlockItem(ModBlocks.WHITE_SAGE);
    public static final DeferredItem<BlockItem> WHITE_JACK_O_LANTERN = ITEMS.registerSimpleBlockItem(ModBlocks.WHITE_JACK_O_LANTERN);
    public static final DeferredItem<BlockItem> PALE_ROSE_BUSH = ITEMS.registerSimpleBlockItem(ModBlocks.PALE_ROSE_BUSH);
    public static final DeferredItem<BlockItem> SCULK_WEEPING_VINES = ITEMS.registerSimpleBlockItem(ModBlocks.SCULK_WEEPING_VINES);
    public static final DeferredItem<BlockItem> SCULK_TWISTING_VINES = ITEMS.registerSimpleBlockItem(ModBlocks.SCULK_TWISTING_VINES);
}
