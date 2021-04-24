@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.googleapis.auth
import com.mfeldsztejn.kjs.gaxios.*
import com.mfeldsztejn.kjs.googleapis.auth.*
import com.mfeldsztejn.kjs.googleapis.auth.Headers
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

external interface BaseExternalAccountClientOptions {
    var type: String
    var audience: String
    var subject_token_type: String
    var service_account_impersonation_url: String?
        get() = definedExternally
        set(value) = definedExternally
    var token_url: String
    var token_info_url: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_secret: String?
        get() = definedExternally
        set(value) = definedExternally
    var quota_project_id: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CredentialsWithResponse : Credentials {
    var res: GaxiosResponse__0?
        get() = definedExternally
        set(value) = definedExternally
}

external open class BaseExternalAccountClient(options: BaseExternalAccountClientOptions, additionalOptions: RefreshOptions = definedExternally) : AuthClient {
    open var scopes: dynamic /* String | Array<String> */
    open var cachedAccessToken: Any
    open var audience: String
    open var subjectTokenType: Any
    open var serviceAccountImpersonationUrl: Any
    open var stsCredential: Any
    override var projectId: String?
    open var projectNumber: String?
    override var eagerRefreshThresholdMillis: Number
    override var forceRefreshOnFailure: Boolean
    fun setCredentials(credentials: Credentials)
    open fun retrieveSubjectToken(): kotlin.js.Promise<String>
    override fun getAccessToken(): kotlin.js.Promise<GetAccessTokenResponse>
    open fun getRequestHeaders(): kotlin.js.Promise<Headers>
    override fun <T> request(opts: GaxiosOptions): GaxiosPromise<T>
    open fun <T> request(opts: GaxiosOptions, callback: BodyResponseCallback<T>)
    open fun getProjectId(): kotlin.js.Promise<String?>
    open fun <T> requestAsync(opts: GaxiosOptions, retry: Boolean = definedExternally): kotlin.js.Promise<GaxiosResponse<T>>
    open fun refreshAccessTokenAsync(): kotlin.js.Promise<CredentialsWithResponse>
    open var getProjectNumber: Any
    open var getImpersonatedAccessToken: Any
    open var isExpired: Any
    open var getScopesArray: Any
}
