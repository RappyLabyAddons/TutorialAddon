package com.rappytv.tutorial;

import com.rappytv.tutorial.commands.TutorialCommand;
import com.rappytv.tutorial.config.TutorialConfig;
import com.rappytv.tutorial.listeners.ChatMessageListener;
import com.rappytv.tutorial.listeners.ServerNavigationListener;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class TutorialAddon extends LabyAddon<TutorialConfig> {

    @Override
    protected void enable() {
        registerSettingCategory();
        registerCommand(new TutorialCommand());
        registerListener(new ChatMessageListener());
        registerListener(new ServerNavigationListener());
    }

    @Override
    protected Class<? extends TutorialConfig> configurationClass() {
        return TutorialConfig.class;
    }
}
