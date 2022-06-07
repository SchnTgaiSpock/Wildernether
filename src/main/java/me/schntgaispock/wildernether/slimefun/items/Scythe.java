package me.schntgaispock.wildernether.slimefun.items;

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
import me.schntgaispock.wildernether.slimefun.util.Calc;
import me.schntgaispock.wildernether.slimefun.util.LootTable;
import me.schntgaispock.wildernether.slimefun.util.LootTableCollection;

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

        final Logger logger = Wildernether.getInstance().getLogger();

        final LootTableCollection netherPlantHarvestLoot = LootManager.getNetherPlantHarvest();

        final String name = ChatUtils.removeColorCodes(tool.getItemMeta().getDisplayName());
        String toolName = "";
        switch (name) {
            case "Blackstone Scythe":
            case "Soul Scythe":
                toolName = name.toUpperCase().replace(" ", "_");
                break;
        
            default:
                logger.log(Level.INFO, String.format(
                    "Scythe#onToolUse: Slimefun Item '%s' does not match any existing Scythes", name
                ));
                break;
        }

        final LootTable lootTable = netherPlantHarvestLoot
            .getLootTables()
            .get(e.getBlock().getType().toString());

        if (lootTable != null) {

            // To prevent players from just breaking and replanting for items
            e.setDropItems(false);

            if (toolName.length() > 0 && Calc.flip(0.2)) {
                ItemStack toDrop = lootTable
                    .getDistribution(toolName)
                    .getDrop();
                toDrop.setAmount(Calc.clamp(1, fortune, 5));
                e.getBlock().getWorld().dropItemNaturally(e.getBlock().getLocation(), toDrop);
            }
        }
    }

}
