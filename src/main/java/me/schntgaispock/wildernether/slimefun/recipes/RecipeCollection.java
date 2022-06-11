package me.schntgaispock.wildernether.slimefun.recipes;

import java.util.HashMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.inventory.ItemStack;

import me.schntgaispock.wildernether.util.RecipeUtil;

public class RecipeCollection<R extends GenericRecipe> {

    private HashMap<Integer, ItemStack> recol;
    private String name;
    
    public RecipeCollection(@Nonnull String name) {
        this.recol = new HashMap<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public RecipeCollection<R> add(R recipe) {
        recol.put(RecipeUtil.recipeHash(recipe.getRecipe()), recipe.getOutput());
        return this;
    }

    @Nullable
    public ItemStack getOrNull(@Nonnull ItemStack[] recipe) {
        return this.recol.get(RecipeUtil.recipeHash(recipe));
    }
}