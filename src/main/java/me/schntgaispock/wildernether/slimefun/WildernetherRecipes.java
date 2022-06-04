package me.schntgaispock.wildernether.slimefun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.schntgaispock.wildernether.Wildernether;

public class WildernetherRecipes {
    public static final RecipeType BREAK_NETHER_PLANTS = new RecipeType(
        Wildernether.newNamespacedKey("break_nether_plants"), WildernetherStacks.RECIPE_BREAK_NETHER_PLANTS);

    public static final ItemStack[] CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE, BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER;

    static {
        CRIMSON_FRAME = new ItemStack[] {
            new ItemStack(Material.CRIMSON_SLAB), new ItemStack(Material.CRIMSON_SLAB), new ItemStack(Material.CRIMSON_SLAB),
            new ItemStack(Material.STICK), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.STICK),
            new ItemStack(Material.CRIMSON_SLAB), new ItemStack(Material.CRIMSON_SLAB), new ItemStack(Material.CRIMSON_SLAB)
        };

        WARPED_FRAME = new ItemStack[] {
            new ItemStack(Material.WARPED_SLAB), new ItemStack(Material.WARPED_SLAB), new ItemStack(Material.WARPED_SLAB),
            new ItemStack(Material.STICK), new ItemStack(Material.IRON_INGOT), new ItemStack(Material.STICK),
            new ItemStack(Material.WARPED_SLAB), new ItemStack(Material.WARPED_SLAB), new ItemStack(Material.WARPED_SLAB)
        };
        
        SOUL_STONE = new ItemStack[] {
            new ItemStack(Material.SOUL_SOIL), new ItemStack(Material.SOUL_SAND), new ItemStack(Material.SOUL_SOIL),
            new ItemStack(Material.SOUL_SAND), new ItemStack(Material.LODESTONE), new ItemStack(Material.SOUL_SAND),
            new ItemStack(Material.SOUL_SOIL), new ItemStack(Material.SOUL_SAND), new ItemStack(Material.SOUL_SOIL)
        };
        
        BLACKSTONE_SCYTHE = new ItemStack[] {
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.BLACKSTONE), new ItemStack(Material.STICK),
            null, null, new ItemStack(Material.STICK),
            null, null, new ItemStack(Material.STICK)
        };
        
        SOUL_SCYTHE = new ItemStack[] {
            WildernetherStacks.SOUL_STONE, WildernetherStacks.SOUL_STONE, new ItemStack(Material.STICK),
            null, null, new ItemStack(Material.STICK),
            null, null, new ItemStack(Material.STICK)
        };
        
        NETHER_COMPOSTER = new ItemStack[] {
            WildernetherStacks.CRIMSON_FRAME, null, WildernetherStacks.CRIMSON_FRAME,
            new ItemStack(Material.CRIMSON_SLAB), null, new ItemStack(Material.CRIMSON_SLAB),
            WildernetherStacks.CRIMSON_FRAME, new ItemStack(Material.COMPOSTER), WildernetherStacks.CRIMSON_FRAME
        };
    }
}