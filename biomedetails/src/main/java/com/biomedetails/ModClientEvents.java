package com.biomedetails;

import net.minecraft.client.particle.CampfireSmokeParticle;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

@EventBusSubscriber(modid = BiomeDetails.MODID, value = Dist.CLIENT)
public class ModClientEvents {
    @SubscribeEvent
    public static void registerParticleProviders(RegisterParticleProvidersEvent event) {
        // Misma logica que el humo de fogata (CosyProvider), con los sprites amarillo verdosos del mod
        event.registerSpriteSet(ModParticles.SULFUR_SMOKE.get(), CampfireSmokeParticle.CosyProvider::new);
    }
}
