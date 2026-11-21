package com.biomedetails;

import java.util.function.Supplier;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, BiomeDetails.MODID);

    public static final Supplier<BlockEntityType<SulfurVentBlockEntity>> SULFUR_VENT =
            BLOCK_ENTITY_TYPES.register("sulfur_vent",
                    () -> new BlockEntityType<>(SulfurVentBlockEntity::new, ModBlocks.SULFUR_VENT.get()));
}
