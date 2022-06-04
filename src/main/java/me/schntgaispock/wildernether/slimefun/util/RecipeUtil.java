package me.schntgaispock.wildernether.slimefun.util;

import java.util.HashMap;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.slimefun.WildernetherRecipes;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;

public class RecipeUtil {
    
    @Getter
    private static HashMap<ItemStack[], ItemStack> outputByRecipe = new HashMap<>();

    static {
        outputByRecipe.put(WildernetherRecipes.BAKED_NETHER_TUBERS, WildernetherStacks.BAKED_NETHER_TUBERS.clone());

        outputByRecipe.put(WildernetherRecipes.NETHER_CHIPS, WildernetherStacks.NETHER_CHIPS.clone());
        outputByRecipe.put(WildernetherRecipes.FRIED_CRIMSON_FUNGUS, WildernetherStacks.FRIED_CRIMSON_FUNGUS.clone());
        outputByRecipe.put(WildernetherRecipes.FRIED_WARPED_FUNGUS, WildernetherStacks.FRIED_WARPED_FUNGUS.clone());

        outputByRecipe.put(WildernetherRecipes.CRIMSON_STEW, WildernetherStacks.CRIMSON_STEW.clone());
        outputByRecipe.put(WildernetherRecipes.WARPED_STEW, WildernetherStacks.WARPED_STEW.clone());
        outputByRecipe.put(WildernetherRecipes.NETHER_HOTPOT, WildernetherStacks.NETHER_HOTPOT.clone());
    }

}
