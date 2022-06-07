package me.schntgaispock.wildernether.slimefun.listeners;

import java.util.HashMap;
import java.util.Map;

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
import me.schntgaispock.wildernether.slimefun.util.GeneralUtil;
import me.schntgaispock.wildernether.slimefun.util.Theme;
import me.schntgaispock.wildernether.slimefun.util.RecipeUtil.RecipeCollection;
import me.schntgaispock.wildernether.slimefun.util.RecipeUtil.StoveRecipe;

public class BlackstoneStoveListener implements Listener {

    @EventHandler
    public void onClick(@Nonnull InventoryClickEvent e) {
        ItemStack clickedItem = e.getCurrentItem();


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
        Mode mode = Mode.valueOf(ChatUtils.removeColorCodes(clickedItem.getItemMeta().getLore().get(0).split(" ")[1])); // Second line of lore

        // Parse recipe, check if in existing recipes
        ItemStack[] currentRecipe = new ItemStack[9];
        for (int i = 0; i < 6; i++) {
            int slot = BlackstoneStove.RECIPE_SLOTS[i];
            currentRecipe[i] = e.getInventory().getItem(slot);
        }
        currentRecipe[7] = e.getInventory().getItem(BlackstoneStove.BOWL_SLOT);

        RecipeCollection<StoveRecipe> recipeCollection;
        switch (mode) {
            case Frying:
                recipeCollection = WildernetherRecipes.RecipeCollections.BLACKSTONE_STOVE_FRYING;
                break;
                
            case Pot:
                recipeCollection = WildernetherRecipes.RecipeCollections.BLACKSTONE_STOVE_POT;
                break;

            default:
                recipeCollection = WildernetherRecipes.RecipeCollections.BLACKSTONE_STOVE_OVEN;
                break;
        }

        ItemStack recipeOutput = recipeCollection.getOrNull(currentRecipe);
        if (recipeOutput == null) {
            e.getWhoClicked().sendMessage(Theme.CUISINE.getColor() + "Invalid " + mode.toString().toLowerCase() + " recipe!");
            return;
        }

        // Put output in output slot if there is space
        int outputSlot = BlackstoneStove.OUTPUT_SLOT;
        ItemStack currentlyInOutput = e.getInventory().getItem(outputSlot);

        
        if (currentlyInOutput == null) {
            // Success
            e.getInventory().setItem(outputSlot, recipeOutput.clone());
        } else if (recipeOutput.isSimilar(currentlyInOutput)) {
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

        // Reduce input items by 1, gives buckets and bowls back
        for (ItemStack item : currentRecipe) {
            if (item != null) {
                item.setAmount(item.getAmount() - 1);
                ItemStack returnItem = GeneralUtil.returnItemAfterUsing(item);

                Map<Integer, ItemStack> leftOvers = new HashMap<Integer, ItemStack>();
                if (returnItem != null &&
                    !(leftOvers = e.getWhoClicked().getInventory().addItem(returnItem)).isEmpty() &&
                    !(leftOvers = e.getInventory().addItem(leftOvers.get(0))).isEmpty()) {
                    e.getWhoClicked().getWorld().dropItemNaturally(e.getWhoClicked().getLocation(), leftOvers.get(0));
                }
            }
        }
    }
    
    public static void setup() {
        Bukkit.getPluginManager().registerEvents((Listener) new BlackstoneStoveListener(),
            (Plugin) Wildernether.getInstance());
    }

}
