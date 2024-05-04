package me.skyblockapi.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

public class PortalListener implements Listener {



    @EventHandler
    public void onPortal(PortalCreateEvent e) {
        e.setCancelled(true);
    }
}
