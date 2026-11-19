package com.biomedetails;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BiomeDetails.MODID);

    // Mismas propiedades que el arbusto vanilla (bush)
    public static final DeferredBlock<BushBlock> FROZEN_BUSH = BLOCKS.registerBlock(
            "frozen_bush", BushBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.BUSH));

    // Mismas propiedades que las wildflowers vanilla
    public static final DeferredBlock<PurpleWildflowersBlock> PURPLE_WILDFLOWERS = BLOCKS.registerBlock(
            "purple_wildflowers", PurpleWildflowersBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WILDFLOWERS));

    // Flor nueva. Propiedades copiadas de la cornflower; efecto de sopa sospechosa: Resistencia 6 s
    public static final DeferredBlock<FlowerBlock> FROST_SAGE = BLOCKS.registerBlock(
            "frost_sage", props -> new FlowerBlock(MobEffects.RESISTANCE, 6.0F, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CORNFLOWER));
}
