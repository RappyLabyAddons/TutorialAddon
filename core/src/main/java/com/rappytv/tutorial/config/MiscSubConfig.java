package com.rappytv.tutorial.config;

import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.annotation.SpriteSlot;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class MiscSubConfig extends Config {

    @SliderSetting(min = 1, max = 10, steps = 0.5f)
    @SpriteSlot(size = 32, x = 2, y = 3)
    private final ConfigProperty<Float> slider = new ConfigProperty<>(3.5f);
    @TextFieldSetting
    private final ConfigProperty<String> text = new ConfigProperty<>("Test");

    public ConfigProperty<Float> slider() {
        return slider;
    }
    public ConfigProperty<String> text() {
        return text;
    }

}
