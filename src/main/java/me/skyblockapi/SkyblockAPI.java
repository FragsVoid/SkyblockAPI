package me.skyblockapi;

import me.skyblockapi.message.MessageManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyblockAPI extends JavaPlugin {


    public MessageManager messageManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}
