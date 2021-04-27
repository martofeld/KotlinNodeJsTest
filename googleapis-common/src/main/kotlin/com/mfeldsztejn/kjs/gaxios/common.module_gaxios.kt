@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.gaxios

import com.mfeldsztejn.kjs.googleapis.common.AbortSignal
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

typealias GaxiosError<T> = Throwable

external open class GaxiosError__0 : GaxiosError<Any>

external interface Headers {
    @nativeGetter
    operator fun get(index: String): Any?
    @nativeSetter
    operator fun set(index: String, value: Any)
}

typealias GaxiosPromise<T> = kotlin.js.Promise<GaxiosResponse<T>>

external interface GaxiosXMLHttpRequest {
    var responseURL: String
}

external interface GaxiosResponse<T> {
    var config: GaxiosOptions
    var data: T
    var status: Number
    var statusText: String
    var headers: Headers
    var request: GaxiosXMLHttpRequest
}

external interface GaxiosResponse__0 : GaxiosResponse<Any>

external interface `T$0` {
    @nativeGetter
    operator fun get(index: String): dynamic /* String? | Number? */
    @nativeSetter
    operator fun set(index: String, value: String)
    @nativeSetter
    operator fun set(index: String, value: Number)
}

external interface GaxiosOptions {
    var adapter: ((options: GaxiosOptions, defaultAdapter: (options: GaxiosOptions) -> GaxiosPromise<dynamic>) -> GaxiosPromise<dynamic>)?
        get() = definedExternally
        set(value) = definedExternally
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var baseUrl: String?
        get() = definedExternally
        set(value) = definedExternally
    var baseURL: String?
        get() = definedExternally
        set(value) = definedExternally
    var method: String? /* "GET" | "HEAD" | "POST" | "DELETE" | "PUT" | "CONNECT" | "OPTIONS" | "TRACE" | "PATCH" */
        get() = definedExternally
        set(value) = definedExternally
    var headers: Headers?
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    var body: Any?
        get() = definedExternally
        set(value) = definedExternally
    var maxContentLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxRedirects: Number?
        get() = definedExternally
        set(value) = definedExternally
    var follow: Number?
        get() = definedExternally
        set(value) = definedExternally
    var params: Any?
        get() = definedExternally
        set(value) = definedExternally
    var paramsSerializer: ((params: `T$0`) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var timeout: Number?
        get() = definedExternally
        set(value) = definedExternally
    var onUploadProgress: ((progressEvent: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var responseType: String? /* "arraybuffer" | "blob" | "json" | "text" | "stream" */
        get() = definedExternally
        set(value) = definedExternally
    var agent: dynamic /* Agent? | ((parsedUrl: URL) -> Agent)? */
        get() = definedExternally
        set(value) = definedExternally
    var validateStatus: ((status: Number) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var retryConfig: RetryConfig?
        get() = definedExternally
        set(value) = definedExternally
    var retry: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var signal: AbortSignal?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fetchImplementation: FetchImplementation?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RetryConfig {
    var retry: Number?
        get() = definedExternally
        set(value) = definedExternally
    var currentRetryAttempt: Number?
        get() = definedExternally
        set(value) = definedExternally
    var retryDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var httpMethodsToRetry: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var statusCodesToRetry: Array<Array<Number>>?
        get() = definedExternally
        set(value) = definedExternally
    var onRetryAttempt: ((err: GaxiosError__0) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var shouldRetry: ((err: GaxiosError__0) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var noResponseRetries: Number?
        get() = definedExternally
        set(value) = definedExternally
}

typealias FetchImplementation = (input: FetchRequestInfo, init: FetchRequestInit) -> kotlin.js.Promise<FetchResponse>

typealias FetchRequestInfo = Any

external interface FetchResponse {
    var status: Number
    var statusText: String
    var url: String
    var body: Any?
    fun arrayBuffer(): kotlin.js.Promise<Any>
    fun blob(): kotlin.js.Promise<Any>
    var headers: FetchHeaders
    fun json(): kotlin.js.Promise<Any>
    fun text(): kotlin.js.Promise<String>
}

external interface FetchRequestInit {
    var method: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FetchHeaders {
    fun append(name: String, value: String)
    fun delete(name: String)
    fun get(name: String): String?
    fun has(name: String): Boolean
    fun set(name: String, value: String)
    fun forEach(callbackfn: (value: String, key: String) -> Unit, thisArg: Any = definedExternally)
}
