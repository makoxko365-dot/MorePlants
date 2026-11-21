package com.biomedetails;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TwistingVinesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Variante de sculk de las twisting vines: la cabeza crece usando el cuerpo del mod. */
public class SculkTwistingVinesBlock extends TwistingVinesBlock {
    public SculkTwistingVinesBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected Block getBodyBlock() {
        return ModBlocks.SCULK_TWISTING_VINES_PLANT.get();
    }
}
