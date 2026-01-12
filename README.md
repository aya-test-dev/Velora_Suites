# Velora Suites – Hotel Management System

A simple Java-based hotel management application demonstrating room and service management.

## Features

- Create and manage different room types (Standard, Deluxe, Suite).
- Add services to rooms (Spa, Dining, Gym).
- Display booking details including service and cost breakdown.

## Prerequisites

- Java JDK 8 or higher
- An IDE such as IntelliJ IDEA or command-line tools

## Project Structure

```
.
├── src/
│   ├── Main.java
│   ├── Hotel.java
│   ├── Rooms/
│   │   ├── Room.java
│   │   ├── StandardRoom.java
│   │   ├── DeluxeRoom.java
│   │   └── SuiteRoom.java
│   └── Services/
│       ├── Service.java
│       ├── SpaService.java
│       ├── DiningService.java
│       └── GymService.java
├── .editorconfig
├── .gitignore
└── README.md
```

## Running the Application

Compile and run from the command line:

```bash
javac -d out src/*.java src/Rooms/*.java src/Services/*.java
java -cp out Main
```

Or import the project into IntelliJ IDEA and run the `Main` class.

## Contributing

Contributions are welcome! Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details.

## Code Style

This project adheres to the coding conventions defined in the [.editorconfig](.editorconfig) and the Checkstyle configuration defined in [checkstyle.xml](checkstyle.xml). To validate formatting and style, run:

```bash
java -jar checkstyle-8.45-all.jar -c checkstyle.xml src/
```
