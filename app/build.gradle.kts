/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("io.github.t45k.gradle.submodule.trial.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

application {
    // Define the main class for the application.
    mainClass.set("io.github.t45k.gradle.submodule.trial.app.AppKt")
}