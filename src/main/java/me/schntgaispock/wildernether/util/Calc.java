package me.schntgaispock.wildernether.util;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import me.schntgaispock.wildernether.Wildernether;

/**
 * Utility class for various calculation functions
 * 
 * @author SchnTgaiSpock
 */
public class Calc {

    @ParametersAreNonnullByDefault
    public static int clamp(int min, int val, int max) {
        return Math.min(max, Math.max(val, min));
    }

    public static boolean flip(@Nonnull double chance) {
        return Wildernether.getInstance().getRandom().nextDouble() < chance;
    }
}
