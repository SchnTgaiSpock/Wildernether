package me.schntgaispock.wildernether.slimefun.items;

import java.util.List;
import java.util.logging.Level;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.loot.LootTable;
import me.schntgaispock.wildernether.loot.LootTableCollection;
import me.schntgaispock.wildernether.managers.LootManager;
import me.schntgaispock.wildernether.util.Calc;

public class Scythe extends SlimefunItem {

    @ParametersAreNonnullByDefault
    public Scythe(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc) {
        super(ig, is, rt, rc);
    }

    @Override
    public void preRegister() {
        addItemHandler((ToolUseHandler) this::onToolUse);
    }

    @EventHandler(ignoreCancelled = true)
    @ParametersAreNonnullByDefault
    private void onToolUse(BlockBreakEvent e, ItemStack item, int fortune, List<ItemStack> drops) {
        if (!item.hasItemMeta()) {
            return;
        }
        SlimefunItem tool = SlimefunItem.getByItem(item);

        if (tool == null) {
            return;
        }

        final LootTableCollection netherPlantHarvestLoot = LootManager.getNetherPlantHarvest();

        switch (tool.getId()) {
            case "BLACKSTONE_SCYTHE":
            case "SOUL_SCYTHE":
                break;
        
            default:
                Wildernether.getInstance().getLogger().log(Level.INFO, String.format(
                    "Scythe#onToolUse: Slimefun Item '%s' does not match any existing Scythes", tool.getId()
                ));
                return;
        }

        final LootTable lootTable = netherPlantHarvestLoot
            .getLootTables()
            .get(e.getBlock().getType().toString());

        if (lootTable != null) {

            // To prevent players from just breaking and replanting for items
            e.setDropItems(false);

            if (Calc.flip(1/3.0)) {
                ItemStack toDrop = lootTable.getDrop(tool.getId());
                toDrop.setAmount(Calc.clamp(1, fortune, 5));
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), toDrop);
            }
        }
    }

}
