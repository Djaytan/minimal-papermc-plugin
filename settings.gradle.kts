rootProject.name = "minimal-spigot-plugin"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        // Maven central
        mavenCentral {
            mavenContent {
                releasesOnly()
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
