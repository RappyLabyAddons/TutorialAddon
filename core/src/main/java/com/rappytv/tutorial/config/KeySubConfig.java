package com.rappytv.tutorial.config;

import net.labymod.api.client.gui.screen.key.Key;
import net.labymod.api.client.gui.screen.widget.widgets.input.ButtonWidget.ButtonSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.KeybindWidget.KeyBindSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.MultiKeybindWidget.MultiKeyBindSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import net.labymod.api.configuration.settings.Setting;
import net.labymod.api.util.MethodOrder;

public class KeySubConfig extends Config {

    private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);
    @KeyBindSetting
    @SpriteSlot(size = 32, x = 3)
    private final ConfigProperty<Key> key = new ConfigProperty<>(Key.A);
    @MultiKeyBindSetting
    private final ConfigProperty<Key[]> keys = new ConfigProperty<>(new Key[]{Key.L_CONTROL, Key.F});

    @MethodOrder(after = "enabled")
    @ButtonSetting
    public void button(Setting setting) {
        System.out.println("\n\nButton pressed!\n\n");
    }

    public ConfigProperty<Boolean> enabled() {
        return enabled;
    }
    public ConfigProperty<Key> key() {
        return key;
    }
    public ConfigProperty<Key[]> keys() {
        return keys;
    }

}
