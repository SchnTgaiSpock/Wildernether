package me.schntgaispock.wildernether.slimefun.managers;


import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.WildernetherGroups;
import me.schntgaispock.wildernether.slimefun.WildernetherRecipes;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove;
import me.schntgaispock.wildernether.slimefun.items.Scythe;

public class ItemManager {

    public static SlimefunItem CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;

    public static SlimefunItem BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER, BLACKSTONE_STOVE;

    public static SlimefunItem WARPED_CACTUS, BLAZESPROUT, NETHER_TUBERS, CRYSTAL_MUSHROOM,
        SHROOMLIGHT_SPORES, CRIMSON_DREADLOCKS, WARPED_ROSE, TWISTED_BEAN_SPROUT, RED_SPIDER_LILY, WARPED_LOTUS;
    public static SlimefunItem GARDEN_OF_THE_LOST_SOUL, TULIP_OF_PARTINGS, BLOOM_OF_UNHEARD_CRIES,
    BLOSSOM_OF_SOLITUDE, LAMENT_OF_THE_DAMNED;

    public static SlimefunItem BAKED_NETHER_TUBERS;
    public static SlimefunItem NETHER_CHIPS, FRIED_WARPED_FUNGUS, FRIED_CRIMSON_FUNGUS;
    public static SlimefunItem CRIMSON_STEW, WARPED_STEW, NETHER_HOTPOT;


    public static void setup() {
        SlimefunAddon wn = Wildernether.getInstance();

        WildernetherGroups.WILDERNETHER.register(wn);

        // ---------- Materials ----------
        CRIMSON_FRAME = new SlimefunItem(
            WildernetherGroups.MATERIALS,
            WildernetherStacks.CRIMSON_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.CRIMSON_FRAME
        );

        WARPED_FRAME = new SlimefunItem(
            WildernetherGroups.MATERIALS,
            WildernetherStacks.WARPED_FRAME,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.WARPED_FRAME
        );

        SOUL_STONE = new SlimefunItem(
            WildernetherGroups.MATERIALS,
            WildernetherStacks.SOUL_STONE,
            RecipeType.ANCIENT_ALTAR,
            WildernetherRecipes.SOUL_STONE
        );

        // ---------- Tools ----------
        BLACKSTONE_SCYTHE = new Scythe(
            WildernetherGroups.TOOLS,
            WildernetherStacks.BLACKSTONE_SCYTHE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.BLACKSTONE_SCYTHE
        );

        SOUL_SCYTHE = new Scythe(
            WildernetherGroups.TOOLS,
            WildernetherStacks.SOUL_SCYTHE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.SOUL_SCYTHE
        );

        NETHER_COMPOSTER = new SlimefunItem(
            WildernetherGroups.TOOLS,
            WildernetherStacks.NETHER_COMPOSTER,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.NETHER_COMPOSTER
        );

        BLACKSTONE_STOVE = new BlackstoneStove(
            WildernetherGroups.TOOLS,
            WildernetherStacks.BLACKSTONE_STOVE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.BLACKSTONE_STOVE
        );

        // ---------- Plants ----------
        WARPED_CACTUS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.WARPED_CACTUS,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        BLAZESPROUT = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.BLAZESPROUT,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        NETHER_TUBERS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.NETHER_TUBERS,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        CRYSTAL_MUSHROOM = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.CRYSTAL_MUSHROOM,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        SHROOMLIGHT_SPORES = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.SHROOMLIGHT_SPORES,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        CRIMSON_DREADLOCKS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.CRIMSON_DREADLOCKS,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        WARPED_ROSE = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.WARPED_ROSE,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        TWISTED_BEAN_SPROUT = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.TWISTED_BEAN_SPROUT,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        RED_SPIDER_LILY = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.RED_SPIDER_LILY,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        WARPED_LOTUS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.WARPED_LOTUS,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        // ---------- Secret ----------
        GARDEN_OF_THE_LOST_SOUL = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.GARDEN_OF_THE_LOST_SOUL,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        TULIP_OF_PARTINGS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.TULIP_OF_PARTINGS,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        BLOOM_OF_UNHEARD_CRIES = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.BLOOM_OF_UNHEARD_CRIES,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        BLOSSOM_OF_SOLITUDE = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.BLOSSOM_OF_SOLITUDE,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        LAMENT_OF_THE_DAMNED = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.LAMENT_OF_THE_DAMNED,
            WildernetherRecipes.RecipeTypes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        // ---------- Cuisine ----------
        BAKED_NETHER_TUBERS = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.BAKED_NETHER_TUBERS,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_OVEN,
            WildernetherRecipes.BAKED_NETHER_TUBERS
        );
        
        NETHER_CHIPS = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.NETHER_CHIPS,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_FRYING,
            WildernetherRecipes.NETHER_CHIPS
        );
        
        FRIED_WARPED_FUNGUS = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.FRIED_WARPED_FUNGUS,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_FRYING,
            WildernetherRecipes.FRIED_WARPED_FUNGUS
        );
        
        FRIED_CRIMSON_FUNGUS = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.FRIED_CRIMSON_FUNGUS,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_FRYING,
            WildernetherRecipes.FRIED_CRIMSON_FUNGUS
        );

        CRIMSON_STEW = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.CRIMSON_STEW,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_SOUP,
            WildernetherRecipes.CRIMSON_STEW
        );
        
        WARPED_STEW = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.WARPED_STEW,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_SOUP,
            WildernetherRecipes.WARPED_STEW
        );
        
        NETHER_HOTPOT = new SlimefunItem(
            WildernetherGroups.CUISINE,
            WildernetherStacks.NETHER_HOTPOT,
            WildernetherRecipes.RecipeTypes.BLACKSTONE_STOVE_SOUP,
            WildernetherRecipes.NETHER_HOTPOT
        );

        // ---------- Registration ----------        
        GARDEN_OF_THE_LOST_SOUL.setHidden(true);
        TULIP_OF_PARTINGS.setHidden(true);
        BLOOM_OF_UNHEARD_CRIES.setHidden(true);
        BLOSSOM_OF_SOLITUDE.setHidden(true);
        LAMENT_OF_THE_DAMNED.setHidden(true);


        CRIMSON_FRAME.register(wn);
        WARPED_FRAME.register(wn);
        SOUL_STONE.register(wn);

        BLACKSTONE_SCYTHE.register(wn);
        SOUL_SCYTHE.register(wn);
        NETHER_COMPOSTER.register(wn);
        BLACKSTONE_STOVE.register(wn);

        WARPED_CACTUS.register(wn);
        BLAZESPROUT.register(wn);
        NETHER_TUBERS.register(wn);
        CRYSTAL_MUSHROOM.register(wn);
        SHROOMLIGHT_SPORES.register(wn);
        CRIMSON_DREADLOCKS.register(wn);
        WARPED_ROSE.register(wn);
        TWISTED_BEAN_SPROUT.register(wn);
        RED_SPIDER_LILY.register(wn);
        WARPED_LOTUS.register(wn);

        GARDEN_OF_THE_LOST_SOUL.register(wn);
        TULIP_OF_PARTINGS.register(wn);
        BLOOM_OF_UNHEARD_CRIES.register(wn);
        BLOSSOM_OF_SOLITUDE.register(wn);
        LAMENT_OF_THE_DAMNED.register(wn);
        
        BAKED_NETHER_TUBERS.register(wn);
        NETHER_CHIPS.register(wn);
        FRIED_WARPED_FUNGUS.register(wn);
        FRIED_CRIMSON_FUNGUS.register(wn);
        CRIMSON_STEW.register(wn);
        WARPED_STEW.register(wn);
        NETHER_HOTPOT.register(wn);
    }
}
