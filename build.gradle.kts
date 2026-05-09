import net.fabricmc.loom.gradle.LoomGradleExtensionAPI

plugins {
    id("java")
    id("architectury-plugin") version "3.4-SNAPSHOT"
    id("dev.architectury.loom") version "1.6.361" apply false
}

architectury {
    minecraft = "1.21.1"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "dev.architectury.loom")
    apply(plugin = "architectury-plugin")

    val loom = project.extensions.getByName<LoomGradleExtensionAPI>("loom")

    dependencies {
        "minecraft"("com.mojang:minecraft:1.21.1")
        "mappings"(loom.officialMojangMappings())
    }

    tasks.withType<JavaCompile> {
        options.release.set(21)
    }
}

allprojects {
    group = "com.niksalde.survivhelper"
    version = "1.0.0"

    repositories {
        mavenCentral()
        maven("https://maven.architectury.dev/")
        maven("https://maven.fabricmc.net/")
        maven("https://maven.minecraftforge.net/")
        maven("https://maven.neoforged.net/releases")
    }
}