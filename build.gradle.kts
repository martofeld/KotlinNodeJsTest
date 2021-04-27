plugins {
    kotlin("js") version "1.4.32"
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.js")

//    kotlin {
//        js(LEGACY) {
//            nodejs {
//            }
//            binaries.executable()
//            useCommonJs()
//        }
//    }
    group = "me.mfeldsztejn"
    version = "1.0-SNAPSHOT"

    tasks.register<DeleteKotlinJsIncludedFilesTask>("deleteKotlinJsIncludedFilesTask")

    afterEvaluate {
//        tasks.findByName("compileKotlinJs")?.dependsOn?.add(deleteKotlinJsIncludedFilesTask)
        val deleteKotlinJsIncludedFilesTask = tasks.findByName("deleteKotlinJsIncludedFilesTask")
        tasks.findByName("generateExternalsIntegrated")?.finalizedBy(deleteKotlinJsIncludedFilesTask)
    }
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
    }

    kotlin {
        js(IR) {
            nodejs {
            }
            binaries.executable()
            useCommonJs()
        }
    }
}

open class DeleteKotlinJsIncludedFilesTask: DefaultTask() {

    @TaskAction
    fun run() {
        File(project.buildDir, "externals/${project.rootProject.name}-${project.name}/src").listFiles()?.forEach {
            if (it.name in getClasses()) {
                it.delete()
                println("Removing file ${it.name}")
            }
        }
    }

    private fun getClasses(): List<String> {
        return listOf(
            "assert.assert.assert.module_node.kt",
            "assert.assert.module_node.kt",
            "async_hooks.async_hooks.module_node.kt",
            "buffer.buffer.module_node.kt",
            "child_process.child_process.exec.module_node.kt",
            "child_process.child_process.execFile.module_node.kt",
            "child_process.child_process.module_node.kt",
            "cluster.cluster.module_node.kt",
            "constants.constants.module_node.kt",
            "crypto.crypto.constants.module_node.kt",
            "crypto.crypto.generateKeyPair.module_node.kt",
            "crypto.crypto.module_node.kt",
            "dgram.dgram.module_node.kt",
            "dns.dns.lookup.module_node.kt",
            "dns.dns.lookupService.module_node.kt",
            "dns.dns.module_node.kt",
            "dns.dns.promises.module_node.kt",
            "dns.dns.resolve.module_node.kt",
            "dns.dns.resolve4.module_node.kt",
            "dns.dns.resolve6.module_node.kt",
            "dns.dns.resolveAny.module_node.kt",
            "dns.dns.resolveCname.module_node.kt",
            "dns.dns.resolveMx.module_node.kt",
            "dns.dns.resolveNaptr.module_node.kt",
            "dns.dns.resolveNs.module_node.kt",
            "dns.dns.resolvePtr.module_node.kt",
            "dns.dns.resolveSoa.module_node.kt",
            "dns.dns.resolveSrv.module_node.kt",
            "dns.dns.resolveTxt.module_node.kt",
            "domain.domain.module_node.kt",
            "events.events.EventEmitter.module_node.kt",
            "events.events.module_node.kt",
            "fs.fs.access.module_node.kt",
            "fs.fs.appendFile.module_node.kt",
            "fs.fs.chmod.module_node.kt",
            "fs.fs.chown.module_node.kt",
            "fs.fs.close.module_node.kt",
            "fs.fs.constants.module_node.kt",
            "fs.fs.copyFile.module_node.kt",
            "fs.fs.exists.module_node.kt",
            "fs.fs.fchmod.module_node.kt",
            "fs.fs.fchown.module_node.kt",
            "fs.fs.fdatasync.module_node.kt",
            "fs.fs.fstat.module_node.kt",
            "fs.fs.fsync.module_node.kt",
            "fs.fs.ftruncate.module_node.kt",
            "fs.fs.futimes.module_node.kt",
            "fs.fs.lchmod.module_node.kt",
            "fs.fs.lchown.module_node.kt",
            "fs.fs.link.module_node.kt",
            "fs.fs.lstat.module_node.kt",
            "fs.fs.mkdir.module_node.kt",
            "fs.fs.mkdtemp.module_node.kt",
            "fs.fs.module_node.kt",
            "fs.fs.open.module_node.kt",
            "fs.fs.opendir.module_node.kt",
            "fs.fs.promises.module_node.kt",
            "fs.fs.read.module_node.kt",
            "fs.fs.readFile.module_node.kt",
            "fs.fs.readdir.module_node.kt",
            "fs.fs.readlink.module_node.kt",
            "fs.fs.readv.module_node.kt",
            "fs.fs.realpath.module_node.kt",
            "fs.fs.realpathSync.module_node.kt",
            "fs.fs.rename.module_node.kt",
            "fs.fs.rmdir.module_node.kt",
            "fs.fs.stat.module_node.kt",
            "fs.fs.symlink.module_node.kt",
            "fs.fs.truncate.module_node.kt",
            "fs.fs.unlink.module_node.kt",
            "fs.fs.utimes.module_node.kt",
            "fs.fs.write.module_node.kt",
            "fs.fs.writeFile.module_node.kt",
            "fs.fs.writev.module_node.kt",
            "globals.global.module_node.kt",
            "globals.module_node.kt",
            "globals.setImmediate.module_node.kt",
            "globals.setTimeout.module_node.kt",
            "http.http.module_node.kt",
            "http2.http2.constants.module_node.kt",
            "http2.http2.module_node.kt",
            "https.https.module_node.kt",
            "index.module_node.kt",
            "inspector.inspector.module_node.kt",
            "lib.es2015.collection.kt",
            "lib.es2015.iterable.kt",
//            "lib.es5.kt",
            "lib.scripthost.kt",
            "module.module.module_node.kt",
            "net.net.module_node.kt",
            "nonDeclarations.Intl.kt",
            "nonDeclarations.NodeJS.kt",
            "nonDeclarations.assert.assert.kt",
            "nonDeclarations.async_hooks.kt",
            "nonDeclarations.child_process.exec.kt",
            "nonDeclarations.child_process.kt",
            "nonDeclarations.cluster.kt",
            "nonDeclarations.crypto.generateKeyPair.kt",
            "nonDeclarations.crypto.kt",
            "nonDeclarations.dgram.kt",
            "nonDeclarations.dns.kt",
            "nonDeclarations.dns.lookupService.kt",
            "nonDeclarations.events.kt",
            "nonDeclarations.fs.kt",
            "nonDeclarations.fs.promises.kt",
            "nonDeclarations.fs.read.kt",
            "nonDeclarations.fs.write.kt",
            "nonDeclarations.http.kt",
            "nonDeclarations.http2.kt",
            "nonDeclarations.https.kt",
            "nonDeclarations.inspector.Console.kt",
            "nonDeclarations.inspector.Debugger.kt",
            "nonDeclarations.inspector.HeapProfiler.kt",
            "nonDeclarations.inspector.NodeRuntime.kt",
            "nonDeclarations.inspector.NodeTracing.kt",
            "nonDeclarations.inspector.NodeWorker.kt",
            "nonDeclarations.inspector.Profiler.kt",
            "nonDeclarations.inspector.Runtime.kt",
            "nonDeclarations.inspector.Schema.kt",
            "nonDeclarations.inspector.kt",
            "nonDeclarations.net.kt",
            "nonDeclarations.os.kt",
            "nonDeclarations.path.path.kt",
            "nonDeclarations.perf_hooks.kt",
            "nonDeclarations.process.global.NodeJS.kt",
            "nonDeclarations.punycode.kt",
            "nonDeclarations.querystring.kt",
            "nonDeclarations.readline.kt",
            "nonDeclarations.repl.kt",
            "nonDeclarations.tls.kt",
            "nonDeclarations.trace_events.kt",
            "nonDeclarations.url.kt",
            "nonDeclarations.util.kt",
            "nonDeclarations.v8.kt",
            "nonDeclarations.vm.kt",
            "nonDeclarations.worker_threads.kt",
            "nonDeclarations.zlib.kt",
            "os.os.constants.errno.module_node.kt",
            "os.os.constants.module_node.kt",
            "os.os.constants.priority.module_node.kt",
            "os.os.module_node.kt",
            "path.path.module_node.kt",
            "perf_hooks.perf_hooks.constants.module_node.kt",
            "perf_hooks.perf_hooks.module_node.kt",
            "punycode.punycode.module_node.kt",
            "querystring.querystring.module_node.kt",
            "readline.readline.module_node.kt",
            "repl.repl.module_node.kt",
            "stream.stream.module_node.kt",
            "string_decoder.string_decoder.module_node.kt",
            "timers.tindex.e.module_expresimers.module_node.kt",
            "timers.timers.setImmediate.module_node.kt",
            "timers.timers.setTimeout.module_node.kt",
            "tls.tls.module_node.kt",
            "trace_events.trace_events.module_node.kt",
            "tty.tty.module_node.kt",
            "url.url.module_node.kt",
            "util.util.inspect.module_node.kt",
            "util.util.module_node.kt",
            "util.util.promisify.module_node.kt",
            "util.util.types.module_node.kt",
            "v8.v8.module_node.kt",
            "vm.vm.module_node.kt",
            "worker_threads.worker_threads.module_node.kt",
            "zlib.zlib.constants.module_node.kt",
            "zlib.zlib.module_node.kt",
            "fs.fs.rm.module_node.kt",
            "promises.node:fs.promises.module_node.kt"
        )
    }
}