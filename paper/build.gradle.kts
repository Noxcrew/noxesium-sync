import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.gradle.kotlin.dsl.assign
import org.gradle.kotlin.dsl.withType

plugins {
    kotlin("jvm")
    id("noxesium.sync")
    id("noxesium.publishing")
    id("xyz.jpenilla.run-paper")
    id("io.papermc.paperweight.userdev")
    id("com.gradleup.shadow")
}

val shaded by configurations.creating

dependencies {
    paperweight.paperDevBundle("${property("paper_version")}")
    implementation(libs.noxesium.paper)

    // Add universal charset for detecting encodings
    api(libs.juniversalchardet)
    shaded(libs.juniversalchardet)

    // Add JGit for .syncignore file logic
    api(libs.jgit)
    shaded(libs.jgit)
}

tasks {
    withType<ShadowJar> {
        configurations = listOf(shaded)
    }
}