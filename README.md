# SmartHomeControl
![Build Status](https://img.shields.io/badge/Build-Passing-brightgreen)
![Java Version](https://img.shields.io/badge/Java-11%2B-blue)
![JUnit Version](https://img.shields.io/badge/JUnit-5-orange)
![License](https://img.shields.io/badge/License-MIT-yellow)

## Overview

This Java project implements a SmartHome Automation System using design patterns BUILDER and COMMAND. The system allows users to program a SmartHome with a remote control capable of controlling various devices such as TV and Camera. The remote control includes programmable slots, each assignable to a different household device. Each slot has a corresponding on/off button. The remote control also features a global undo button to cancel the last pressed button.

## Features

- **Builder Pattern:** Utilized for constructing the SmartHome object with a fluent interface.
- **Command Pattern:** Implemented for managing the remote control functionality, enabling the execution and undoing of commands.
- **Device Support:** The system supports devices such as TV and Camera, with on/off functionality.
- **Programmable Remote Control:** The remote control allows programming of slots for different devices.
- **Undo Functionality:** The system includes a global undo button to cancel the last button press.

## Project Structure

- `src/`: Contains the source code files.
  - `SmartHome.java`: Implementation of the SmartHome class, including a static `ConcretSmartHomeBuilder` function.
  - `RemoteControl.java`: Implementation of the Remote Control class.
  - `TV.java`: Implementation of the TV device class.
  - `Camera.java`: Implementation of the Camera device class.
  - `Adresse.java`: Implementation of the Adresse class.
  - `test/`: Contains JUnit test files.
  - `SmartHomeTest.java`: JUnit test for the SmartHome and Remote Control functionality.

## How to Run Tests

1. Clone the repository: `git clone https://github.com/your-username/SmartHomeAutomation.git`
2. Navigate to the project directory: `cd SmartHomeAutomation`
3. Run the tests: `./gradlew test`

## Usage

To use the SmartHome Automation System:

1. Import the necessary classes into your project.
2. Use the static `ConcretSmartHomeBuilder` function within the `SmartHome` class to create a SmartHome instance, set up devices, and test the control functionality.

```java
SmartHome smartHome = new SmartHome.ConcretSmartHomeBuilder("ny Homa", 12345)
                .withAdresse(adresse)
                .withRemoteControl(remoteControl)
                .build();
```

3. Run the provided JUnit tests to ensure the correct functioning of the system.

## Design Patterns Used

- **Builder Pattern:** Facilitates the construction of the SmartHome object with a fluent interface.
- **Command Pattern:** Manages the remote control functionality, allowing for the execution and undoing of commands.

## Contributing

Contributions are welcome! If you'd like to contribute to the project, please follow our [contribution guidelines](CONTRIBUTING.md).

## License

This project is licensed under the [MIT License](LICENSE.md).

## Contact

For questions or feedback, please contact Saidi Imane at imanesaidi.ensa.agadir@gmail.com.
