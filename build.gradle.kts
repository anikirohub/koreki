plugins {
    id("java")
    id("maven-publish")
}

group = "watch.anikiro"
version = (System.getenv("VERSION") ?: "dev")

java {
    sourceCompatibility = JavaVersion.VERSION_23
    targetCompatibility = JavaVersion.VERSION_23
}

repositories {
    mavenCentral()
}

dependencies {
    // lombok
    "compileOnly"(rootProject.libs.lombok)
    "annotationProcessor"(rootProject.libs.lombok)
}

tasks.withType<Javadoc> {
    (options as StandardJavadocDocletOptions).apply {
        addStringOption("Xdoclint:none", "-quiet")
        title = "Koreki Library"
        windowTitle = "Koreki Library"
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = group.toString()
            artifactId = rootProject.name
            version = rootProject.version.toString()

            from(components["java"])
        }
    }
}