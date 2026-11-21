package com.biomedetails;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

/** Block entity del respiradero: su tick de cliente saca humo de forma continua (como la fogata). */
public class SulfurVentBlockEntity extends BlockEntity {
    /** Cada cuantos ticks sale una particula de humo (1 = todos los ticks; sube el numero para menos humo). */
    private static final long SMOKE_INTERVAL_TICKS = 3L;

    public SulfurVentBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.SULFUR_VENT.get(), pos, state);
    }

    public static void clientTick(Level level, BlockPos pos, BlockState state, SulfurVentBlockEntity blockEntity) {
        if (state.getValue(BlockStateProperties.WATERLOGGED)) return;
        if (level.getGameTime() % SMOKE_INTERVAL_TICKS != 0L) return;
        RandomSource random = level.getRandom();
        double x = pos.getX() + 0.5 + (random.nextDouble() - 0.5) * 0.25;
        double y = pos.getY() + 0.55;
        double z = pos.getZ() + 0.5 + (random.nextDouble() - 0.5) * 0.25;
        level.addParticle(ModParticles.SULFUR_SMOKE.get(), x, y, z, 0.0, 0.07 + random.nextDouble() * 0.04, 0.0);
    }
}
