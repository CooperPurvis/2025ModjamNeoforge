package com.hamburgerphd.datagen;

import net.neoforged.neoforge.data.event.GatherDataEvent;

public class ModDataGen {

    //put all data providers here


        public static void gatherData(GatherDataEvent event) {
            var output = event.getGenerator().getPackOutput();
            var lookup = event.getLookupProvider();

            if (event.includeServer()) {
                //event.getGenerator().addProvider(true, new ModBiomeProvider(output, lookup));
                //event.getGenerator().addProvider(true, new ModBiomeModifierProvider(output, lookup));
                //event.getGenerator().addProvider(true, new ModFeatureProvider(output, lookup));
            }
        }
    }


