package com.biomedetails;

import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.WeepingVinesPlantBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Cuerpo de las weeping vines de sculk: apunta a la cabeza del mod. */
public class SculkWeepingVinesPlantBlock extends WeepingVinesPlantBlock {
    public SculkWeepingVinesPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected GrowingPlantHeadBlock getHeadBlock() {
        return ModBlocks.SCULK_WEEPING_VINES.get();
    }
}
