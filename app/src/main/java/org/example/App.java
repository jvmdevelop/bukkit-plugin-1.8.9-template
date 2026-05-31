package org.example;

import org.bukkit.plugin.java.JavaPlugin;
import org.example.PSDListener;
import org.bukkit.Bukkit;

public class App extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");
        Bukkit.getPluginManager().registerEvents(new PSDListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled.");
    }
}
