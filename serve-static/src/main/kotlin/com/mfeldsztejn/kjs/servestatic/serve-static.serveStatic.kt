@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
package com.mfeldsztejn.kjs.servestatic

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

external var mime: Any

external interface ServeStaticOptions<R : http.ServerResponse> {
    var cacheControl: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dotfiles: String?
        get() = definedExternally
        set(value) = definedExternally
    var etag: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var extensions: dynamic /* Array<String>? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var fallthrough: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var immutable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var index: dynamic /* Boolean? | String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var lastModified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxAge: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var redirect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var setHeaders: ((res: R, path: String, stat: Any) -> Any)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RequestHandler<R : http.ServerResponse> {
    @nativeInvoke
    operator fun invoke(request: http.IncomingMessage, response: R, next: () -> Unit): Any
}

external interface RequestHandlerConstructor<R : http.ServerResponse> {
    @nativeInvoke
    operator fun invoke(root: String, options: ServeStaticOptions<R> = definedExternally): RequestHandler<R>
    var mime: Any
}