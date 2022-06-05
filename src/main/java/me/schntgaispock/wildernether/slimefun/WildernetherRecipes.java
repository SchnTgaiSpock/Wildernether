package me.schntgaispock.wildernether.slimefun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove.Mode;
import me.schntgaispock.wildernether.slimefun.util.RecipeUtil.StoveRecipe;
import me.schntgaispock.wildernether.slimefun.util.RecipeUtil.RecipeCollection;

public class WildernetherRecipes {
    
    public static class RecipeTypes {

        public static final RecipeType BREAK_NETHER_PLANTS = new RecipeType(
            Wildernether.newNamespacedKey("break_nether_plants"), WildernetherStacks.RECIPE_BREAK_NETHER_PLANTS
        );
        public static final RecipeType BLACKSTONE_STOVE_OVEN = new RecipeType(
            Wildernether.newNamespacedKey("blackstone_stove_oven"), WildernetherStacks.RECIPE_BLACKSTONE_STOVE_OVEN
        );
        public static final RecipeType BLACKSTONE_STOVE_FRYING = new RecipeType(
            Wildernether.newNamespacedKey("blackstone_stove_frying"), WildernetherStacks.RECIPE_BLACKSTONE_STOVE_FRYING
        );
        public static final RecipeType BLACKSTONE_STOVE_SOUP = new RecipeType(
            Wildernether.newNamespacedKey("blackstone_stove_soup"), WildernetherStacks.RECIPE_BLACKSTONE_STOVE_SOUP
        );
    }


    public static class RecipeCollections {

        public static final RecipeCollection<StoveRecipe> BLACKSTONE_STOVE_OVEN = new RecipeCollection<StoveRecipe>("BLACKSTONE_STOVE_OVEN");
        public static final RecipeCollection<StoveRecipe> BLACKSTONE_STOVE_FRYING = new RecipeCollection<StoveRecipe>("BLACKSTONE_STOVE_FRYING");
        public static final RecipeCollection<StoveRecipe> BLACKSTONE_STOVE_SOUP = new RecipeCollection<StoveRecipe>("BLACKSTONE_STOVE_SOUP");

        static {
            BLACKSTONE_STOVE_OVEN.add(new StoveRecipe(
                BAKED_NETHER_TUBERS, WildernetherStacks.BAKED_NETHER_TUBERS, Mode.Oven
            ));
            
            BLACKSTONE_STOVE_FRYING.add(new StoveRecipe(
                NETHER_CHIPS, WildernetherStacks.NETHER_CHIPS, Mode.Frying
            ));
            BLACKSTONE_STOVE_FRYING.add(new StoveRecipe(
                FRIED_WARPED_FUNGUS, WildernetherStacks.FRIED_WARPED_FUNGUS, Mode.Frying
            ));
            BLACKSTONE_STOVE_FRYING.add(new StoveRecipe(
                FRIED_CRIMSON_FUNGUS, WildernetherStacks.FRIED_CRIMSON_FUNGUS, Mode.Frying
            ));

            BLACKSTONE_STOVE_SOUP.add(new StoveRecipe(
                CRIMSON_STEW, WildernetherStacks.CRIMSON_STEW, Mode.Soup
            ));
            BLACKSTONE_STOVE_SOUP.add(new StoveRecipe(
                WARPED_STEW, WildernetherStacks.WARPED_STEW, Mode.Soup
            ));
            BLACKSTONE_STOVE_SOUP.add(new StoveRecipe(
                NETHER_HOTPOT, WildernetherStacks.NETHER_HOTPOT, Mode.Soup
            ));
        }
    }

    public static final ItemStack[] CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;

    public static final ItemStack[] BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER, BLACKSTONE_STOVE;

    public static final ItemStack[] BAKED_NETHER_TUBERS;
    public static final ItemStack[] NETHER_CHIPS, FRIED_WARPED_FUNGUS, FRIED_CRIMSON_FUNGUS;
    public static final ItemStack[] CRIMSON_STEW, WARPED_STEW, NETHER_HOTPOT;

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
            WildernetherStacks.SOUL_STONE.clone(), WildernetherStacks.SOUL_STONE.clone(), new ItemStack(Material.STICK),
            null, null, new ItemStack(Material.STICK),
            null, null, new ItemStack(Material.STICK)
        };
        
        NETHER_COMPOSTER = new ItemStack[] {
            WildernetherStacks.CRIMSON_FRAME.clone(), null, WildernetherStacks.CRIMSON_FRAME.clone(),
            new ItemStack(Material.CRIMSON_SLAB), null, new ItemStack(Material.CRIMSON_SLAB),
            WildernetherStacks.CRIMSON_FRAME.clone(), new ItemStack(Material.COMPOSTER), WildernetherStacks.CRIMSON_FRAME.clone()
        };
        
        BLACKSTONE_STOVE = new ItemStack[] {
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.BLACKSTONE), new ItemStack(Material.BLACKSTONE),
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.FLINT_AND_STEEL), new ItemStack(Material.BLACKSTONE),
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.NETHERRACK), new ItemStack(Material.BLACKSTONE)
        };

        CRIMSON_STEW = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS.clone(), new ItemStack(Material.CRIMSON_ROOTS), new ItemStack(Material.CRIMSON_FUNGUS),
            WildernetherStacks.CRIMSON_DREADLOCKS.clone(), null, null,
            null, new ItemStack(Material.BOWL), null
        };

        WARPED_STEW = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS.clone(), new ItemStack(Material.WARPED_ROOTS), new ItemStack(Material.WARPED_FUNGUS),
            WildernetherStacks.TWISTED_BEAN_SPROUT.clone(), null, null,
            null, new ItemStack(Material.BOWL), null
        };

        NETHER_HOTPOT = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS.clone(), new ItemStack(Material.NETHER_SPROUTS), new ItemStack(Material.COOKED_PORKCHOP),
            SlimefunItems.SALT, null, null,
            null, new ItemStack(Material.BOWL), null
        };

        BAKED_NETHER_TUBERS = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS.clone(), null, null,
            null, null, null,
            null, null, null
        };

        NETHER_CHIPS = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS.clone(), null, null,
            null, null, null,
            null, null, null
        };

        FRIED_CRIMSON_FUNGUS = new ItemStack[] {
            new ItemStack(Material.CRIMSON_FUNGUS), null, null,
            null, null, null,
            null, null, null
        };

        FRIED_WARPED_FUNGUS = new ItemStack[] {
            new ItemStack(Material.WARPED_FUNGUS), null, null,
            null, null, null,
            null, null, null
        };
    }
}