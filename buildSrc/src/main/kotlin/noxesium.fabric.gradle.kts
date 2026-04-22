plugins {
    `java-library`
}

tasks {
    named<ProcessResources>("processResources") {
        inputs.property("version", project.version)
        filesMatching(setOf("fabric.mod.json")) {
            expand("version" to project.version)
        }
    }
}