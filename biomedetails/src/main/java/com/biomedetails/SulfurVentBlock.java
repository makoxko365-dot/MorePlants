package com.biomedetails;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HeavyCoreBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

/** Respiradero de azufre: mismo modelo/forma que el heavy core, pero expulsa humo toxico amarillo verdoso de forma continua. */
public class SulfurVentBlock extends HeavyCoreBlock implements EntityBlock {
    public SulfurVentBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SulfurVentBlockEntity(pos, state);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state, BlockEntityType<T> type) {
        // El humo es solo visual: el tick solo corre en el cliente
        if (!level.isClientSide() || type != ModBlockEntities.SULFUR_VENT.get()) return null;
        BlockEntityTicker<SulfurVentBlockEntity> ticker = SulfurVentBlockEntity::clientTick;
        return (BlockEntityTicker<T>) ticker;
    }
}
