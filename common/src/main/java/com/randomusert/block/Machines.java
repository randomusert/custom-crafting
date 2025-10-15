package com.randomusert.block;

import com.randomusert.customcrafting;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import com.randomusert.block.ModBlocks;

public class Machines {
    public static final DeferredRegister<BlockEntityType<?>> MACHINES =
            DeferredRegister.create(customcrafting.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<CustomBlockEntity>> MACHINE1 =
            MACHINES.register("machine1", () -> BlockEntityType.Builder.of(CustomBlockEntity::new, ModBlocks.BLOCK1.get()).build(null));

    public static void init() {
        MACHINES.register();
    }
}
