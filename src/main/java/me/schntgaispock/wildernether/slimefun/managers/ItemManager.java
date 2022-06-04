package me.schntgaispock.wildernether.slimefun.managers;


import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.WildernetherGroups;
import me.schntgaispock.wildernether.slimefun.WildernetherRecipes;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;

public class ItemManager {

    public static SlimefunItem CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;

    public static SlimefunItem BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER;

    public static SlimefunItem WARPED_CACTUS, BLAZESPROUT, NETHER_TUBERS, CRYSTAL_MUSHROOM,
        SHROOMLIGHT_SPORES, CRIMSON_DREADLOCKS, WARPED_ROSE, TWISTED_BEAN_SPROUT, RED_SPIDER_LILY, WARPED_LOTUS;

    public static SlimefunItem GARDEN_OF_THE_LOST_SOUL, TULIP_OF_PARTINGS, BLOOM_OF_UNHEARD_CRIES,
    BLOSSOM_OF_SOLITUDE, LAMENT_OF_THE_DAMNED;


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
        BLACKSTONE_SCYTHE = new SlimefunItem(
            WildernetherGroups.TOOLS,
            WildernetherStacks.BLACKSTONE_SCYTHE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            WildernetherRecipes.BLACKSTONE_SCYTHE
        );

        SOUL_SCYTHE = new SlimefunItem(
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

        // ---------- Plants ----------
        WARPED_CACTUS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.WARPED_CACTUS,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        BLAZESPROUT = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.BLAZESPROUT,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        NETHER_TUBERS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.NETHER_TUBERS,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        CRYSTAL_MUSHROOM = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.CRYSTAL_MUSHROOM,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        SHROOMLIGHT_SPORES = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.SHROOMLIGHT_SPORES,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        CRIMSON_DREADLOCKS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.CRIMSON_DREADLOCKS,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        WARPED_ROSE = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.WARPED_ROSE,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        TWISTED_BEAN_SPROUT = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.TWISTED_BEAN_SPROUT,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        RED_SPIDER_LILY = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.RED_SPIDER_LILY,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        WARPED_LOTUS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.WARPED_LOTUS,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        // ---------- Secret ----------
        GARDEN_OF_THE_LOST_SOUL = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.GARDEN_OF_THE_LOST_SOUL,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        TULIP_OF_PARTINGS = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.TULIP_OF_PARTINGS,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        BLOOM_OF_UNHEARD_CRIES = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.BLOOM_OF_UNHEARD_CRIES,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        BLOSSOM_OF_SOLITUDE = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.BLOSSOM_OF_SOLITUDE,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );

        LAMENT_OF_THE_DAMNED = new SlimefunItem(
            WildernetherGroups.PLANTS,
            WildernetherStacks.LAMENT_OF_THE_DAMNED,
            WildernetherRecipes.BREAK_NETHER_PLANTS,
            new ItemStack[9]
        );
        
        GARDEN_OF_THE_LOST_SOUL.setHidden(true);
        TULIP_OF_PARTINGS.setHidden(true);
        BLOOM_OF_UNHEARD_CRIES.setHidden(true);
        BLOSSOM_OF_SOLITUDE.setHidden(true);
        LAMENT_OF_THE_DAMNED.setHidden(true);
    }
}
