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
    implementation(project(":radar-data:radar-data-models"))
    implementation("org.springframework.boot:spring-boot-starter:3.2.5")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.5")
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.5")
    implementation("jakarta.persistence:jakarta.persistence-api:2.2.3")
    compileOnly("org.projectlombok:lombok:1.18.22")
    annotationProcessor("org.projectlombok:lombok:1.18.22")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}


tasks.test {
    useJUnitPlatform()
}

// Обновляем конфигурацию bootJar для включения всех классов из пути
tasks.bootJar {
    mainClass.set("ru.project.TechnologyApplication")
}

sourceSets {
    main {
        java {
            srcDir("radar-data-app/src/main/java")
        }
        resources {
            srcDir("radar-data-app/src/main/resources")
        }
    }
}

