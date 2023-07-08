package com.rappytv.tutorial.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.annotation.SpriteTexture;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.annotation.SettingSection;

@ConfigName("settings")
@SpriteTexture("settings")
public class TutorialConfig extends AddonConfig {

    @SwitchSetting
    @SpriteSlot(size = 32)
    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);
    @SettingSection("custom")
    @SpriteSlot(size = 32, x = 1)
    private final KeySubConfig keys = new KeySubConfig();
    @SpriteSlot(size = 32, x = 2)
    private final MiscSubConfig misc = new MiscSubConfig();

    @Override
    public ConfigProperty<Boolean> enabled() {
        return enabled;
    }
    public KeySubConfig keys() {
        return keys;
    }
    public MiscSubConfig misc() {
        return misc;
    }
}
