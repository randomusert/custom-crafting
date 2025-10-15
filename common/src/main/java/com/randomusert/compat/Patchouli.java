package com.randomusert.compat;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class Patchouli {
    @ExpectPlatform
    public static void registerBook() {
        throw new AssertionError();
    }
}
