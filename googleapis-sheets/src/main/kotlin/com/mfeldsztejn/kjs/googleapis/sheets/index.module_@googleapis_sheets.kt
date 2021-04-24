@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.googleapis.sheets
import com.mfeldsztejn.kjs.gaxios.*
import com.mfeldsztejn.kjs.googleapis.auth.*
import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external object VERSIONS {
    var v4: Any
}

external fun sheets(version: String /* "v4" */): Sheets

external fun sheets(options: Options): Sheets

external var auth: AuthPlus
