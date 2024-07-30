package com.rappytv.tutorial.listeners;

import net.labymod.api.Laby;
import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.chat.ChatMessageSendEvent;
import net.labymod.api.util.I18n;

public class ChatMessageListener {

    @Subscribe
    public void onMessageSend(ChatMessageSendEvent event) {
        String[] badWords = new String[]{"adadwa"};

        for (String word : badWords) {
            if(event.getMessage().toLowerCase().contains(word.toLowerCase())) {
                event.setCancelled(true);
                Laby.references().chatExecutor().displayClientMessage(I18n.translate("tutorial.messages.warning"));
            }
        }
    }

}
