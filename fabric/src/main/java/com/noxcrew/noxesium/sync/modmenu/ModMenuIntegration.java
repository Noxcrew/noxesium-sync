package com.noxcrew.noxesium.sync.modmenu;

import com.noxcrew.noxesium.sync.menu.NoxesiumSyncSettingsScreen;
import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

/**
 * Adds a custom settings menu when clicking on Noxesium Sync in Mod Menu.
 */
public class ModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return NoxesiumSyncSettingsScreen::new;
    }
}
