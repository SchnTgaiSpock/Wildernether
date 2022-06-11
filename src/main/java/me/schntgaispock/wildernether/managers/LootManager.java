package me.schntgaispock.wildernether.managers;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.loot.LootTable;
import me.schntgaispock.wildernether.loot.LootTableCollection;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;

/**
 * Manages the loot for Wildernether
 * 
 * @author SchnTgaiSpock
 */
public class LootManager {

    /**
     * Weights based on rarity
     */
    public static enum RarityRate {        
        COMMON(500.0, 0), UNCOMMON(50.0, 1), RARE(5.0, 2), SECRET(0.5, 3);

        @Getter double rate;
        @Getter int n;

        RarityRate(double r, int n) {
            this.rate = r;
            this.n = n;
        }
    }
    
    @Getter
    final static LootTableCollection netherPlantHarvest = new LootTableCollection();

    public static void setup() {

        final double[] SOUL_SCYTHE_MULIPLIERS = new double[]{ 1.0, 1.0, 1.0, 1.0, 3.0 };

        netherPlantHarvest.put(
            "NETHER_SPROUTS",
            new LootTable("NETHER_SPROUTS_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.BLAZESPROUT,
                        WildernetherStacks.NETHER_TUBERS,
                        WildernetherStacks.SHROOMLIGHT_SPORES,
                        WildernetherStacks.RED_CARROT
                    }, {
                        WildernetherStacks.TWISTED_BEAN_SPROUT,
                        WildernetherStacks.FUNGAL_IRON_SCRAP
                    }, {}, {
                        WildernetherStacks.GARDEN_OF_THE_LOST_SOUL,
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "WARPED_ROOTS",
            new LootTable(
                "WARPED_ROOTS_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.WARPED_CACTUS,
                        WildernetherStacks.BLAZESPROUT,
                        WildernetherStacks.NETHER_TUBERS,
                        WildernetherStacks.WARPED_ROSE,
                        WildernetherStacks.RED_CARROT
                    }, {
                        WildernetherStacks.WARPED_LOTUS,
                        WildernetherStacks.FUNGAL_IRON_SCRAP
                    }, {
                        WildernetherStacks.EMERALD_FIREBLOOM
                    }, {
                        WildernetherStacks.TULIP_OF_PARTINGS
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "WARPED_FUNGUS",
            new LootTable(
                "WARPED_FUNGUS_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.WARPED_CACTUS,
                        WildernetherStacks.CRYSTAL_MUSHROOM,
                        WildernetherStacks.WARPED_ROSE
                    }, {
                        WildernetherStacks.WARPED_LOTUS,
                        WildernetherStacks.FUNGAL_IRON_SCRAP
                    }, {
                        WildernetherStacks.OCTARINE_NETHERCAP
                    }, {
                        WildernetherStacks.TULIP_OF_PARTINGS
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "TWISTING_VINES",
            new LootTable(
                "TWISTING_VINES_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.WARPED_CACTUS
                    }, {
                        WildernetherStacks.TWISTED_BEAN_SPROUT
                    }, {
                        WildernetherStacks.OCTARINE_NETHERCAP,
                        WildernetherStacks.EMERALD_FIREBLOOM
                    }, {
                        WildernetherStacks.BLOOM_OF_UNHEARD_CRIES
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "CRIMSON_ROOTS",
            new LootTable(
                "CRIMSON_ROOTS_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.BLAZESPROUT,
                        WildernetherStacks.NETHER_TUBERS,
                        WildernetherStacks.RED_CARROT
                    }, {
                        WildernetherStacks.RED_SPIDER_LILY,
                        WildernetherStacks.FUNGAL_GOLD_SCRAP
                    }, {
                        WildernetherStacks.SMOLDERING_HERBS
                    }, {
                        WildernetherStacks.BLOSSOM_OF_SOLITUDE,
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "CRIMSON_FUNGUS",
            new LootTable(
                "CRIMSON_FUNGUS_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.CRYSTAL_MUSHROOM
                    }, {
                        WildernetherStacks.CRIMSON_DREADLOCKS,
                        WildernetherStacks.RED_SPIDER_LILY,
                        WildernetherStacks.FUNGAL_GOLD_SCRAP
                    }, {
                        WildernetherStacks.IMMOLATED_VINES
                    }, {
                        WildernetherStacks.GARDEN_OF_THE_LOST_SOUL
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "WEEPING_VINES",
            new LootTable(
                "WEEPING_VINES_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.SHROOMLIGHT_SPORES
                    }, {
                        WildernetherStacks.CRIMSON_DREADLOCKS,
                        WildernetherStacks.RED_SPIDER_LILY
                    }, {
                        WildernetherStacks.SMOLDERING_HERBS,
                        WildernetherStacks.IMMOLATED_VINES
                    }, {
                        WildernetherStacks.LAMENT_OF_THE_DAMNED
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        ).put(
            "SHROOMLIGHT",
            new LootTable(
                "SHROOMLIGHT_HARVEST",
                new ItemStack[][] {
                    {
                        WildernetherStacks.SHROOMLIGHT_SPORES
                    }, {}, {}, {
                        WildernetherStacks.BLOOM_OF_UNHEARD_CRIES
                    }
                }
            ).newDistribution("BLACKSTONE_SCYTHE")
            .newDistribution("SOUL_SCYTHE", SOUL_SCYTHE_MULIPLIERS)
        );
    }

}
