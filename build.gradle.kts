plugins {
  id("java")
}

dependencies {
  compileOnly(libs.papermc.api)
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

tasks {
  processResources {
    filesMatching("paper-plugin.yml") {
      expand(
        "name" to project.property("papermc.plugin.display-name"),
        "description" to project.property("papermc.plugin.description"),
        "version" to project.version.toString(),
        "mainClass" to project.property("papermc.plugin.main-class"),
        "apiVersion" to project.property("papermc.plugin.api-version")
      )
    }
  }
}
