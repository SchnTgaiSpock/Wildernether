package me.schntgaispock.wildernether.util;


import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import me.schntgaispock.wildernether.Wildernether;

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

    public static int pickRandomIndexFromWeightedArrayAndTotal(double[] array, double total) {
        int i = 0;
        double r = Wildernether.getInstance().getRandom().nextDouble() * total;
        while (r > array[i]) {
            r -= array[i++];
        }
        return i;
    }

    @Nullable
    public static <T> T pickRandomElementFromUnweightedList(T[] array) {
        if (array.length < 1) {
            return null;
        }
        return array[Wildernether.getInstance().getRandom().nextInt(array.length)];
    }

    public static double sum(double[] array) {
        double total = 0;
        for (double t : array) {
            total += t;
        }
        return total;
    }

    public static double[] zipMult(double[] a1, double[] a2) {
        double[] r = new double[a1.length];
        for (int i = 0; i < a1.length; i++) {
            r[i] = a1[i] * a2[i];
        }
        return r;
    }
}
