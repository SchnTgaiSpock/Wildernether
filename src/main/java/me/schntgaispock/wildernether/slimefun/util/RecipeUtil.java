package me.schntgaispock.wildernether.slimefun.util;

import java.util.HashMap;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove.Mode;

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
        
    public static abstract class GenericRecipe {

        private @Getter ItemStack[] recipe;
        private ItemStack output;

        @ParametersAreNonnullByDefault
        public GenericRecipe(ItemStack[] recipe, ItemStack output) {
            this.recipe = recipe;
            this.output = output;
        }

        public ItemStack getOutput() {
            return output.clone();
        }
    }

    public static class StoveRecipe extends GenericRecipe {

        private @Getter Mode mode;

        @ParametersAreNonnullByDefault
        public StoveRecipe(ItemStack[] recipe, @Nullable ItemStack output, Mode mode) {
            super(recipe, output);
            this.mode = mode;
        }
    }

    public static class RecipeCollection<R extends GenericRecipe> {

        private HashMap<ItemStack[], ItemStack> recol;
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
            recol.put(recipe.getRecipe(), recipe.getOutput());
            return this;
        }

        @Nullable
        public ItemStack getOrNull(@Nonnull ItemStack[] recipe) {
            @Nullable ItemStack output = null;
            for (ItemStack[] check : this.recol.keySet()) {
                if (recipesAreEqual(check, recipe)) {
                    output = this.recol.get(check);
                    break;
                }
            }
            return output;
        }
    }
}
