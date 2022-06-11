package me.schntgaispock.wildernether.listeners;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;


import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;
import me.schntgaispock.wildernether.util.Calc;

/**
 * Adds drops to hoglins
 * 
 * @author SchnTgaiSpock
 */
public class HoglinKillListener implements Listener {

    @EventHandler
    public void onHoglinKill(@Nonnull EntityDeathEvent e) {
        EntityType dead = e.getEntityType();

        if (!dead.equals(EntityType.HOGLIN)) {
            return;
        }

        List<ItemStack> toAdd = new ArrayList<>();
        
        if (Calc.flip(0.2)) {
            toAdd.add(WildernetherStacks.HOGLIN_BELLY);
        }
        if (Calc.flip(0.2)) {
            toAdd.add(WildernetherStacks.HOGLIN_SPARE_RIB);
        }
        if (Calc.flip(0.2)) {
            toAdd.add(WildernetherStacks.HOGLIN_TROTTERS);
        }

        e.getDrops().addAll(toAdd);
    }
    
    public static void setup() {
        Bukkit.getPluginManager().registerEvents((Listener) new HoglinKillListener(),
            (Plugin) Wildernether.getInstance());
    }
}
