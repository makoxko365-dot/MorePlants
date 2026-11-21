package com.biomedetails;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WeepingVinesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Variante de sculk de las weeping vines: la cabeza crece usando el cuerpo del mod. */
public class SculkWeepingVinesBlock extends WeepingVinesBlock {
    public SculkWeepingVinesBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.SCULK_WEEPING_VINES_PLANT.get();
    }
}
