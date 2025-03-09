package com.djaytan.spigot.minimal.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinimalPlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    getLogger().info("Hello, PaperMC!");
  }
}
