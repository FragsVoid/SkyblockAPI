package me.skyblockapi;

import me.skyblockapi.listeners.PortalListener;
import me.skyblockapi.message.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Event;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

public final class SkyblockAPI extends JavaPlugin {


    public MessageManager messageManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerEvent();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerEvent() {
        getServer().getPluginManager().registerEvents(new PortalListener(), this);
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}
