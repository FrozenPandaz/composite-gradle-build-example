plugins {
    `java-library`
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}

allprojects {
    apply {
        plugin("project-report")
    }
}
