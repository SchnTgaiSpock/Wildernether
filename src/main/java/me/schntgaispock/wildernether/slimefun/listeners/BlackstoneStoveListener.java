package me.schntgaispock.wildernether.slimefun.listeners;

import java.util.Arrays;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Nonnull;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import io.github.thebusybiscuit.slimefun4.utils.ChatUtils;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.WildernetherRecipes;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove.Mode;
import me.schntgaispock.wildernether.slimefun.util.Theme;

public class BlackstoneStoveListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onClick(@Nonnull InventoryClickEvent e) {
        ItemStack clickedItem = e.getCurrentItem();
        Logger logger = Wildernether.getInstance().getLogger();

        // Probably a better way to do this, pls tell me if you know
        if (
            !ChatUtils.removeColorCodes(e.getView().getTitle()).equals("Blackstone Stove") ||
            clickedItem == null ||
            !clickedItem.hasItemMeta() ||
            !ChatUtils.removeColorCodes(clickedItem.getItemMeta().getDisplayName()).equals(BlackstoneStove.COOK_CONFIRM_NAME)
        ) {
            return;
        }

        // Checks passed
        Mode mode = Mode.valueOf(ChatUtils.removeColorCodes(clickedItem.getItemMeta().getLore().get(1))); // Second line of lore

        // Parse recipe, check if in existing recipes
        ItemStack[] currentRecipe = new ItemStack[9];
        for (int i = 0; i < 6; i++) {
            int slot = BlackstoneStove.RECIPE_SLOTS[i];
            currentRecipe[i] = e.getInventory().getItem(slot);
        }
        currentRecipe[8] = e.getInventory().getItem(BlackstoneStove.BOWL_SLOT);

        Set<ItemStack[]> recipeCategory;
        switch (mode) {
            case Frying:
                recipeCategory = WildernetherRecipes.Recipes.BLACKSTONE_STOVE_FRYING;
                break;
                
            case Soup:
                recipeCategory = WildernetherRecipes.Recipes.BLACKSTONE_STOVE_SOUP;
                break;

            default:
                recipeCategory = WildernetherRecipes.Recipes.BLACKSTONE_STOVE_OVEN;
                break;
        }

        ItemStack recipeOutput = WildernetherRecipes.getOutput(currentRecipe, recipeCategory);
        if (recipeOutput == null) {
            logger.log(Level.FINE, "Test fine message");
            logger.log(Level.INFO, "Could not find recipe for " + Arrays.toString(currentRecipe));

            e.getWhoClicked().sendMessage(Theme.CUISINE.getColor() + "Invalid " + mode.toString().toLowerCase() + " recipe!");
            return;
        }

        // Put output in output slot if there is space
        int outputSlot = BlackstoneStove.GUI_OUTPUT_SLOTS[0];
        ItemStack currentlyInOutput = e.getInventory().getItem(outputSlot);
        
        if (currentlyInOutput == null) {
            // Success
            e.getInventory().setItem(outputSlot, recipeOutput.clone());
        } else if (currentlyInOutput.isSimilar(recipeOutput)) {
            // Failure
            if (currentlyInOutput.getMaxStackSize() == currentlyInOutput.getAmount()) {
                e.getWhoClicked().sendMessage(Theme.CUISINE.getColor() + "Output is full!");
                return;
            }
            // Success
            currentlyInOutput.setAmount(currentlyInOutput.getAmount() + 1);
        
        // Failure
        } else {
            e.getWhoClicked().sendMessage(Theme.CUISINE.getColor() + "Output is occupied!");
            return;
        }

        // Reduce input items by 1
        for (ItemStack item : currentRecipe) {
            item.setAmount(item.getAmount() - 1);
        }
    }
    
    public static void setup() {
        Bukkit.getPluginManager().registerEvents((Listener) new BlackstoneStoveListener(),
            (Plugin) Wildernether.getInstance());
    }

}
