plugins {
    id("dev.architectury.loom")
}

architectury {
    platformSetupLoomIde()
    forge()
}

configurations {
    val shade by getting
    shade(project(":common")) {
        isTransitive = false
    }
}

dependencies {
    modImplementation("net.minecraftforge:forge:${property("minecraft_version")}-${property("forge_version")}")
    modImplementation(project(":common")) {
        isTransitive = false
    }
}

tasks.jar {
    archiveFileName.set("${archives_base_name}-forge-${minecraft_version}-${mod_version}.jar")
}

tasks.shadowJar {
    exclude("architectury.common.json")
    configurations = listOf(project.configurations["shade"])
    archiveFileName.set("${archives_base_name}-forge-${minecraft_version}-${mod_version}-shadow.jar")
}