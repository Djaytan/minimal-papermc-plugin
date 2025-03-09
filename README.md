# Build and Install on PaperMC server

1. Clone the repository
2. Run the command `./gradlew clean build`
3. Pick the generated PaperMC plugin jar file from `build/libs` directory
4. Install it on a PaperMC server v1.21.4
5. Ensure the plugin has been enabled successfully by looking for a `[MinimalPlugin] Hello, PaperMC!` log in the console

# How to reproduce the issue

1. Strip a log
2. Look for a `[MinimalPlugin] Block stripping action detected!` log in the console in reaction to your action
3. Repeat steps 1. and 2. until you get convinced about the issue's existence

FYI, below is the listener implemented for convenience:

```java
@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
void onBlockPlace(BlockPlaceEvent event) {
    if (event.getBlock().getType().name().contains("STRIPPED")) {
        getLogger().info("Block stripping action detected!");
    }
}
```

cf. [MinimalPlugin.java](src/main/java/com/djaytan/papermc/minimal/plugin/MinimalPlugin.java)
