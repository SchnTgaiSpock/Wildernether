package me.schntgaispock.wildernether.slimefun.recipes;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.util.RecipeUtil;

public abstract class GenericRecipe {

    @Getter ItemStack[] recipe;
    ItemStack output;

    @ParametersAreNonnullByDefault
    public GenericRecipe(ItemStack[] recipe, ItemStack output) {
        this.recipe = RecipeUtil.reduceRecipe(recipe);
        this.output = output;
    }

    public ItemStack getOutput() {
        return output.clone();
    }
}