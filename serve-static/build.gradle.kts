plugins {
    kotlin("js")
}

group = "com.mfeldsztejn"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    js(LEGACY) {
        nodejs {
        }
        binaries.executable()
        useCommonJs()
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    implementation(npm("serve-static", "^1.14.1"))
}