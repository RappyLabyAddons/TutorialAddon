package com.rappytv.tutorial.commands.subcommand;

import net.labymod.api.Laby;
import net.labymod.api.client.chat.command.SubCommand;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.component.format.NamedTextColor;

public class TutorialSubcommand extends SubCommand {

    public TutorialSubcommand() {
        super("test", "ja");
    }

    @Override
    public boolean execute(String s, String[] strings) {
        displayMessage(Component.text(Laby.labyAPI().getUniqueId().toString(), NamedTextColor.AQUA));
        return true;
    }
}
