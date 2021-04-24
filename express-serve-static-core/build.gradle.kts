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
    implementation(npm("express-serve-static-core", "^0.1.1"))

    implementation(npm("qs", "6.10.1"))
    implementation(npm("@types/qs", "6.9.6", generateExternals = true))

    implementation(npm("range-parser", "1.2.1"))
    implementation(npm("@types/range-parser", "1.2.3", generateExternals = true))
}