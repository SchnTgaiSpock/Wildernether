package me.schntgaispock.wildernether.loot;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.ParametersAreNonnullByDefault;

import lombok.Getter;

/**
 * Holds a group of loot tables
 * 
 * @author SchnTgaiSpock
 */
public class LootTableCollection {
    
    @Getter
    Map<String, LootTable> lootTables;

    public LootTableCollection() {
        this.lootTables = new HashMap<String, LootTable>();
    }

    @ParametersAreNonnullByDefault
    public LootTableCollection put(String itemName, LootTable lootTable) {
        this.lootTables.put(itemName, lootTable);
        return this;
    }
}
