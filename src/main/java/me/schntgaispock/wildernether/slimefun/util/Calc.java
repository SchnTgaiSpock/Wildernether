package me.schntgaispock.wildernether.slimefun.util;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.managers.LootManager.LootTable;

public class Calc {

    @ParametersAreNonnullByDefault
    public static int clamp(int min, int val, int max) {
        return Math.min(max, Math.max(val, min));
    }

    @ParametersAreNonnullByDefault
    public static int nextNormalValue(Random random, double stddev, int mean) {
        return nextNormalValue(random, stddev, mean, 0, 100);
    }

    @ParametersAreNonnullByDefault
    public static int nextNormalValue(Random random, double stddev, int mean, int min, int max) {
        return clamp(min, (int) Math.round(random.nextGaussian()*stddev + mean), max);
    }

    @ParametersAreNonnullByDefault
    public static ItemStack getRandomDropFromLootTableAndToolValue(LootTable lootTable, int toolValue) {
        Random random = Wildernether.getInstance().getRandom();
        int randomValue = nextNormalValue(random, 5, toolValue);

        // Getting loot(s) with closest value in lootTable
        List<ItemStack> closest = new LinkedList<ItemStack>();
        int closestDifference = Integer.MAX_VALUE;
        for (ItemStack itemStack : lootTable.getValues().keySet()) {
            int difference = (int) Math.abs(lootTable.getValues().get(itemStack) - randomValue);
            if (difference < closestDifference) {
                closestDifference = difference;
                closest.clear();
                closest.add(itemStack);
            } else if (difference == closestDifference) {
                closest.add(itemStack);
            }
        }

        // Picks a random item from the closest values
        return closest.get(random.nextInt(closest.size()));
    }

    public static boolean flip(@Nonnull double chance) {
        return Wildernether.getInstance().getRandom().nextDouble() < chance;
    }
}
