package com.randomusert.block;

import java.util.Properties;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create("custom_crafting", Registries.BLOCK);

    public static final RegistrySupplier<Block> BLOCK1 =
        BLOCKS.register("block1", () -> new CustomBlock(BlockBehaviour.Properties.of()
            .strength(3.5f).requiresCorrectToolForDrops()));

    public static void init() {
        BLOCKS.register();
    }
}
