plugins {
    `java-library`
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.4")
}


allprojects {
    apply {
        plugin("project-report")
    }
}
