plugins {
    kotlin("jvm")
    id("noxesium.sync")
    id("noxesium.publishing")
    id("xyz.jpenilla.run-paper")
    id("io.papermc.paperweight.userdev")
}

dependencies {
    paperweight.paperDevBundle("${property("paper_version")}")
    implementation(libs.noxesium.paper)

    // Add universal charset for detecting encodings
    api(libs.juniversalchardet)
}