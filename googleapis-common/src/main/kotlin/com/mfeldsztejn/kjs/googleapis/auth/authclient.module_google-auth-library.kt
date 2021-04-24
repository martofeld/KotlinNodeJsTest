@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package com.mfeldsztejn.kjs.googleapis.auth

import com.mfeldsztejn.kjs.gaxios.*
import com.mfeldsztejn.kjs.googleapis.common.Credentials
import events.EventEmitter.EventEmitter
import kotlin.js.*

external interface `T$2` {
    var token: String?
        get() = definedExternally
        set(value) = definedExternally
    var res: GaxiosResponse__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CredentialsClient {
    var projectId: String?
        get() = definedExternally
        set(value) = definedExternally
    var eagerRefreshThresholdMillis: Number
    var forceRefreshOnFailure: Boolean
    fun getAccessToken(): kotlin.js.Promise<`T$2`>
    fun getRequestHeaders(url: String = definedExternally): kotlin.js.Promise<Headers>
    fun <T> request(opts: GaxiosOptions): GaxiosPromise<T>
    fun setCredentials(credentials: Credentials)
    fun on(event: String /* "tokens" */, listener: (tokens: Credentials) -> Unit): CredentialsClient /* this */
}

external open class AuthClient : EventEmitter, CredentialsClient {
    override fun on(event: String /* "tokens" */, listener: (tokens: Credentials) -> Unit): AuthClient /* this */
    open var quotaProjectId: String
    open var transporter: DefaultTransporter
    open var credentials: Credentials
    override var projectId: String?
    override var eagerRefreshThresholdMillis: Number
    override var forceRefreshOnFailure: Boolean
    override fun <T> request(opts: GaxiosOptions): GaxiosPromise<T>
    override fun getRequestHeaders(url: String): kotlin.js.Promise<Headers>
    override fun getAccessToken(): kotlin.js.Promise<`T$2`>
    override fun setCredentials(credentials: Credentials)
    open fun addSharedMetadataHeaders(headers: Headers): Headers
}
