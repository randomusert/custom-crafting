package com.randomusert;

import com.randomusert.item.*;
import com.randomusert.block.*;

public final class customcrafting {
    public static final String MOD_ID = "custom_crafting";

    public static void init() {
        resources.init();
        ModBlocks.init();
        Machines.init();
    }
}
