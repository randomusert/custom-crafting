package com.randomusert.item;

import com.randomusert.customcrafting;

import dev.architectury.hooks.item.*;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;


public class resources {
    

    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS = DeferredRegister.create(customcrafting.MOD_ID, Registries.ITEM);


    public static final RegistrySupplier<Item> MINECRAFTIUM = ITEMS.register("minecraftium", 
        () -> new Item(new Properties().stacksTo(64)));

    public static void init() {
        ITEMS.register();
    }
}
