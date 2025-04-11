
FROM openjdk:17-jdk-slim


WORKDIR /JAVA_ADVANCED_PROJECT


COPY target/platform-0.0.1-SNAPSHOT.jar platform-0.0.1-SNAPSHOT.jar


EXPOSE 8080


CMD ["java", "-jar", "platform-0.0.1-SNAPSHOT.jar"]
