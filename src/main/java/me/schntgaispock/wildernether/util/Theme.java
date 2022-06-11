package me.schntgaispock.wildernether.util;

import lombok.Getter;
import net.md_5.bungee.api.ChatColor;

/*
 * Color themes for Wildernether items
 */
@Getter
public enum Theme {
    CRIMSON(ChatColor.of("#9e355a")),
    WARPED(ChatColor.of("#008c8a")),
    CRIMSON_DARK(ChatColor.of("#701515")),
    WARPED_DARK(ChatColor.of("#0f423e")),
    SOUL(ChatColor.of("#d9f9ef")),
    CUISINE(ChatColor.of("#fcfc16")),
    BLACKSTONE(ChatColor.of("#55585b")),
    BREW(ChatColor.of("#fc55db")),
    NEUTRAL(ChatColor.of("#b7bcbc")),
    GUIDE(ChatColor.AQUA, ChatColor.GRAY),

    LORE(ChatColor.of("#fcfbd6"));

    final ChatColor color, loreColor, noticeColor;

    Theme(ChatColor color, ChatColor loreColor, ChatColor noticeColor) {
        this.color = color;
        this.loreColor = loreColor;
        this.noticeColor = noticeColor;
    }

    Theme(ChatColor color, ChatColor loreColor) {
        this(color, loreColor, ChatColor.GRAY);
    }

    Theme(ChatColor color) {
        this(color, ChatColor.of("#fcfbd6"));
    }
}
