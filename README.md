# The Expanse NeoForge Mod

This project packages The Expanse overworld world-generation data as a NeoForge mod for Minecraft 1.21.1 through 1.21.5. All density functions that previously required the separate Tectonic data pack are bundled directly into the mod resources.

## Building

```bash
./gradlew build
```

> [!NOTE]
> The repository does not include the Gradle wrapper binary to keep the VCS free of generated artifacts. Run `gradle wrapper` with a locally installed Gradle before invoking `./gradlew`.

The resulting distributable jar will be located in `build/libs/`.
