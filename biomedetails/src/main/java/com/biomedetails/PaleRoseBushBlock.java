package com.biomedetails;

import net.minecraft.world.level.block.TallFlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

/** Rosal palido (planta alta de 2 bloques). Igual que el rose bush vanilla; subclase por si el constructor es protected. */
public class PaleRoseBushBlock extends TallFlowerBlock {
    public PaleRoseBushBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }
}
