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
        public static final RecipeType BLACKSTONE_STOVE_POT = new RecipeType(
            Wildernether.newNamespacedKey("BLACKSTONE_STOVE_POT"), WildernetherStacks.RECIPE_BLACKSTONE_STOVE_POT
        );
    }


    public static class RecipeCollections {

        public static final RecipeCollection<StoveRecipe> BLACKSTONE_STOVE_OVEN =
            new RecipeCollection<StoveRecipe>("BLACKSTONE_STOVE_OVEN")
            .add(new StoveRecipe(
                BAKED_NETHER_TUBERS, WildernetherStacks.BAKED_NETHER_TUBERS, Mode.Oven
            )).add(new StoveRecipe(
                GLOWING_BEANS, WildernetherStacks.GLOWING_BEANS, Mode.Oven
            ));

        public static final RecipeCollection<StoveRecipe> BLACKSTONE_STOVE_FRYING =
            new RecipeCollection<StoveRecipe>("BLACKSTONE_STOVE_FRYING")
            .add(new StoveRecipe(
                NETHER_CHIPS, WildernetherStacks.NETHER_CHIPS, Mode.Frying
            )).add(new StoveRecipe(
                FRIED_WARPED_FUNGUS, WildernetherStacks.FRIED_WARPED_FUNGUS, Mode.Frying
            )).add(new StoveRecipe(
                FRIED_CRIMSON_FUNGUS, WildernetherStacks.FRIED_CRIMSON_FUNGUS, Mode.Frying
            )).add(new StoveRecipe(
                SPICY_FRIED_LOTUS, WildernetherStacks.SPICY_FRIED_LOTUS, Mode.Frying
            ));


        public static final RecipeCollection<StoveRecipe> BLACKSTONE_STOVE_POT =
            new RecipeCollection<StoveRecipe>("BLACKSTONE_STOVE_POT")
            .add(new StoveRecipe(
                CRIMSON_STEW, WildernetherStacks.CRIMSON_STEW, Mode.Pot
            )).add(new StoveRecipe(
                WARPED_STEW, WildernetherStacks.WARPED_STEW, Mode.Pot
            )).add(new StoveRecipe(
                NETHER_HOTPOT, WildernetherStacks.NETHER_HOTPOT, Mode.Pot
            )).add(new StoveRecipe(
                HOGLIN_BOUILLON1, WildernetherStacks.HOGLIN_BOUILLON, Mode.Pot
            )).add(new StoveRecipe(
                HOGLIN_BOUILLON2, WildernetherStacks.HOGLIN_BOUILLON, Mode.Pot
            )).add(new StoveRecipe(
                HOGLIN_BOUILLON3, WildernetherStacks.HOGLIN_BOUILLON, Mode.Pot
            )).add(new StoveRecipe(
                PORK_BONE_SOUP, WildernetherStacks.PORK_BONE_SOUP, Mode.Pot
            )).add(new StoveRecipe(
                PORK_BONE_SOUP, WildernetherStacks.PORK_BONE_SOUP, Mode.Pot
            )).add(new StoveRecipe(
                BOILED_NETHER_TUBERS, WildernetherStacks.BOILED_NETHER_TUBERS, Mode.Pot
            )).add(new StoveRecipe(
                BOILED_WARPED_CACTUS, WildernetherStacks.BOILED_WARPED_CACTUS, Mode.Pot
            ));
    }

    public static final ItemStack[] CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;

    public static final ItemStack[] BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER, BLACKSTONE_STOVE;

    public static final ItemStack[] HOGLIN_BOUILLON_GUIDE, HOGLIN_BOUILLON1, HOGLIN_BOUILLON2, HOGLIN_BOUILLON3,
        HOGLIN_SPARE_RIB, HOGLIN_BELLY, HOGLIN_TROTTERS;
    public static final ItemStack[] WARPED_SALAD, MUSHROOM_SLICES;
    public static final ItemStack[] BAKED_NETHER_TUBERS, GLOWING_BEANS;
    public static final ItemStack[] NETHER_CHIPS, FRIED_WARPED_FUNGUS, FRIED_CRIMSON_FUNGUS, SPICY_FRIED_LOTUS;
    public static final ItemStack[] CRIMSON_STEW, WARPED_STEW, NETHER_HOTPOT, PORK_BONE_SOUP,
        BOILED_NETHER_TUBERS, BOILED_WARPED_CACTUS;

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
        
        BLACKSTONE_STOVE = new ItemStack[] {
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.BLACKSTONE), new ItemStack(Material.BLACKSTONE),
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.FLINT_AND_STEEL), new ItemStack(Material.BLACKSTONE),
            new ItemStack(Material.BLACKSTONE), new ItemStack(Material.NETHERRACK), new ItemStack(Material.BLACKSTONE)
        };

        // ---------- Cuisine ----------
        HOGLIN_BOUILLON_GUIDE = new ItemStack[] {
            WildernetherStacks.GUIDE_RECIPE_HOGLIN_BOUILLON, null, null,
            null, null, null,
            null, new ItemStack(Material.BUCKET), null
        };

        // Ingredients
        HOGLIN_BOUILLON1 = new ItemStack[] {
            WildernetherStacks.HOGLIN_SPARE_RIB, null, null,
            null, null, null,
            null, new ItemStack(Material.BUCKET), null
        };

        HOGLIN_BOUILLON2 = new ItemStack[] {
            WildernetherStacks.HOGLIN_BELLY, null, null,
            null, null, null,
            null, new ItemStack(Material.BUCKET), null
        };

        HOGLIN_BOUILLON3 = new ItemStack[] {
            WildernetherStacks.HOGLIN_TROTTERS, null, null,
            null, null, null,
            null, new ItemStack(Material.BUCKET), null
        };

        HOGLIN_SPARE_RIB = new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.HOGLIN_SPAWN_EGG), null,
            null, null, null
        };

        HOGLIN_BELLY = new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.HOGLIN_SPAWN_EGG), null,
            null, null, null
        };

        HOGLIN_TROTTERS = new ItemStack[] {
            null, null, null,
            null, new ItemStack(Material.HOGLIN_SPAWN_EGG), null,
            null, null, null
        };

        // Crafted
        WARPED_SALAD = new ItemStack[] {
            WildernetherStacks.BOILED_WARPED_CACTUS, WildernetherStacks.GLOWING_BEANS, new ItemStack(Material.NETHER_SPROUTS),
            new ItemStack(Material.WARPED_ROOTS), null, null,
            null, null, null
        };

        MUSHROOM_SLICES = new ItemStack[] {
            WildernetherStacks.CRYSTAL_MUSHROOM, new ItemStack(Material.WARPED_FUNGUS), new ItemStack(Material.CRIMSON_FUNGUS),
            null, null, null,
            null, null, null
        };

        // Oven
        BAKED_NETHER_TUBERS = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS, null, null,
            null, null, null,
            null, null, null
        };

        GLOWING_BEANS = new ItemStack[] {
            WildernetherStacks.SHROOMLIGHT_SPORES, null, null,
            null, null, null,
            null, null, null
        };

        // Frying
        NETHER_CHIPS = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS, null, null,
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

        SPICY_FRIED_LOTUS = new ItemStack[] {
            WildernetherStacks.WARPED_LOTUS, WildernetherStacks.BLAZESPROUT, null,
            null, null, null,
            null, null, null
        };
        
        // Pot
        CRIMSON_STEW = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS, new ItemStack(Material.CRIMSON_ROOTS), new ItemStack(Material.CRIMSON_FUNGUS),
            WildernetherStacks.CRIMSON_DREADLOCKS, null, null,
            null, new ItemStack(Material.BOWL), null
        };

        WARPED_STEW = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS, new ItemStack(Material.WARPED_ROOTS), new ItemStack(Material.WARPED_FUNGUS),
            WildernetherStacks.TWISTED_BEAN_SPROUT, null, null,
            null, new ItemStack(Material.BOWL), null
        };

        NETHER_HOTPOT = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS, new ItemStack(Material.NETHER_SPROUTS), new ItemStack(Material.COOKED_PORKCHOP),
            SlimefunItems.SALT, null, null,
            null, new ItemStack(Material.BOWL), null
        };

        PORK_BONE_SOUP = new ItemStack[] {
            WildernetherStacks.HOGLIN_BOUILLON, new ItemStack(Material.PORKCHOP), WildernetherStacks.NETHER_TUBERS,
            WildernetherStacks.RED_CARROT, null, null,
            null, new ItemStack(Material.BOWL), null
        };

        BOILED_NETHER_TUBERS = new ItemStack[] {
            WildernetherStacks.NETHER_TUBERS, null, null,
            null, null, null,
            null, null, null
        };

        BOILED_WARPED_CACTUS = new ItemStack[] {
            WildernetherStacks.WARPED_CACTUS, null, null,
            null, null, null,
            null, null, null
        };
    }
}