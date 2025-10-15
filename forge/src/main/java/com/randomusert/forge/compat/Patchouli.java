package com.randomusert.forge.compat;

import net.minecraft.client.ResourceLoadStateTracker;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import vazkii.patchouli.api.*;


public class Patchouli {
    public static void openBook(ResourceLocation bookId, Player player) {
        // NO-OP
        PatchouliAPI.get().openBookGUI(bookId);
    }
}
