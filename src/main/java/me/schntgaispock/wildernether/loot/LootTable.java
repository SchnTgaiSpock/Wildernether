package me.schntgaispock.wildernether.loot;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.managers.LootManager.RarityRate;
import me.schntgaispock.wildernether.util.GeneralUtil;

/**
 * Associates {@link ItemStack} loot in {@link LootTableDistribution}s
 * for different weights and tools
 * 
 * @author SchnTgaiSpock
 */
public class LootTable {
    final Map<String, LootTableDistribution> lootTableDistributions = new HashMap<String, LootTableDistribution>();
    final @Getter String name;
    final ItemStack[][] loot;
    final ItemStack[] collapsedLoot;

    /**
     * Creates a new {@link LootTable} with specified name
     * @param name The name of the {@link LootTable}
     */
    public LootTable(String name, ItemStack[][] loot) {
        this.name = name;
        this.loot = loot;
        this.collapsedLoot = GeneralUtil.collpaseItemStackArray(loot);
    }
    
    /**
     * Takes the {@link SlimefunItem} id of the {@link LootTableDistribution} that it returns
     * @param toolName The {@link SlimefunItem} id
     * @return The corresponding {@link LootTableDistribution}, or null if the key `toolName` does not exist
     */
    @Nullable
    public LootTableDistribution getDistribution(String toolName) {
        return this.lootTableDistributions.get(toolName);
    }

    /**
     * Takes a {@link SlimefunItem} id, and an {@link ItemStack}[] array of length 4
     * and returns the modified {@link LootTable}
     * 
     * @param toolName name of the tool to associate the {@link LootTableDistribution} with
     * @param loot An array of length 4 (one for each {@link RarityRate})
     * @return The modified {@link LootTable}
     */
    public LootTable newDistribution(String toolName) {
        return newDistribution(toolName, new double[]{ 1.0, 1.0, 1.0, 1.0, 1.0 });
    }

    public LootTable newDistribution(String toolName, double[] multipliers) {
        final LootTableDistribution dist = new LootTableDistribution();
        int counter = 0;

        for (RarityRate rate : RarityRate.values()) {
            int i = rate.getN();
            int total = this.loot[i].length;
            for (int j = 0; j < total; j++) {
                dist.add(multipliers[i] * rate.getRate() / total, counter++);
            }
        }

        this.lootTableDistributions.put(toolName, dist);

        return this;
    }

    public ItemStack getDrop(String toolName) {
        return this.collapsedLoot[this.lootTableDistributions.get(toolName).getDrop()].clone();
    }
    
}