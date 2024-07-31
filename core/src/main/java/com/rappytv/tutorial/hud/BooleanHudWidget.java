package com.rappytv.tutorial.hud;

import com.rappytv.tutorial.hud.BooleanHudWidget.TutorialHudWidgetConfig;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.gui.hud.binding.category.HudWidgetCategory;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;
import net.labymod.api.client.gui.icon.Icon;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.resources.ResourceLocation;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class BooleanHudWidget extends TextHudWidget<TutorialHudWidgetConfig> {

    public BooleanHudWidget(HudWidgetCategory category) {
        super("tutorial_bool", TutorialHudWidgetConfig.class);

        this.setIcon(Icon.texture(ResourceLocation.create("tutorial", "textures/icon.png")));
        this.bindCategory(category);
    }

    @Override
    public void load(TutorialHudWidgetConfig config) {
        super.load(config);

        super.createLine(
            Component.translatable("tutorial.hudWidget.tutorial_bool.name"),
            Component.text(config.bool.get() ? "Ja" : "Nein")
        );
    }

    public static class TutorialHudWidgetConfig extends TextHudWidgetConfig {

        @SwitchSetting
        private final ConfigProperty<Boolean> bool = new ConfigProperty<>(true);
    }
}
