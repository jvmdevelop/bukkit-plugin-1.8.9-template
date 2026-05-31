plugins {
    java
    id("com.gradleup.shadow") version "9.0.0-beta12"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compileOnly("org.bukkit:bukkit:1.8.8-R0.1-SNAPSHOT")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    
    build {
        dependsOn(shadowJar)
    }
}
