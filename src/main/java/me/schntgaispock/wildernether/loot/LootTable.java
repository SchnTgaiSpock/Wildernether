package me.schntgaispock.wildernether.loot;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.util.GeneralUtil;

/**
 * Used in {@link LootTableCollection}
 * for different weights and tools
 * 
 * @author SchnTgaiSpock
 */
public class LootTable {

    final @Getter ItemStack[][] loot;

    /**
     * Creates a new {@link LootTable} with specified name
     * @param name The name of the {@link LootTable}
     */
    @ParametersAreNonnullByDefault
    public LootTable(ItemStack[][] loot) {
        this.loot = loot;
    }
    
    @Nullable
    public ItemStack getDrop(@Nonnull double[] rates, @Nonnull double total) {
        if (rates.length != loot.length) {
            throw new IllegalArgumentException("`rates` must have a length of " + loot.length);
        }
        
        // Pick a random rarity of item to drop
        int index = GeneralUtil.pickRandomIndexFromWeightedArrayAndTotal(rates, total);

        // Return a random item from that rarity
        return GeneralUtil.pickRandomElementFromUnweightedList(loot[index]);
    }
}