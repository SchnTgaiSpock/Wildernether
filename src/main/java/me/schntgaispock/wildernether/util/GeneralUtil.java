package me.schntgaispock.wildernether.util;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class GeneralUtil {
    
    @Nullable
    public static ItemStack returnItemAfterUsing(@Nonnull ItemStack usedItem) {
        ItemStack returnItem = null;
        switch (usedItem.getType()) {
            case WATER_BUCKET:
            case LAVA_BUCKET:
            case MILK_BUCKET:
            case POWDER_SNOW_BUCKET:
                returnItem =  new ItemStack(Material.BUCKET);
                break;
        
            case BEETROOT_SOUP:
            case MUSHROOM_STEW:
            case RABBIT_STEW:
            case SUSPICIOUS_STEW:
                returnItem = new ItemStack(Material.BOWL);
                break;

            case POTION:
            case HONEY_BOTTLE:
                returnItem = new ItemStack(Material.GLASS_BOTTLE);
                break;

            default:
                break;
        }
        return returnItem;
    }

    public static ItemStack[] collpaseItemStackArray(ItemStack[][] array) {
        int size = 0;
        for (ItemStack[] sub : array) {
            size += sub.length;
        }
        final ItemStack[] l = new ItemStack[size];

        int i = 0;
        for (ItemStack[] sub : array) {
            for (ItemStack bottom : sub) {
                l[i++] = bottom;
            }
        }
        return l;
    }
}
