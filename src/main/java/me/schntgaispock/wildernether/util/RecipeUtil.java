package me.schntgaispock.wildernether.util;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class RecipeUtil {

    @ParametersAreNonnullByDefault
    public static boolean recipesAreEqual(ItemStack[] recipe1, ItemStack[] recipe2) {
        return recipesAreEqual(recipe1, recipe2, true);
    }

    @ParametersAreNonnullByDefault
    public static boolean recipesAreEqual(ItemStack[] recipe1, ItemStack[] recipe2, boolean ignoreStackSize) {
        boolean sameRecipe = true;
        int i;
        for (i = 0; i < 9; i++) {
            if ((recipe1[i] == null) && (recipe2[i] == null)) {
                continue;
            } else if (
                recipe1[i] == null ||
                !(ignoreStackSize ? recipe1[i].isSimilar(recipe2[i]) : recipe1[i].equals(recipe2[i]))
            ) {
                sameRecipe = false;
                break;
            }
        }
        return sameRecipe;
    }

    public static int recipeHash(ItemStack[] recipe) {
        String recipeString = "";
        for (ItemStack item : recipe) {
            if (item != null) {
                recipeString += item.getType().name();

                SlimefunItem sfitem = SlimefunItem.getByItem(item);
                if (sfitem != null) {
                    recipeString += "|" + sfitem.getId();
                }
            }
            recipeString += "\n";
        }

        return recipeString.hashCode();
    }

    public static ItemStack[] reduceRecipe(ItemStack[] recipe) {
        ItemStack[] reduced = new ItemStack[recipe.length];
        for (int i = 0; i < reduced.length; i++) {
            if (recipe[i] != null) {
                reduced[i] = recipe[i].clone();
                reduced[i].setAmount(1);
            } else {
                reduced[i] = null;
            }
        }
        return reduced;
    }
}
