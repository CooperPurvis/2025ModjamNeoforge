package com.hamburgerphd.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.biome.Biome;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion.MOD_ID;


//create new biomes
public class ModBiomes {

        //create deffered register
        public static final DeferredRegister<Biome> BIOMES =
                DeferredRegister.create(Registries.BIOME, MOD_ID);

        //register custom biome
        //public static final RegistryObject<Biome> EXAMPLE = BIOMES.register("example",
        //        () -> ModBiomeProvider.createExample());


        //hook into mod event bus
        public static void register(IEventBus eventBus) {
            BIOMES.register(eventBus);
        }
    }


