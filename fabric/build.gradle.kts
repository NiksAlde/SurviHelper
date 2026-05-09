plugins {
    id("dev.architectury.loom")
}

architectury {
    platformSetupLoomIde()
    fabric()
}

dependencies {
    modImplementation("net.fabricmc:fabric-loader:${property("fabricloader_version")}")
    modApi("net.fabricmc.fabric-api:fabric-api:${property("fabricapi_version")}")
    implementation(project(":common")) {
        isTransitive = false
    }
    bundleIntoJar(project(":common", "namedElements")) {
        isTransitive = false
    }
}

tasks.remapJar {
    injectAccessWidener.set(true)
}

tasks.jar {
    archiveFileName.set("${archives_base_name}-fabric-${minecraft_version}-${mod_version}.jar")
}