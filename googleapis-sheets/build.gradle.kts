kotlin {
    jsLibraryTargets()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")
    implementation(project(":googleapis-common"))
    implementation(npm("@googleapis/sheets", "0.3.0", generateExternals = true))
}

val removeKtxNodejsFiles = tasks.create("removeKtxNodejsFiles").apply {
    dependsOn(tasks.findByName("generateExternalsIntegrated"))
    doFirst {
        val overrodeFiles =
                    listOf(
                        "index.EventTarget.module_event-target-shim.kt",
                        "index.module_event-target-shim.kt",
                        "globals.NodeJS.module_node.kt",
                        "lib.es5.kt",
                        "lib.es2018.asynciterable.module_dukat.kt"
                    ) +
                    (File(project.projectDir, "../googleapis-common/src/main/kotlin/com/mfeldsztejn/kjs/googleapis/common").listFiles()
                        ?.map { it.name } ?: emptyList()) +
                    (File(project.projectDir, "../googleapis-common/src/main/kotlin/com/mfeldsztejn/kjs/gaxios").listFiles()
                        ?.map { it.name } ?: emptyList()) +
                    (File(project.projectDir, "../googleapis-common/src/main/kotlin/com/mfeldsztejn/kjs/googleapis/auth").listFiles()
                        ?.map { it.name } ?: emptyList()) +
                    (File(project.projectDir, "src/main/kotlin/com/mfeldsztejn/kjs/googleapis/sheets").listFiles()
                        ?.map { it.name } ?: emptyList())
        File(project.buildDir, "externals/${rootProject.name}-${project.name}/src").listFiles()?.forEach {
            if (it.name in overrodeFiles) {
                it.delete()
                println("Removing file ${it.name}")
            }
        }
    }
}

val fixPackages = tasks.create("fixPackages").apply {
    dependsOn(removeKtxNodejsFiles)
    doFirst {
        File(project.buildDir, "externals/${rootProject.name}-${project.name}/src").listFiles()?.forEach { file ->
            val newLines = file.readLines().toMutableList().apply {
                if(none { it.startsWith("package") }) {
                    val index = indexOfFirst { it.startsWith("import") }
                    add(index - 1, "package com.mfeldsztejn.kjs.googleapis.sheets")
                }
                add(5, "import com.mfeldsztejn.kjs.gaxios.*")
                add(6, "import com.mfeldsztejn.kjs.googleapis.auth.*")
            }
            file.writer().use { writter ->
                newLines.forEach {
                    val newLine = it
                        .replace(" Promise", " kotlin.js.Promise")
                        .replace("stream.Readable", "stream.internal.Readable")
                    writter.write("$newLine\n")
                }
            }
        }
    }
}

tasks.findByName("compileKotlinJs")?.dependsOn?.add(fixPackages)