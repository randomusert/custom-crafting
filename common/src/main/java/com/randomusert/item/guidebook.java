package com.randomusert.item;

import com.randomusert.customcrafting;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import com.randomusert.compat.*;

public class guidebook {
    public static final DeferredRegister<net.minecraft.world.item.Item> ITEMS = DeferredRegister.create(customcrafting.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> GUIDEBOOK = ITEMS.register("guidebook", 
        () -> new Item(new Properties().stacksTo(1)) {
            @Override
        public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
            if (!world.isClientSide) return InteractionResultHolder.success(player.getItemInHand(hand));

            PatchouliCompat.openBook(new ResourceLocation("custom_crafting", "guide"), player);
            return InteractionResultHolder.consume(player.getItemInHand(hand));
        }
        });

    public static void init() {
        ITEMS.register();
    }
}
