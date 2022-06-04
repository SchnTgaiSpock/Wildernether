package me.schntgaispock.wildernether.slimefun.items;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.mooy1.infinitylib.machines.MenuBlock;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import lombok.Getter;
import lombok.Setter;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

public class BlackstoneStove extends MenuBlock {

    public enum Mode {
        Oven, Frying, Soup
    }

    public static final int[] GUI_BACKGROUND_SLOTS = {
        0,  1,  2,  3,  4,  5,  6,  7,  8,
        9,      11,             15,     17,
        18,     20,             24,     26,
        27,     29,             33,     35,
        36, 37, 38, 39, 40, 41, 42, 43, 44,
        45, 46, 47, 48,     50, 51, 52, 53
    };
    public static final int[] GUI_BOWL_SLOTS = { 10, 28 };
    public static final int[] GUI_RECIPE_SLOTS = { 30, 31, 32 };
    public static final int[] GUI_OUTPUT_SLOTS = { 16, 34 };
    public static final int[] GUI_COOK_SLOTS = { 49 };

    public static final int BOWL_SLOT = 19;
    public static final int[] RECIPE_SLOTS = { 12, 13, 14, 21, 22, 23 };
    public static final int COOK_SLOT = GUI_COOK_SLOTS[0];
    public static final String COOK_CONFIRM_NAME = "Click to cook!";

    public static final ItemStack BOWL_BORDER_ITEM = new CustomItemStack(Material.FIRE, "&9Bowl", "&7Only soup recipes need a bowl!");
    public static final ItemStack RECIPE_BORDER_ITEM = new CustomItemStack(Material.FIRE, "&6Recipe");
    
    @Getter
    @Setter
    private Mode mode;

    @ParametersAreNonnullByDefault
    public BlackstoneStove(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc) {
        this(ig, is, rt, rc, Mode.Oven);
    }
    @ParametersAreNonnullByDefault
    public BlackstoneStove(ItemGroup ig, SlimefunItemStack is, RecipeType rt, ItemStack[] rc, Mode mode) {
        super(ig, is, rt, rc);
        this.mode = mode;
    }

    public static ItemStack getCraftConfirmItem(@Nonnull Mode mode) {
        return new CustomItemStack(Material.ORANGE_STAINED_GLASS_PANE, "&6" + COOK_CONFIRM_NAME, "&7Mode:", "&f" + mode.toString());
    }

    @Override
    protected void setup(BlockMenuPreset preset) {
        preset.drawBackground(GUI_BACKGROUND_SLOTS);
        preset.drawBackground(BOWL_BORDER_ITEM, GUI_BOWL_SLOTS);
        preset.drawBackground(RECIPE_BORDER_ITEM, GUI_RECIPE_SLOTS);
        preset.drawBackground(OUTPUT_BORDER, GUI_OUTPUT_SLOTS);
        preset.drawBackground(getCraftConfirmItem(this.mode), GUI_COOK_SLOTS);
    }

    @Override
    protected int[] getInputSlots() {
        return new int[0];
    }

    @Override
    protected int[] getOutputSlots() {
        return new int[0];
    }
}
