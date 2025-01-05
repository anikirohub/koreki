# Koreki

Koreki is a simple library containing models and enums designed for seamless integration with the Anikiro API. This
library simplifies interactions with Anikiro gateways, applications, and other services.

---

## Adding Koreki to Your Project

To include Koreki in your project, you can use either Maven or Gradle. Below are the steps to configure your build
system.

Ensure you set the required credentials in your environment for both Maven and Gradle:

- `GITHUB_ACTOR`: Your GitHub username.
- `GITHUB_TOKEN`: A personal access token with `read:packages` scope.

### Using Maven

Add the following to your `pom.xml`:

```xml

<repositories>
    <repository>
        <id>github-koreki</id>
        <url>https://maven.pkg.github.com/anikirohub/koreki</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>

<dependencies>
<dependency>
    <groupId>com.anikiro</groupId>
    <artifactId>koreki</artifactId>
    <version>VERSION</version>
</dependency>
</dependencies>
```

### Using Gradle

Add the following to your `build.gradle` or `build.gradle.kts`:

```kotlin
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/anikirohub/koreki")
        credentials {
            username = System.getenv("GITHUB_ACTOR")
            password = System.getenv("GITHUB_TOKEN")
        }
    }
}

dependencies {
    implementation("com.anikiro:koreki:VERSION")
}
```

---

## Releases and Builds

Koreki provides two types of builds:

- **Releases**: Stable versions with semantic versioning (e.g., `0.0.1`, `1.1.0`).
- **Dev Builds**: Development snapshots for testing, denoted by `dev-######` (e.g., `dev-6e29dac`).

When specifying a version, use the desired release or dev build tag:

- For a release:
  ```
  implementation("com.anikiro:koreki:0.0.1")
  ```
- For a dev build:
  ```
  implementation("com.anikiro:koreki:dev-6e29dac")
  ```

---

For questions or issues, feel free to create an issue on
the [Koreki GitHub repository](https://github.com/anikirohub/koreki).
