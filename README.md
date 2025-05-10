# Koreki

Koreki is a simple library containing models and enums designed for seamless integration with the Anikiro API. This
library simplifies interactions with Anikiro gateways, applications, and other services.

---

## Adding Koreki to Your Project

To include Koreki in your project, use [JitPack](https://jitpack.io/). Below are the steps to configure your build
system.

### Using Maven

Add the JitPack repository and Koreki dependency to your `pom.xml`:

```xml

<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
  <dependency>
      <groupId>com.github.anikirohub</groupId>
      <artifactId>koreki</artifactId>
      <version>VERSION</version>
  </dependency>
</dependencies>
```

### Using Gradle

Add the JitPack repository and Koreki dependency to your build.gradle or build.gradle.kts:

```kotlin
repositories {
  maven { url = uri("https://jitpack.io") }
}

dependencies {
  implementation("com.github.anikirohub:koreki:VERSION")
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
  implementation("com.github.anikirohub:koreki:0.0.1")
  ```
- For a dev build:
  ```
  implementation("com.github.anikirohub:koreki:dev-6e29dac")
  ```

---

For any questions or support, please join our [Discord server](https://discord.anikiro.watch).
