package me.skyblockapi;

import me.skyblockapi.Utils.RegisterAPI;
import me.skyblockapi.message.MessageManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SkyblockAPI extends JavaPlugin {
    private RegisterAPI registerAPI;
    public MessageManager messageManager;

    @Override
    public void onEnable() {
        this.registerAPI = new RegisterAPI();
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
