package com.biomedetails;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HeavyCoreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

/** Respiradero de azufre: mismo modelo/forma que el heavy core, pero expulsa humo toxico amarillo verdoso (como una fogata). */
public class SulfurVentBlock extends HeavyCoreBlock {
    public SulfurVentBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, RandomSource random) {
        // animateTick se llama pocas veces por bloque, asi que se lanzan varias particulas por llamada
        if (state.getValue(BlockStateProperties.WATERLOGGED)) return;
        for (int i = 0; i < 6; i++) {
            double x = pos.getX() + 0.5 + (random.nextDouble() - 0.5) * 0.25;
            double y = pos.getY() + 0.55;
            double z = pos.getZ() + 0.5 + (random.nextDouble() - 0.5) * 0.25;
            level.addParticle(ModParticles.SULFUR_SMOKE.get(), x, y, z, 0.0, 0.07 + random.nextDouble() * 0.04, 0.0);
        }
    }
}
