plugins {
    id("net.fabricmc.fabric-loom")
}

dependencies {
    minecraft(libs.minecraft)
    api(libs.juniversalchardet)
    api(libs.jgit)
    api(libs.noxesium.api)
    api(libs.noxesium.nms)
}

configurations {
    register("commonJava") {
        isCanBeResolved = false
        isCanBeConsumed = true
    }
}

artifacts {
    add("commonJava", sourceSets["main"].java.sourceDirectories.singleFile)
}