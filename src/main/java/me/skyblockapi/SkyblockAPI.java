package me.skyblockapi;

import me.skyblockapi.listeners.MenuListener;
import me.skyblockapi.listeners.PortalListener;
import me.skyblockapi.menu.PlayerMenuUtility;
import me.skyblockapi.message.MessageManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.function.Consumer;

public final class SkyblockAPI extends JavaPlugin {


    public MessageManager messageManager;

    private static final HashMap<Player, PlayerMenuUtility> playerMenuUtilityMap = new HashMap<>();


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
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    public static PlayerMenuUtility getPlayerMenuUtilityMap(Player player) {
        PlayerMenuUtility playerMenuUtility;
        if (!(playerMenuUtilityMap.containsKey(player))) {
            playerMenuUtility = new PlayerMenuUtility(player);
            playerMenuUtilityMap.put(player, playerMenuUtility);

            return playerMenuUtility;
        } else {
            return playerMenuUtilityMap.get(player);
        }
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}
