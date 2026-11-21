package com.biomedetails;

import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.TwistingVinesPlantBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Cuerpo de las twisting vines de sculk: apunta a la cabeza del mod. */
public class SculkTwistingVinesPlantBlock extends TwistingVinesPlantBlock {
    public SculkTwistingVinesPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return ModBlocks.SCULK_TWISTING_VINES.get();
    }
}
