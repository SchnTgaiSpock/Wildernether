package me.schntgaispock.wildernether.slimefun.items;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import me.schntgaispock.wildernether.slimefun.util.GeneralUtil;

public class WildernetherCuisine extends SlimefunItem {

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

        Player p = e.getPlayer();

        // Full
        if (p.getFoodLevel() > 19) {
            e.cancel();
            return;
        }

        p.playSound(p.getLocation(), Sound.ENTITY_GENERIC_EAT, SoundCategory.PLAYERS, 1, 1);

        p.setFoodLevel(Math.min(p.getFoodLevel() + this.hunger, 20));
        p.setSaturation(p.getSaturation() + this.saturation);

        ItemStack food = e.getItem();
        ItemStack returnItem = GeneralUtil.returnItemAfterUsing(food);

        food.setAmount(food.getAmount() - 1);
        if (returnItem != null) {
            p.getInventory().addItem(returnItem);
        }
        
    }
}
