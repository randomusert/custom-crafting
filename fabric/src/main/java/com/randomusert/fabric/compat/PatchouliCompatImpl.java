package com.randomusert.fabric.compat;

import net.minecraft.resources.ResourceLocation;
import vazkii.patchouli.api.*;

public class PatchouliCompatImpl {
    public static void openBookImpl(ResourceLocation bookId) {
        // NO-OP
         PatchouliAPI.get().openBookGUI(bookId);
    }
}
