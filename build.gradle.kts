//plugins {
//    kotlin("js") apply false
//}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.js")

    group = "me.mfeldsztejn"
    version = "1.0-SNAPSHOT"

    tasks.register<DeleteKotlinJsIncludedFilesTask>("deleteKotlinJsIncludedFilesTask")

    afterEvaluate {
        val deleteKotlinJsIncludedFilesTask = tasks.findByName("deleteKotlinJsIncludedFilesTask")
        tasks.findByName("generateExternalsIntegrated")?.finalizedBy(deleteKotlinJsIncludedFilesTask)
    }
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
        mavenLocal()
    }
}