FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/vote-data-app-1.0-SNAPSHOT.jar app.jar
EXPOSE 8002
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

