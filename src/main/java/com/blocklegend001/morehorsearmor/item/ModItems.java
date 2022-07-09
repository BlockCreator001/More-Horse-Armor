package com.blocklegend001.morehorsearmor.item;

import com.blocklegend001.morehorsearmor.MoreHorseArmor;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreHorseArmor.MOD_ID);

    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
            () -> new HorseArmorItem(18, "netherite",
                    new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.MOREHORSEARMOR_TAB)));

    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor",
            () -> new HorseArmorItem(15, "emerald",
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.MOREHORSEARMOR_TAB)));

    public static final RegistryObject<Item> OBSIDIAN_HORSE_ARMOR = ITEMS.register("obsidian_horse_armor",
            () -> new HorseArmorItem(9, "obsidian",
                    new Item.Properties().stacksTo(1).fireResistant().tab(ModCreativeModeTab.MOREHORSEARMOR_TAB)));

    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor",
            () -> new HorseArmorItem(6, "copper",
                    new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.MOREHORSEARMOR_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}