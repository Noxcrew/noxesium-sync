rootProject.name = "noxesium-sync"

pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/")
        gradlePluginPortal()
    }
}

include("common")
include("fabric")
include("paper")