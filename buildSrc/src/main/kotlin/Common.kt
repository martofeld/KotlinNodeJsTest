import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import java.io.File


fun KotlinJsProjectExtension.jsExecutableTargets() {
    js(IR) {
        compilations.all {
            outputModuleName = project.name
        }
        binaries.executable()
        useCommonJs()

        nodejs {
            distribution {
                this.directory = File(project.buildDir, "/testing")
                this.name = "${project.name}-distro.js"
            }
        }
    }
}

fun KotlinJsProjectExtension.jsLibraryTargets() {
    js(IR) {

        binaries.library()
        useCommonJs()
        nodejs {
            /*distribution {
                this.directory = File(project.buildDir, "/testing")
                this.name = "${project.name}-distro.js"
            }*/
        }
    }
}