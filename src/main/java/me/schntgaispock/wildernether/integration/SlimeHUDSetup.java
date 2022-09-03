package me.schntgaispock.wildernether.integration;

import io.github.schntgaispock.slimehud.SlimeHUD;
import io.github.schntgaispock.slimehud.waila.HudRequest;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove;

public class SlimeHUDSetup {
    
    public static void setup() {

        SlimeHUD.getHudController().registerCustomHandler(BlackstoneStove.class, (HudRequest request) -> {
            return "&7| Mode: " + BlackstoneStove.getMode(request.getLocation());
        });

    }

}
