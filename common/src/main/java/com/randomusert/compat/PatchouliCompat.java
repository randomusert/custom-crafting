package com.randomusert.compat;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

public class PatchouliCompat {

    public static void openBook(ResourceLocation bookId, Player player) {
        if (player.level().isClientSide()) {
            openBookImpl(bookId, player);
            
        }   
    }
    @ExpectPlatform
    public static void openBookImpl(ResourceLocation bookId, Player player) {
        throw new AssertionError("This should be implemented in the platform-specific code. Cannot continue due to errors.");
    }
}
