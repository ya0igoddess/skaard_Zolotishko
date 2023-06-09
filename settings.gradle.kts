rootProject.name = "zolotishko-skaard"

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings

    plugins {
        kotlin("jvm") version kotlinVersion apply false
        kotlin("plugin.spring") version kotlinVersion apply false
        id("org.springframework.boot") version springBootVersion apply false
        id("io.spring.dependency-management") version "1.1.0" apply false
    }
}

include("app")