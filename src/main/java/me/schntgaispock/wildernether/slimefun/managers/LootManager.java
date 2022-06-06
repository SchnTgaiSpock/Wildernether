package me.schntgaispock.wildernether.slimefun.managers;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;
import me.schntgaispock.wildernether.slimefun.util.LootTable;
import me.schntgaispock.wildernether.slimefun.util.LootTableCollection;

public class LootManager {


    // Common, uncommon, rare, legendary, and secret item weights
    static final double CW = 500.0;
    static final double UW = 100.0;
    static final double RW = 25.0;
    static final double LW = 10.0;
    static final double SW = 1.0;
    
    @Getter
    static LootTableCollection netherPlantHarvest;

    public static void setup() {

        netherPlantHarvest = new LootTableCollection();

        final String[] SCYTHE_TOOL_NAMES = {
            "BLACKSTONE_SCYTHE",
            "SOUL_SCYTHE"
        };


        netherPlantHarvest.put(
            "NETHER_SPROUTS",
            new LootTable(
                "NETHER_SPROUTS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.BLAZESPROUT,
                    WildernetherStacks.NETHER_TUBERS,
                    WildernetherStacks.SHROOMLIGHT_SPORES,
                    WildernetherStacks.TWISTED_BEAN_SPROUT,

                    WildernetherStacks.GARDEN_OF_THE_LOST_SOUL,
                }, 
                new double[][] {
                    { CW/3, CW/3, CW/3, UW, SW },
                    { CW/3, CW/3, CW/3, UW, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "WARPED_ROOTS",
            new LootTable(
                "WARPED_ROOTS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.WARPED_CACTUS,
                    WildernetherStacks.BLAZESPROUT,
                    WildernetherStacks.NETHER_TUBERS,
                    WildernetherStacks.WARPED_ROSE,
                    WildernetherStacks.WARPED_LOTUS,

                    WildernetherStacks.TULIP_OF_PARTINGS,
                }, 
                new double[][] {
                    { CW/4, CW/4, CW/4, CW/4, UW, SW },
                    { CW/4, CW/4, CW/4, CW/4, UW, 3*SW },
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "WARPED_FUNGUS",
            new LootTable(
                "WARPED_FUNGUS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.WARPED_CACTUS,
                    WildernetherStacks.CRYSTAL_MUSHROOM,
                    WildernetherStacks.WARPED_ROSE,
                    WildernetherStacks.WARPED_LOTUS,

                    WildernetherStacks.TULIP_OF_PARTINGS,
                }, 
                new double[][] {
                    { CW/3, CW/3, CW/3, UW, SW },
                    { CW/3, CW/3, CW/3, UW, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "TWISTING_VINES",
            new LootTable(
                "TWISTING_VINES_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.WARPED_CACTUS,
                    WildernetherStacks.TWISTED_BEAN_SPROUT,

                    WildernetherStacks.BLOOM_OF_UNHEARD_CRIES,
                }, 
                new double[][] {
                    { CW, UW, SW },
                    { CW, UW, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "CRIMSON_ROOTS",
            new LootTable(
                "CRIMSON_ROOTS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.BLAZESPROUT,
                    WildernetherStacks.NETHER_TUBERS,
                    WildernetherStacks.RED_SPIDER_LILY,

                    WildernetherStacks.BLOSSOM_OF_SOLITUDE,
                }, 
                new double[][] {
                    { CW/2, CW/2, UW, SW },
                    { CW/2, CW/2, UW, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "CRIMSON_FUNGUS",
            new LootTable(
                "CRIMSON_FUNGUS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.CRYSTAL_MUSHROOM,
                    WildernetherStacks.CRIMSON_DREADLOCKS,
                    WildernetherStacks.RED_SPIDER_LILY,

                    WildernetherStacks.GARDEN_OF_THE_LOST_SOUL,
                }, 
                new double[][] {
                    { CW, UW/2, UW/2, SW },
                    { CW, UW/2, UW/2, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "WEEPING_VINES",
            new LootTable(
                "WEEPING_VINES_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.SHROOMLIGHT_SPORES,
                    WildernetherStacks.CRIMSON_DREADLOCKS,
                    WildernetherStacks.RED_SPIDER_LILY,

                    WildernetherStacks.LAMENT_OF_THE_DAMNED,
                }, 
                new double[][] {
                    { CW, UW/2, UW/2, SW },
                    { CW, UW/2, UW/2, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        ).put(
            "SHROOMLIGHT",
            new LootTable(
                "SHROOMLIGHT_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.SHROOMLIGHT_SPORES,

                    WildernetherStacks.BLOOM_OF_UNHEARD_CRIES,
                }, 
                new double[][] {
                    { CW, SW },
                    { CW, 3*SW }
                },
                SCYTHE_TOOL_NAMES
            )
        );
    }

}
