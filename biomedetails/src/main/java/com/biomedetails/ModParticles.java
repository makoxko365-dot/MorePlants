package com.biomedetails;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, BiomeDetails.MODID);

    // Humo toxico amarillo verdoso (se comporta como el humo de fogata; los sprites estan en assets/.../particles)
    public static final DeferredHolder<ParticleType<?>, SimpleParticleType> SULFUR_SMOKE =
            PARTICLE_TYPES.register("sulfur_smoke", () -> new SimpleParticleType(false));
}
