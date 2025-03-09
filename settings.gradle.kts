rootProject.name = "minimal-spigot-plugin"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        // Maven central
        mavenCentral {
            mavenContent {
                releasesOnly()
            }
        }

        // Brigadier dependency
        exclusiveContent {
            forRepository {
                maven {
                    url = uri("https://libraries.minecraft.net")
                }
            }
            filter {
                includeModule("com.mojang", "brigadier")
            }
        }

        // PaperMC dependencies
        exclusiveContent {
            forRepository {
                maven {
                    url = uri("https://repo.papermc.io/repository/maven-public/")
                }
            }
            filter {
                includeModule("io.papermc.paper", "paper-api")
                includeModule("net.md-5", "bungeecord-chat")
            }
        }
    }
}
