package me.schntgaispock.wildernether.slimefun.util;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.Wildernether;

/**
 * LootTable
 */
public class LootTable {
    /**
     * LootTableDistribution
     */
    public static class LootTableDistribution {

        private final NavigableMap<Double, ItemStack> map = new TreeMap<Double, ItemStack>();
        private final Random random;
        private double total = 0;
        
        public LootTableDistribution(ItemStack[] loot, double[] weights) {
            for (int i = 0; i < weights.length; i++) {
                this.add(weights[i], loot[i]);
            }
            this.random = ThreadLocalRandom.current();
        }

        private LootTableDistribution add(double weight, ItemStack itemStack) {
            if (weight <= 0) return this;
            total += weight;
            map.put(total, itemStack);
            return this;
        }

        public ItemStack getDrop() {
            return this.map.higherEntry(random.nextDouble() * total).getValue().clone();
        }

    }

    Map<String, LootTableDistribution> lootTableDistributions = new HashMap<String, LootTableDistribution>();
    @Getter String name;
    
    @ParametersAreNonnullByDefault
    public LootTable(String name, ItemStack[] loot, double[][] weights, String[] toolNames) {
        this.name = name;
        if (weights.length != toolNames.length) {
            Wildernether.getInstance().getLogger().log(Level.WARNING, "'weights' and 'toolNames' are different lengths at in loot table: " + this.name + "\nweights, toolNames length: " + weights.length + ", " + toolNames.length);
        } 
        for (int i = 0; i < toolNames.length; i++) {
            this.lootTableDistributions.put(toolNames[i], new LootTableDistribution(loot, weights[i]));
        }
    }

    public LootTableDistribution getDistribution(String toolName) {
        return this.lootTableDistributions.get(toolName);
    }

}