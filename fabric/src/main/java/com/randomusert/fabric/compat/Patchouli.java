package com.randomusert.fabric.compat;

import net.minecraft.resources.ResourceLocation;
import vazkii.patchouli.api.*;

public class Patchouli {
    public static void openBook(ResourceLocation bookId) {
        // NO-OP
         PatchouliAPI.get().openBookGUI(bookId);
    }
}
