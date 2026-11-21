package com.biomedetails;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
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

    // Version naranja de las purple wildflowers
    public static final DeferredBlock<OrangeWildflowersBlock> ORANGE_WILDFLOWERS = BLOCKS.registerBlock(
            "orange_wildflowers", OrangeWildflowersBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WILDFLOWERS));

    // Flor nueva. Propiedades copiadas de la cornflower; efecto de sopa sospechosa: Resistencia 6 s
    public static final DeferredBlock<FlowerBlock> FROST_SAGE = BLOCKS.registerBlock(
            "frost_sage", props -> new FlowerBlock(MobEffects.RESISTANCE, 6.0F, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CORNFLOWER));

    // Version naranja de la frost sage. Efecto de sopa sospechosa: Resistencia al fuego 6 s
    public static final DeferredBlock<FlowerBlock> EMBER_SAGE = BLOCKS.registerBlock(
            "ember_sage", props -> new FlowerBlock(MobEffects.FIRE_RESISTANCE, 6.0F, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CORNFLOWER));

    // Version blanca de la ember sage. Efecto de sopa sospechosa: Regeneracion 6 s
    public static final DeferredBlock<FlowerBlock> WHITE_SAGE = BLOCKS.registerBlock(
            "white_sage", props -> new FlowerBlock(MobEffects.REGENERATION, 6.0F, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.CORNFLOWER));

    // Jack o'lantern blanca. Mismas propiedades que la jack o'lantern vanilla (luz 15, etc.)
    public static final DeferredBlock<CarvedPumpkinBlock> WHITE_JACK_O_LANTERN = BLOCKS.registerBlock(
            "white_jack_o_lantern", CarvedPumpkinBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.JACK_O_LANTERN));

    // Rosal palido: mismas propiedades que el rose bush vanilla
    public static final DeferredBlock<PaleRoseBushBlock> PALE_ROSE_BUSH = BLOCKS.registerBlock(
            "pale_rose_bush", PaleRoseBushBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.ROSE_BUSH));

    // Enredaderas del nether en version sculk (cabeza + cuerpo, como las vanilla)
    public static final DeferredBlock<SculkWeepingVinesBlock> SCULK_WEEPING_VINES = BLOCKS.registerBlock(
            "sculk_weeping_vines", SculkWeepingVinesBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES).sound(SoundType.SCULK_VEIN));
    public static final DeferredBlock<SculkWeepingVinesPlantBlock> SCULK_WEEPING_VINES_PLANT = BLOCKS.registerBlock(
            "sculk_weeping_vines_plant", SculkWeepingVinesPlantBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES_PLANT).sound(SoundType.SCULK_VEIN));
    public static final DeferredBlock<SculkTwistingVinesBlock> SCULK_TWISTING_VINES = BLOCKS.registerBlock(
            "sculk_twisting_vines", SculkTwistingVinesBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES).sound(SoundType.SCULK_VEIN));
    public static final DeferredBlock<SculkTwistingVinesPlantBlock> SCULK_TWISTING_VINES_PLANT = BLOCKS.registerBlock(
            "sculk_twisting_vines_plant", SculkTwistingVinesPlantBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES_PLANT).sound(SoundType.SCULK_VEIN));

    // Protuberancia sculk: mismas propiedades que el dead tube coral, con sonido de sculk sensor
    public static final DeferredBlock<SculkProtrusionBlock> SCULK_PROTRUSION = BLOCKS.registerBlock(
            "sculk_protrusion", SculkProtrusionBlock::new,
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DEAD_TUBE_CORAL).sound(SoundType.SCULK_SENSOR));

    // Brotes de amatista amarillos: mismas propiedades (luz, sonido) y forma que los vanilla
    public static final DeferredBlock<AmethystClusterBlock> SMALL_YELLOW_AMETHYST_BUD = BLOCKS.registerBlock(
            "small_yellow_amethyst_bud", props -> new AmethystClusterBlock(3.0F, 4.0F, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.SMALL_AMETHYST_BUD));
    public static final DeferredBlock<AmethystClusterBlock> MEDIUM_YELLOW_AMETHYST_BUD = BLOCKS.registerBlock(
            "medium_yellow_amethyst_bud", props -> new AmethystClusterBlock(4.0F, 3.0F, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.MEDIUM_AMETHYST_BUD));
}
