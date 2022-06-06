package me.schntgaispock.wildernether.slimefun.items;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;

public class WildernetherCuisine extends UnplaceableBlock {
    
    @ParametersAreNonnullByDefault
    public WildernetherCuisine(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc) {
        super(ig, is, rt, rc);
    }

}
