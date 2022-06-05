package me.schntgaispock.wildernether.slimefun.managers;

import java.util.HashMap;
import java.util.logging.Level;

import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.inventory.ItemStack;

import lombok.Getter;
import me.schntgaispock.wildernether.Wildernether;
import me.schntgaispock.wildernether.slimefun.WildernetherStacks;

public class LootManager {

    public static class LootTable {


        @Getter
        private HashMap<ItemStack, Double> values;
        private String name;

        @ParametersAreNonnullByDefault
        public LootTable(String name, ItemStack[] itemList, double[] valueList) {

            this.values = new HashMap<ItemStack, Double>();
            this.name = name;

            if (itemList.length != valueList.length) {
                Wildernether.getInstance().getLogger().log(Level.WARNING,
                    "items and values arrays are not the same length in LootTable " + this.name);
                return;
            }
            for (int i = 0; i < itemList.length; i++) {
                this.values.put(itemList[i], valueList[i]);
            }

        }

    }
    
    @Getter
    private static HashMap<String, LootTable> netherPlantHarvest = new HashMap<String, LootTable>();

    public static void setup() {

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
                new double[] {
                    10, 10, 10, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
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
                new double[] {
                    10, 10, 10, 10, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
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
                new double[] {
                    10, 10, 10, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
            "TWISTING_VINES",
            new LootTable(
                "TWISTING_VINES_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.WARPED_CACTUS,
                    WildernetherStacks.TWISTED_BEAN_SPROUT,

                    WildernetherStacks.BLOOM_OF_UNHEARD_CRIES,
                }, 
                new double[] {
                    10, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
            "CRIMSON_ROOTS",
            new LootTable(
                "CRIMSON_ROOTS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.BLAZESPROUT,
                    WildernetherStacks.NETHER_TUBERS,
                    WildernetherStacks.RED_SPIDER_LILY,

                    WildernetherStacks.BLOSSOM_OF_SOLITUDE,
                }, 
                new double[] {
                    10, 10, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
            "CRIMSON_FUNGUS",
            new LootTable(
                "CRIMSON_FUNGUS_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.CRYSTAL_MUSHROOM,
                    WildernetherStacks.CRIMSON_DREADLOCKS,
                    WildernetherStacks.RED_SPIDER_LILY,

                    WildernetherStacks.GARDEN_OF_THE_LOST_SOUL,
                }, 
                new double[] {
                    10, 20, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
            "WEEPING_VINES",
            new LootTable(
                "WEEPING_VINES_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.CRIMSON_DREADLOCKS,
                    WildernetherStacks.RED_SPIDER_LILY,

                    WildernetherStacks.LAMENT_OF_THE_DAMNED,
                }, 
                new double[] {
                    10, 20, 100
                }
            )
        );
        netherPlantHarvest.put(
            "SHROOMLIGHT",
            new LootTable(
                "SHROOMLIGHT_HARVEST",
                new ItemStack[] {
                    WildernetherStacks.SHROOMLIGHT_SPORES,

                    WildernetherStacks.BLOOM_OF_UNHEARD_CRIES,
                }, 
                new double[] {
                    10, 100
                }
            )
        );
    }

}
