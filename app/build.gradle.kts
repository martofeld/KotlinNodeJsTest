import org.jetbrains.kotlin.gradle.targets.js.dukat.DukatTask
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-nodejs:0.0.7")

    implementation(project(":express"))
    implementation(project(":googleapis-sheets"))
    implementation(project(":googleapis-common"))
    implementation(npm("bluebird", "^3.7.2"))
    implementation(npm("@types/bluebird", "^3.5.33", generateExternals = true))
    implementation(npm("handlebars", "^4.7.7"))
    implementation(npm("@types/handlebars", "^4.1.0", generateExternals = true))
    implementation(npm("dotenv", "^8.2.0", generateExternals = true))
    implementation(npm("moment", "^2.24.0", generateExternals = true))
    implementation(npm("xml-js", "^1.6.11", generateExternals = true))
//    implementation(npm("body-parser", "^1.18.3"))
//    implementation(npm("@types/body-parser", "^1.19.0", generateExternals = true))
    implementation(npm("node-schedule", "^1.3.2"))
    implementation(npm("@types/node-schedule", "^1.3.1", generateExternals = true))

//    implementation(npm("@googleapis/docs", "0.2.0", generateExternals = true))
//    implementation(npm("@googleapis/sheets", "0.3.0", generateExternals = true))
//    implementation(npm("@googleapis/gmail", "0.2.0", generateExternals = true))
//    implementation("com.google.api-client:google-api-client:1.30.4")
//    implementation("com.google.oauth-client:google-oauth-client-jetty:1.30.6")
//    implementation("com.google.apis:google-api-services-sheets:v4-rev581-1.25.0")
//    implementation(npm("@types/express", "^4.17.1", generateExternals = true))
//    implementation(npm("serve-static", ">=1.14.1"))
//    implementation(npm("@types/serve-static", ">=1.13.9", generateExternals = true))
//    implementation(npm("@types/express", "^4.17.11", generateExternals = true))
}

val removeKtxNodejsFiles = tasks.create("removeKtxNodejsFiles").apply {
    doFirst {
        println("Removing extra files")
        File(project.buildDir, "externals/${rootProject.name}-${project.name}/src").listFiles()?.forEach {
            val classes = listOf(
                "promises.dns.promises.module_node.kt",
                "promises.stream.promises.module_node.kt",
                "lib.dom.kt",
                "dns.dns.resolveCaa.module_node.kt",
                "timers.timers.module_node.kt",
                "promises.timers.promises.module_node.kt"
            )
            if (it.name in classes) {
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
            val lines = file.readLines()
            file.writer().use { writter ->
                lines.forEach {
                    val newLine = it
//                        .replace(" Promise", " kotlin.js.Promise")
                        .replace("stream.Readable", "stream.internal.Readable")
                        .replace("import events.EventEmitter", "import events.EventEmitter.EventEmitter")
                    writter.write("$newLine\n")
                }
            }
        }
    }
}

fixPackages.dependsOn.add(removeKtxNodejsFiles)
tasks.findByName("generateExternalsIntegrated")?.finalizedBy(fixPackages)