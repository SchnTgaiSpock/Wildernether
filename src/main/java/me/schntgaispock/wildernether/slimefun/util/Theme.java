package me.schntgaispock.wildernether.slimefun.util;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;

@Getter
public enum Theme {
    CRIMSON(ChatColor.of("#9e355a")),
    WARPED(ChatColor.of("#008c8a")),
    LORE(ChatColor.of("#f0f0f0")),
    SOUL(ChatColor.of("#d9f9ef")),
    CRIMSON_DARK(ChatColor.of("#701515")),
    WARPED_DARK(ChatColor.of("#0f423e")),
    CUISINE(ChatColor.of("#fcfc16"));

    private final ChatColor color;

    Theme(ChatColor color) {
        this.color = color;
    }
}
