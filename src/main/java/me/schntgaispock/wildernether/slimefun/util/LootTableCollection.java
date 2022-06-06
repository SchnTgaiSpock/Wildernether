package me.schntgaispock.wildernether.slimefun.util;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class LootTableCollection {
    
    @Getter
    Map<String, LootTable> lootTables;

    public LootTableCollection() {
        this.lootTables = new HashMap<String, LootTable>();
    }

    public LootTableCollection put(String itemName, LootTable lootTable) {
        this.lootTables.put(itemName, lootTable);
        return this;
    }
}
