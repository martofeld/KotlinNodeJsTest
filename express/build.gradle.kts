kotlin {
    jsLibraryTargets()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    api(project(":serve-static"))
    api(project(":express-serve-static-core"))
    api(npm("express", "^4.17.1"))
    api(npm("@types/express", "^4.17.1", generateExternals = true))
}

val removeKtxNodejsFiles = tasks.create("removeKtxNodejsFiles").apply {
    dependsOn(tasks.findByName("generateExternalsIntegrated"))
    doFirst {
        val overrodeFiles =
            listOf(
                "express-serve-static-core.express_serve_static_core.module_express-serve-static-core.kt"
            ) +
                    (File(project.projectDir, "src/main/kotlin/com/mfeldsztejn/kjs/express/internal").listFiles()
                        ?.map { it.name } ?: emptyList()) +
                    (File(project.projectDir, "src/main/kotlin/com/mfeldsztejn/kjs/express").listFiles()
                        ?.map { it.name } ?: emptyList())
        File(project.buildDir, "externals/${rootProject.name}-${project.name}/src").listFiles()?.forEach {
            if (it.name in overrodeFiles) {
                it.delete()
                println("Removing file ${it.name}")
            }
        }
    }
}

tasks.findByName("compileKotlinJs")?.dependsOn?.add(removeKtxNodejsFiles)