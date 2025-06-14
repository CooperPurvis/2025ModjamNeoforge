package com.hamburgerphd.registry;
import com.mojang.serialization.MapCodec;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import static com.hamburgerphd.HamburgerPHD.MODID;

public class ModBiomeModifiers {

    //modify existing biomes


    private static final DeferredRegister<MapCodec<? extends BiomeModifier>> BM_MODS =
            DeferredRegister.create(NeoForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, MODID);

    public static void register(IEventBus bus) {
        BM_MODS.register(bus);
    }
}
