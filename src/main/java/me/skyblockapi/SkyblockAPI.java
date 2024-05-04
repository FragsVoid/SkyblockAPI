package me.skyblockapi;

import me.skyblockapi.Utils.RegisterAPI;
import me.skyblockapi.message.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.function.Consumer;

import static me.skyblockapi.message.MessageManager.hexTranslator;

public final class SkyblockAPI extends JavaPlugin {


    private RegisterAPI registerAPI;
    public MessageManager messageManager;

    @Override
    public void onEnable() {
        this.registerAPI = new RegisterAPI();
        // Plugin startup logic
        registerEvent(event -> {});
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerEvent(Consumer <? extends Event> EventHandler) {
        registerAPI.registerEvent(PortalCreateEvent.class, EventHandler);
        registerAPI.registerEvent(PlayerJoinEvent.class, EventHandler);
        registerAPI.registerEvent(PlayerMoveEvent.class, EventHandler);
        registerAPI.registerEvent(PlayerQuitEvent.class, EventHandler);
        registerAPI.registerEvent(BlockPlaceEvent.class, EventHandler);
        registerAPI.registerEvent(BlockBreakEvent.class, EventHandler);
        Bukkit.getLogger().info(hexTranslator("#b01919Events have been registered."));
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}
