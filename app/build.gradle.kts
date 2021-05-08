kotlin {
    jsExecutableTargets()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")

    implementation(project(":express"))
    implementation(project(":googleapis-sheets"))
    implementation(project(":googleapis-common"))
    implementation(npm("wasi", "0.0.6"))
    implementation(npm("bluebird", "^3.7.2"))
    implementation(npm("@types/bluebird", "^3.5.33", generateExternals = true))
    implementation(npm("handlebars", "^4.7.7"))
    implementation(npm("dotenv", "^8.2.0", generateExternals = true))
    implementation(npm("moment", "^2.24.0", generateExternals = true))
    implementation(npm("xml-js", "^1.6.11", generateExternals = true))
    implementation(npm("node-schedule", "^1.3.2"))
    implementation(npm("@types/node-schedule", "^1.3.1", generateExternals = true))
}

val removeKtxNodejsFiles = tasks.create("removeKtxNodejsFiles", RemoveFilesTask::class).apply {
    files = listOf(
        "fs.fs.lutimes.module_node.kt",
        "zlib.zlib.brotliCompress.module_node.kt",
        "zlib.zlib.brotliDecompress.module_node.kt",
        "zlib.zlib.deflate.module_node.kt",
        "zlib.zlib.deflateRaw.module_node.kt",
        "zlib.zlib.gunzip.module_node.kt",
        "zlib.zlib.gzip.module_node.kt",
        "zlib.zlib.inflate.module_node.kt",
        "zlib.zlib.inflateRaw.module_node.kt",
        "zlib.zlib.unzip.module_node.kt",
        "index.module_node-schedule.kt"
    )

    additionalDirectories = listOf(File(project.projectDir, "src/main/java").absolutePath)
}

val fixPackages = tasks.create("fixPackages").apply {
    dependsOn(removeKtxNodejsFiles)
    doFirst {
        File(project.buildDir, "externals/${project.name}/src").listFiles()?.forEach { file ->
            val lines = file.readLines()
            file.writer().use { writter ->
                lines.forEach {
                    val newLine = it
                        .replace("stream.Readable", "stream.internal.Readable")
                        .replace("import events.EventEmitter", "import events.EventEmitter.EventEmitter")
                    writter.write("$newLine\n")
                }
            }
        }
    }
}

tasks.findByName("generateExternalsIntegrated")?.finalizedBy(fixPackages)