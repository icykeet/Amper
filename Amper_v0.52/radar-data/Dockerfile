# Используем базовый образ с OpenJDK
FROM openjdk:21-jdk-slim

# Устанавливаем рабочую директорию
WORKDIR /app

# Копируем собранный JAR файл в контейнер
COPY build/libs/radar-data-1.0-SNAPSHOT.jar app.jar

# Указываем порт, который будет использоваться приложением (замените на нужный)
EXPOSE 8081

# Запускаем приложение
CMD ["java", "-jar", "/app/app.jar"]

