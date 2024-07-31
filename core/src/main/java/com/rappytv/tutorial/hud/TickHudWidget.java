package com.rappytv.tutorial.hud;

import com.rappytv.tutorial.hud.TickHudWidget.TutorialHudWidgetConfig;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.gui.hud.binding.category.HudWidgetCategory;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidget;
import net.labymod.api.client.gui.hud.hudwidget.text.TextHudWidgetConfig;
import net.labymod.api.client.gui.hud.hudwidget.text.TextLine;
import net.labymod.api.client.gui.icon.Icon;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.resources.ResourceLocation;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class TickHudWidget extends TextHudWidget<TutorialHudWidgetConfig> {

    private int ticks = 0;
    private TextLine line;

    public TickHudWidget(HudWidgetCategory category) {
        super("tutorial_tick", TutorialHudWidgetConfig.class);

        this.setIcon(Icon.texture(ResourceLocation.create("tutorial", "textures/icon.png")));
        this.bindCategory(category);
    }

    @Override
    public void load(TutorialHudWidgetConfig config) {
        super.load(config);

        line = super.createLine(
            Component.translatable("tutorial.hudWidget.tutorial_tick.name"),
            Component.text(ticks)
        );
    }

    @Override
    public void onTick(boolean isEditorContext) {
        super.onTick(isEditorContext);

        if(config.bool.get()) ticks++;
        line.updateAndFlush(ticks);
    }

    public static class TutorialHudWidgetConfig extends TextHudWidgetConfig {

        @SwitchSetting
        private final ConfigProperty<Boolean> bool = new ConfigProperty<>(true);
    }
}
