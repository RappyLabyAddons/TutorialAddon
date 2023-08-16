package com.rappytv.tutorial.listeners;

import net.labymod.api.event.Subscribe;
import net.labymod.api.event.client.network.server.ServerDisconnectEvent;
import net.labymod.api.event.client.network.server.ServerJoinEvent;
import net.labymod.api.event.client.network.server.ServerSwitchEvent;
import net.labymod.api.event.client.network.server.SubServerSwitchEvent;

public class ServerNavigationListener {

    @Subscribe
    public void onServerConnect(ServerJoinEvent event) {
        System.out.println("\n\nJoined " + event.serverData().getName() + "\n\n");
    }

    @Subscribe
    public void onSubServerSwitch(SubServerSwitchEvent event) {
        System.out.println("\n\nSwitched to a subserver on " + event.serverData().getName() + "\n\n");
    }

    @Subscribe
    public void onServerSwitch(ServerSwitchEvent event) {
        System.out.println("\n\nSwitched from " + event.previousServerData().getName() + " to " + event.newServerData().getName() + "\n\n");
    }

    @Subscribe
    public void onServerDisconnect(ServerDisconnectEvent event) {
        System.out.println("\n\nDisconnected from " + event.serverData().getName() + "\n\n");
    }

}
