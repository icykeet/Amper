plugins {
    id("java")
}

group = "ru.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Обеспечивает поддержку JPA-аннотаций
    implementation("jakarta.persistence:jakarta.persistence-api:3.0.0")
    
    // Lombok
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

java.sourceCompatibility = JavaVersion.VERSION_17

