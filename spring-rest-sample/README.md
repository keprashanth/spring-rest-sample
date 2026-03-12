
# spring-rest-sample

A minimal Spring Boot RESTful service with Maven Wrapper.

## Requirements
- Java 17+
- No need to pre-install Maven; the Maven Wrapper will download the right Maven version automatically on first run.

## Run locally
```bash
./mvnw spring-boot:run
```
Or on Windows:
```bat
mvnw.cmd spring-boot:run
```

## Build a fat JAR
```bash
./mvnw clean package
java -jar target/spring-rest-sample-0.0.1-SNAPSHOT.jar
```

## Test endpoints
```bash
curl "http://localhost:8080/api/greetings?name=Prashanth"
```

## Project layout
```
src/main/java/com/example/demo
```
