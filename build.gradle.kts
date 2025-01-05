plugins {
    id("java")
    id("maven-publish")
}

group = "watch.anikiro"
version = (System.getenv("VERSION") ?: "dev")

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    // lombok
    "compileOnly"(rootProject.libs.lombok)
    "annotationProcessor"(rootProject.libs.lombok)
}

tasks {
    register("generateJavadocs", Javadoc::class) {
        source = sourceSets["main"].allJava
        classpath = configurations["compileClasspath"]
        setDestinationDir(file(layout.buildDirectory.dir("generated/javadoc")))

        options {
            title = "Koreki"
            windowTitle = "Koreki"
        }
    }

    register("javadocJar", Jar::class) {
        archiveClassifier.set("javadoc")
        from(getTasksByName("generateJavadocs", false))
    }

    register("sourcesJar", Jar::class) {
        archiveClassifier.set("sources")
        from(sourceSets["main"].allSource)
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifact(tasks["javadocJar"])
            artifact(tasks["sourcesJar"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/anikirohub/koreki")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: ""
                password = System.getenv("GITHUB_TOKEN") ?: ""
            }
        }
    }
}