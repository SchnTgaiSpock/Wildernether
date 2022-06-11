package me.schntgaispock.wildernether.slimefun.recipes;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove.Mode;

public class StoveRecipe extends GenericRecipe {

    @Getter Mode mode;

    @ParametersAreNonnullByDefault
    public StoveRecipe(ItemStack[] recipe, @Nullable ItemStack output, Mode mode) {
        super(recipe, output);
        this.mode = mode;
    }
}