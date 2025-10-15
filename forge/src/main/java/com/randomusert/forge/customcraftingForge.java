package com.randomusert.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.randomusert.customcrafting;

@Mod(customcrafting.MOD_ID)
public final class customcraftingForge {
    public customcraftingForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(customcrafting.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        customcrafting.init();
    }
}
