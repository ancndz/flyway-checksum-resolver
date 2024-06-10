# Flyway Checksum Resolver

This is a simple Java application that calculates the checksum of a file using Flyway's checksum calculation method.

## Requirements

- Java 8 or higher
- Maven

## Building

To build the project, navigate to the project directory and run:

```bash
mvn clean install
```

## Usage
After building the project, you can run the application with
```bash
java -jar target/flyway-checksum-resolver-1.0.jar <file>
```
Where `<file>` is the path to the file you want to calculate the checksum for.