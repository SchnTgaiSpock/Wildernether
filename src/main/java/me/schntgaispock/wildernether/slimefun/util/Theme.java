package me.schntgaispock.wildernether.slimefun.util;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;

@Getter
public enum Theme {
    CRIMSON(ChatColor.of("#9e355a")),
    WARPED(ChatColor.of("#008c8a")),
    CRIMSON_DARK(ChatColor.of("#701515")),
    WARPED_DARK(ChatColor.of("#0f423e")),
    SOUL(ChatColor.of("#d9f9ef")),
    CUISINE(ChatColor.of("#fcfc16")),
    BLACKSTONE(ChatColor.of("#55585b")),

    LORE(ChatColor.of("#f0f0f0"));

    private final ChatColor color;

    Theme(ChatColor color) {
        this.color = color;
    }
}
