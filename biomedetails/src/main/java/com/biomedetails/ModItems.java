package com.biomedetails;

import net.minecraft.world.item.BlockItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BiomeDetails.MODID);

    public static final DeferredItem<BlockItem> FROZEN_BUSH = ITEMS.registerSimpleBlockItem(ModBlocks.FROZEN_BUSH);
    public static final DeferredItem<BlockItem> PURPLE_WILDFLOWERS = ITEMS.registerSimpleBlockItem(ModBlocks.PURPLE_WILDFLOWERS);
}
