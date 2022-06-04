package me.schntgaispock.wildernether;

import javax.annotation.Nonnull;

import org.bukkit.NamespacedKey;

import io.github.mooy1.infinitylib.core.AbstractAddon;
import me.schntgaispock.wildernether.slimefun.managers.ItemManager;

public class Wildernether extends AbstractAddon {

    private static Wildernether instance;

    public Wildernether() {
        super("SchnTgaiSpock", "Wildernether", "master", "auto-update");
    }

    public static Wildernether getInstance() {
        return instance;
    }

    @Override
    public void enable() {
        instance = this;

        getLogger().info("#=======================================#");
        getLogger().info("#    Wildernether - By SchnTgaiSpock    #");
        getLogger().info("#=======================================#");

        ItemManager.setup();
    }

    @Override
    protected void disable() {
        instance = null;
    }

    public static NamespacedKey newNamespacedKey(@Nonnull String name) {
        return new NamespacedKey(Wildernether.getInstance(), name);
    }
}
