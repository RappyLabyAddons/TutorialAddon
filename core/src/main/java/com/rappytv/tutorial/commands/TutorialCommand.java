package com.rappytv.tutorial.commands;

import com.rappytv.tutorial.commands.subcommand.TutorialSubcommand;
import net.labymod.api.client.chat.command.Command;
import net.labymod.api.client.component.Component;
import net.labymod.api.client.component.format.NamedTextColor;
import net.labymod.api.notification.Notification;

public class TutorialCommand extends Command {

    public TutorialCommand() {
        super("tutorial", "tut", "t");

        withSubCommand(new TutorialSubcommand());
    }

    @Override
    public boolean execute(String s, String[] strings) {
        String argument = strings.length > 0 ? strings[0] : "<empty>";

        Notification.builder()
            .title(Component.text("Test", NamedTextColor.BLUE))
            .text(Component.text(argument, NamedTextColor.GOLD))
            .buildAndPush();

        return true;
    }
}
