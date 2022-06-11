package me.schntgaispock.wildernether.loot;

import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.Nonnull;

import org.bukkit.inventory.ItemStack;

/**
 * Provides drop rng with weights
 * 
 * @author SchnTgaiSpock
 */
public class LootTableDistribution {

    final NavigableMap<Double, Integer> map = new TreeMap<Double, Integer>();
    final Random random;
    double total = 0;
    /**
     * Creates and new {@link LootTableDistribution}
     */
    public LootTableDistribution() {
        this.random = ThreadLocalRandom.current();
    }
    
    /**
     * Adds an {@link ItemStack} loot with specified weight
     * @param weight The weight of the {@link ItemStack}
     * @param itemStack The loot to be added
     * @return The modified {@link LootTableDistribution}
     */
    LootTableDistribution add(double weight, int i) {
        if (weight <= 0) {
            return this;
        }
        total += weight;
        map.put(total, i);
        return this;
    }

    /**
     * Returns a weighted random {@link ItemStack} drop based on stored weights
     * @return A clone of the {@link ItemStack} to drop
     */
    @Nonnull
    public int getDrop() {
        return this.map.higherEntry(random.nextDouble() * total).getValue();
    }

}