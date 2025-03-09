package com.djaytan.papermc.minimal.plugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinimalPlugin extends JavaPlugin implements Listener {

  @Override
  public void onEnable() {
    getLogger().info("Hello, PaperMC!");
    getServer().getPluginManager().registerEvents(this, this);
  }

  @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
  void onBlockPlace(BlockPlaceEvent event) {
    if (event.getBlock().getType().name().contains("STRIPPED")) {
      getLogger().info("Block stripping action detected!");
    }
  }
}
