package com.rappytv.tutorial;

import com.rappytv.tutorial.config.TutorialConfig;
import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;

@AddonMain
public class TutorialAddon extends LabyAddon<TutorialConfig> {

    @Override
    protected void enable() {
        registerSettingCategory();
    }

    @Override
    protected Class<? extends TutorialConfig> configurationClass() {
        return TutorialConfig.class;
    }
}
