package me.schntgaispock.wildernether.slimefun;

import io.github.mooy1.infinitylib.groups.MultiGroup;
import io.github.mooy1.infinitylib.groups.SubGroup;

public class WildernetherGroups {

    public static final SubGroup MATERIALS = new SubGroup("materials", WildernetherStacks.GUIDE_MATERIALS);
    public static final SubGroup TOOLS = new SubGroup("tools", WildernetherStacks.GUIDE_TOOLS);
    public static final SubGroup PLANTS = new SubGroup("plants", WildernetherStacks.GUIDE_PLANTS);
    public static final SubGroup CUISINE = new SubGroup("cuisine", WildernetherStacks.GUIDE_CUISINE);
    public static final SubGroup MACHINES = new SubGroup("machines", WildernetherStacks.GUIDE_MACHINES);
    public static final MultiGroup WILDERNETHER = new MultiGroup("wildernether", WildernetherStacks.GUIDE_WILDERNETHER,
        MATERIALS, TOOLS, PLANTS, CUISINE, MACHINES);

}
