package me.schntgaispock.wildernether.slimefun.items;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;

public class WildernetherCuisine extends UnplaceableBlock {

    int hunger;
    float saturation;

    @ParametersAreNonnullByDefault
    public WildernetherCuisine(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc) {
        this(ig, is, rt, rc, 1);
    }

    @ParametersAreNonnullByDefault
    public WildernetherCuisine(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc, int hunger) {
        this(ig, is, rt, rc, hunger, 1);
    }

    public WildernetherCuisine(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc, int hunger, double saturation) {
        super(ig, is, rt, rc);
        this.hunger = hunger;
        this.saturation = (float) saturation;
    }

    @Override
    public void preRegister() {
        addItemHandler((ItemUseHandler) this::onRightClick);
    }

    @EventHandler
    public void onRightClick(PlayerRightClickEvent e) {
        e.cancel();
        
        Player p = e.getPlayer();

        p.setFoodLevel(Math.min(p.getFoodLevel() + this.hunger, 20));
        p.setSaturation(p.getSaturation() + this.saturation);
    }

}
