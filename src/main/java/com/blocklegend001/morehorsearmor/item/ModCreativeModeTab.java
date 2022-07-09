package com.blocklegend001.morehorsearmor.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MOREHORSEARMOR_TAB = new CreativeModeTab("morehorsearmortab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHERITE_HORSE_ARMOR.get());
        }
    };
}
