plugins {
    id("java")
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "ru.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Подключение к подпроекту radar-data-models
    implementation(project(":radar-data:radar-data-models"))

    // Основные зависимости Spring Boot и Jakarta Persistence API
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.postgresql:postgresql:42.6.2")
    implementation("jakarta.persistence:jakarta.persistence-api:3.0.0") // Добавляем Jakarta Persistence API

    // Lombok для автоматической генерации кода
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

java.sourceCompatibility = JavaVersion.VERSION_17

