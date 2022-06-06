package me.schntgaispock.wildernether.slimefun.util;

import java.util.Random;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import me.schntgaispock.wildernether.Wildernether;

public class Calc {

    @ParametersAreNonnullByDefault
    public static int clamp(int min, int val, int max) {
        return Math.min(max, Math.max(val, min));
    }

    @ParametersAreNonnullByDefault
    public static int nextNormalValue(Random random, double stddev, int mean) {
        return nextNormalValue(random, stddev, mean, 0, 100);
    }

    @ParametersAreNonnullByDefault
    public static int nextNormalValue(Random random, double stddev, int mean, int min, int max) {
        return clamp(min, (int) Math.round(random.nextGaussian()*stddev + mean), max);
    }

    public static boolean flip(@Nonnull double chance) {
        return Wildernether.getInstance().getRandom().nextDouble() < chance;
    }
}
