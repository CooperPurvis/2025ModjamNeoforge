package com.hamburgerphd.datagen;



    //create JSON for new biomes


import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.neoforged.neoforge.common.data.JsonCodecProvider;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static net.neoforged.neoforge.internal.versions.neoforge.NeoForgeVersion.MOD_ID;

public abstract class ModBiomeProvider extends JsonCodecProvider {
        public ModBiomeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries, "Biomes", registry.BIOME, MOD_ID);
        }

        //@Override
        protected void generate(Map<ResourceLocation, Biome> output, HolderLookup.Provider registries) {
            //output.put(new ResourceLocation(MOD_ID, "example"), createExample());
        }

        private static Biome createExample() {
            return new Biome.BiomeBuilder()
                    .temperature(0.7f)
                    .downfall(0.8f)
                    //.precipitation(Biome.Precipitation.RAIN)
                    .specialEffects(new BiomeSpecialEffects.Builder()
                            .waterColor(0x3F76E4)
                            .waterFogColor(0x050533)
                            .fogColor(0xC0D8FF)
                            .skyColor(0x77ADFF)
                            .build()
                    ).build();
        }
    }

}
