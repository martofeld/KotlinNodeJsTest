@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.googleapis.auth
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

external interface Credentials {
    var refresh_token: String?
        get() = definedExternally
        set(value) = definedExternally
    var expiry_date: Number?
        get() = definedExternally
        set(value) = definedExternally
    var access_token: String?
        get() = definedExternally
        set(value) = definedExternally
    var token_type: String?
        get() = definedExternally
        set(value) = definedExternally
    var id_token: String?
        get() = definedExternally
        set(value) = definedExternally
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface JWTInput {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_email: String?
        get() = definedExternally
        set(value) = definedExternally
    var private_key: String?
        get() = definedExternally
        set(value) = definedExternally
    var private_key_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var project_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_secret: String?
        get() = definedExternally
        set(value) = definedExternally
    var refresh_token: String?
        get() = definedExternally
        set(value) = definedExternally
    var quota_project_id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CredentialBody {
    var client_email: String?
        get() = definedExternally
        set(value) = definedExternally
    var private_key: String?
        get() = definedExternally
        set(value) = definedExternally
}
