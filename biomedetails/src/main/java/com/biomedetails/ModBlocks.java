package com.biomedetails;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BiomeDetails.MODID);

    public static final DeferredBlock<BushBlock> FROZEN_BUSH = BLOCKS.registerBlock(
            "frozen_bush", BushBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BUSH));

    public static final DeferredBlock<PurpleWildflowersBlock> PURPLE_WILDFLOWERS = BLOCKS.registerBlock(
            "purple_wildflowers", PurpleWildflowersBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WILDFLOWERS));
}
