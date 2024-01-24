plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.apache.commons:commons-lang3:3.12.0")
    implementation ("io.github.java-native:jssc:2.9.4")
    implementation ("org.slf4j:slf4j-api:2.0.5")
    implementation ("org.slf4j:slf4j-simple:2.0.5")
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}