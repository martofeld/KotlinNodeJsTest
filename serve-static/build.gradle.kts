kotlin {
    jsLibraryTargets()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    implementation(npm("serve-static", "^1.14.1"))
}