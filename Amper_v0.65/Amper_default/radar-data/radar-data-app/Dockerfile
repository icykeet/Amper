FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/radar-data-app-1.0-SNAPSHOT.jar app.jar
EXPOSE 8001
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

