package me.schntgaispock.wildernether.slimefun.items;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ToolUseHandler;
import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.managers.LootManager;
import me.schntgaispock.wildernether.slimefun.managers.LootManager.LootTable;
import me.schntgaispock.wildernether.slimefun.util.Calc;

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
    private void onToolUse(BlockBreakEvent e, ItemStack tool, int fortune, List<ItemStack> drops) {
        if (!tool.hasItemMeta()) {
            return;
        }

        Logger logger = Wildernether.getInstance().getLogger();

        final HashMap<String, LootTable> netherPlantHarvestLoot = LootManager.getNetherPlantHarvest();

        String name = ChatUtils.removeColorCodes(tool.getItemMeta().getDisplayName());
        int toolValue = -1;
        switch (name) {
            case "Blackstone Scythe":
                toolValue = 10;
                break;

            case "Soul Scythe":
                toolValue = 40;
                break;
        
            default:
                logger.log(Level.INFO, String.format(
                    "Scythe#onToolUse: Slimefun Item '%s' does not match any existing Scythes", name
                ));
                break;
        }

        if (toolValue >= 0 && Calc.flip(0.2)) {
            // To prevent players from just breaking and replanting for items
            e.setDropItems(false);
            String brokenBlockName = e.getBlock().getType().toString();
            LootTable lootTable = netherPlantHarvestLoot.getOrDefault(brokenBlockName, null);

            if (lootTable != null) {
                ItemStack toDrop = Calc.getRandomDropFromLootTableAndToolValue(lootTable, toolValue).clone();
                toDrop.setAmount(Calc.clamp(1, fortune, 5));
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), toDrop);
            }
        }
    }

}
