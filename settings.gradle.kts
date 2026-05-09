pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenLocal()
        maven("https://maven.architectury.dev/")
        maven("https://maven.fabricmc.net/")
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.neoforged.net/releases")
    }
}

rootProject.name = "survivhelper"

include("common")
include("fabric")
include("forge")