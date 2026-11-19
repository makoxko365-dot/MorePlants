package com.biomedetails;

import net.minecraft.world.level.block.FlowerBedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Wildflowers naranjas. Igual que PurpleWildflowersBlock: el constructor de FlowerBedBlock es protected. */
public class OrangeWildflowersBlock extends FlowerBedBlock {
    public OrangeWildflowersBlock(BlockBehaviour.Properties properties) {
        super(properties, 3); // 3 = shapeHeight, igual que las wildflowers vanilla
    }
}
