# SurviHelper

A Minecraft Java mod designed to help you survive and thrive in the world! SurviHelper provides essential utilities and quality-of-life features to enhance your survival experience.

## Features

- **Food & Hunger Management** - Better tracking and management of hunger/saturation
- **Resource Indicators** - Real-time display of important resources
- **Waypoint System** - Mark and navigate to important locations
- **Survival Tools** - Helpful utilities for mining, farming, and building
- **HUD Overlays** - Customizable on-screen information displays

## Supported Versions

- Minecraft Java Edition 1.21 - 1.21.11
- Fabric & Forge mod loaders

## Installation

### Fabric
1. Install [Fabric Loader](https://fabricmc.net/)
2. Download the SurviHelper-fabric JAR from releases
3. Place in your `mods` folder
4. Requires [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)

### Forge
1. Install [Forge](https://files.minecraftforge.net/)
2. Download the SurviHelper-forge JAR from releases
3. Place in your `mods` folder

## Building from Source

### Prerequisites
- Java 21 JDK
- Gradle

### Build Commands

**Fabric:**
```bash
./gradlew fabric:build
```

**Forge:**
```bash
./gradlew forge:build
```

**Both:**
```bash
./gradlew build
```

## Project Structure

```
SurviHelper/
├── common/          # Shared code for both loaders
├── fabric/          # Fabric-specific implementation
├── forge/           # Forge-specific implementation
├── build.gradle.kts # Main build configuration
└── README.md
```

## License

MIT License

## Contributing

Feel free to submit issues and pull requests!