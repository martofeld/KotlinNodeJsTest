@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.googleapis.auth
import com.mfeldsztejn.kjs.gaxios.*
import com.mfeldsztejn.kjs.googleapis.common.*
import kotlin.js.*

external interface ProjectIdCallback {
    @nativeInvoke
    operator fun invoke(err: Error? = definedExternally, projectId: String? = definedExternally)
}

external interface CredentialCallback {
    @nativeInvoke
    operator fun invoke(err: Error?, result: JWT = definedExternally)
    @nativeInvoke
    operator fun invoke(err: Error?)
    @nativeInvoke
    operator fun invoke(err: Error?, result: UserRefreshClient = definedExternally)
    @nativeInvoke
    operator fun invoke(err: Error?, result: BaseExternalAccountClient = definedExternally)
}

external interface DeprecatedGetClientOptions

external interface ADCCallback {
    @nativeInvoke
    operator fun invoke(err: Error?, credential: AuthClient = definedExternally, projectId: String? = definedExternally)
}

external interface ADCResponse {
    var credential: AuthClient
    var projectId: String?
}

external interface GoogleAuthOptions {
    var keyFilename: String?
        get() = definedExternally
        set(value) = definedExternally
    var keyFile: String?
        get() = definedExternally
        set(value) = definedExternally
    var credentials: dynamic /* CredentialBody? | IdentityPoolClientOptions? | AwsClientOptions? */
        get() = definedExternally
        set(value) = definedExternally
    var clientOptions: dynamic /* JWTOptions? | OAuth2ClientOptions? | UserRefreshClientOptions? */
        get() = definedExternally
        set(value) = definedExternally
    var scopes: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var projectId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$4` {
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var uri: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Headers?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$5` {
    var url: String?
        get() = definedExternally
        set(value) = definedExternally
    var uri: String?
        get() = definedExternally
        set(value) = definedExternally
    var headers: Headers?
        get() = definedExternally
        set(value) = definedExternally
}

external open class GoogleAuth(opts: GoogleAuthOptions = definedExternally) {
    open var transporter: Transporter
    open var checkIsGCE: Any
    open var _getDefaultProjectIdPromise: Any
    open var _cachedProjectId: Any
    open var jsonContent: dynamic /* JWTInput? | IdentityPoolClientOptions? | AwsClientOptions? */
    open var cachedCredential: dynamic /* JWT? | UserRefreshClient? | BaseExternalAccountClient? | Compute? */
    open var defaultScopes: dynamic /* String | Array<String> */
    open var keyFilename: Any
    open var scopes: Any
    open var clientOptions: Any
    open fun getProjectId(): kotlin.js.Promise<String>
    open fun getProjectId(callback: ProjectIdCallback)
    open var getProjectIdAsync: Any
    open var getAnyScopes: Any
    open fun getApplicationDefault(): kotlin.js.Promise<ADCResponse>
    open fun getApplicationDefault(callback: ADCCallback)
    open fun getApplicationDefault(options: RefreshOptions): kotlin.js.Promise<ADCResponse>
    open fun getApplicationDefault(options: RefreshOptions, callback: ADCCallback)
    open var getApplicationDefaultAsync: Any
    open fun _checkIsGCE(): kotlin.js.Promise<Boolean>
    open fun _tryGetApplicationCredentialsFromEnvironmentVariable(options: RefreshOptions = definedExternally): kotlin.js.Promise<dynamic /* JWT? | UserRefreshClient? | BaseExternalAccountClient? */>
    open fun _tryGetApplicationCredentialsFromWellKnownFile(options: RefreshOptions = definedExternally): kotlin.js.Promise<dynamic /* JWT? | UserRefreshClient? | BaseExternalAccountClient? */>
    open fun _getApplicationCredentialsFromFilePath(filePath: String, options: RefreshOptions = definedExternally): kotlin.js.Promise<dynamic /* JWT | UserRefreshClient | BaseExternalAccountClient */>
    open fun fromJSON(json: JWTInput, options: RefreshOptions = definedExternally): dynamic /* JWT | UserRefreshClient | BaseExternalAccountClient */
    open var _cacheClientFromJSON: Any
    open fun fromStream(inputStream: stream.internal.Readable): kotlin.js.Promise<dynamic /* JWT | UserRefreshClient | BaseExternalAccountClient */>
    open fun fromStream(inputStream: stream.internal.Readable, callback: CredentialCallback)
    open fun fromStream(inputStream: stream.internal.Readable, options: RefreshOptions): kotlin.js.Promise<dynamic /* JWT | UserRefreshClient | BaseExternalAccountClient */>
    open fun fromStream(inputStream: stream.internal.Readable, options: RefreshOptions, callback: CredentialCallback)
    open var fromStreamAsync: Any
    open fun fromAPIKey(apiKey: String, options: RefreshOptions = definedExternally): JWT
    open var _isWindows: Any
    open var getDefaultServiceProjectId: Any
    open var getProductionProjectId: Any
    open var getFileProjectId: Any
    open var getExternalAccountClientProjectId: Any
    open var getGCEProjectId: Any
    open fun getCredentials(): kotlin.js.Promise<CredentialBody>
    open fun getCredentials(callback: (err: Error?, credentials: CredentialBody) -> Unit)
    open var getCredentialsAsync: Any
    open fun getClient(options: DeprecatedGetClientOptions = definedExternally): kotlin.js.Promise<dynamic /* Compute | JWT | UserRefreshClient | BaseExternalAccountClient */>
    open fun getIdTokenClient(targetAudience: String): kotlin.js.Promise<IdTokenClient>
    open fun getAccessToken(): kotlin.js.Promise<String?>
    open fun getRequestHeaders(url: String = definedExternally): kotlin.js.Promise<Headers>
    open fun authorizeRequest(opts: `T$4`): kotlin.js.Promise<`T$5`>
    open fun <T> request(opts: GaxiosOptions): kotlin.js.Promise<GaxiosResponse<T>>
    open fun getEnv(): kotlin.js.Promise<GCPEnv>
    open fun sign(data: String): kotlin.js.Promise<String>

    companion object {
        var DefaultTransporter: Any
    }
}
