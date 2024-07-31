package com.rappytv.tutorial;

import com.rappytv.tutorial.commands.TutorialCommand;
import com.rappytv.tutorial.config.TutorialConfig;
import com.rappytv.tutorial.hud.BooleanHudWidget;
import com.rappytv.tutorial.hud.TickHudWidget;
import com.rappytv.tutorial.listeners.ChatMessageListener;
import com.rappytv.tutorial.listeners.ServerNavigationListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.client.gui.hud.binding.category.HudWidgetCategory;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class TutorialAddon extends LabyAddon<TutorialConfig> {

    @Override
    protected void enable() {
        registerSettingCategory();
        registerCommand(new TutorialCommand());
        registerListener(new ChatMessageListener());
        registerListener(new ServerNavigationListener());

        HudWidgetCategory category = new HudWidgetCategory("tutorial");
        labyAPI().hudWidgetRegistry().categoryRegistry().register(category);
        labyAPI().hudWidgetRegistry().register(new BooleanHudWidget(category));
        labyAPI().hudWidgetRegistry().register(new TickHudWidget(category));
    }

    @Override
    protected Class<? extends TutorialConfig> configurationClass() {
        return TutorialConfig.class;
    }
}
