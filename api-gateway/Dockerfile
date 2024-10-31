# Используем базовый образ с OpenJDK
FROM openjdk:21-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем Gradle wrapper и все необходимые файлы
COPY gradlew .
COPY gradle/wrapper/gradle-wrapper.jar gradle/wrapper/gradle-wrapper.jar
COPY gradle/wrapper/gradle-wrapper.properties gradle/wrapper/gradle-wrapper.properties
COPY gradle/wrapper/gradle-8.7-bin.zip gradle/wrapper/gradle-8.7-bin.zip

# Делаем gradlew исполняемым
RUN chmod +x gradlew

# Указываем порт
EXPOSE 8080

# Запускаем приложение с командой bootRun
CMD ["./gradlew", ":api-gateway:bootRun"]

