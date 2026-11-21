package com.biomedetails;

import net.minecraft.world.level.block.BaseCoralPlantBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

/** Protuberancia sculk: variante del dead tube coral (planta de coral muerto). Se genera solo sobre sculk. */
public class SculkProtrusionBlock extends BaseCoralPlantBlock {
    public SculkProtrusionBlock(BlockBehaviour.Properties properties) {
        super(properties);
        // Los corales vanilla vienen waterlogged=true por defecto: aqui empieza seca
        this.registerDefaultState(this.defaultBlockState().setValue(BlockStateProperties.WATERLOGGED, false));
    }
}
