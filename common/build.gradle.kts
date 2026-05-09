plugins {
    id("dev.architectury.loom")
}

configurations {
    create("commonJava") {
        isCanBeResolved = true
        isCanBeConsumed = false
    }
}

architectury {
    common("fabric", "forge")
}

dependencies {
    modImplementation("net.fabricmc:fabric-loader:${property("fabricloader_version")}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${property("fabricapi_version")}")
}

tasks.register("remapMavenJar") {
    dependsOn(tasks.remapJar)
}