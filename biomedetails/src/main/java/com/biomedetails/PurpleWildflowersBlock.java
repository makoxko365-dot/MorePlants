package com.biomedetails;

import net.minecraft.world.level.block.FlowerBedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Wildflowers moradas. El constructor de FlowerBedBlock es protected, por eso hace falta esta subclase. */
public class PurpleWildflowersBlock extends FlowerBedBlock {
    public PurpleWildflowersBlock(BlockBehaviour.Properties properties) {
        super(properties, 3); // 3 = shapeHeight, igual que las wildflowers vanilla
    }
}
