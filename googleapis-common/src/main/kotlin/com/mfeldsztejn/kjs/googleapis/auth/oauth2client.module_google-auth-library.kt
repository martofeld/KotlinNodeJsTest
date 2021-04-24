@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.googleapis.auth
import com.mfeldsztejn.kjs.gaxios.*
import com.mfeldsztejn.kjs.googleapis.common.*
import kotlin.js.*
import tsstdlib.Map

external interface CodeVerifierResults {
    var codeVerifier: String
    var codeChallenge: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Certificates {
    @nativeGetter
    operator fun get(index: String): dynamic /* String? | JwkCertificate? */
    @nativeSetter
    operator fun set(index: String, value: String)
    @nativeSetter
    operator fun set(index: String, value: JwkCertificate)
}

external interface PublicKeys {
    @nativeGetter
    operator fun get(index: String): String?
    @nativeSetter
    operator fun set(index: String, value: String)
}

external interface Headers {
    @nativeGetter
    operator fun get(index: String): String?
    @nativeSetter
    operator fun set(index: String, value: String)
}

external enum class CodeChallengeMethod {
    Plain /* = "plain" */,
    S256 /* = "S256" */
}

external enum class CertificateFormat {
    PEM /* = "PEM" */,
    JWK /* = "JWK" */
}

external interface GetTokenOptions {
    var code: String
    var codeVerifier: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var redirect_uri: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TokenInfo {
    var aud: String
    var user_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var scopes: Array<String>
    var expiry_date: Number
    var sub: String?
        get() = definedExternally
        set(value) = definedExternally
    var azp: String?
        get() = definedExternally
        set(value) = definedExternally
    var access_type: String?
        get() = definedExternally
        set(value) = definedExternally
    var email: String?
        get() = definedExternally
        set(value) = definedExternally
    var email_verified: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenerateAuthUrlOpts {
    var access_type: String?
        get() = definedExternally
        set(value) = definedExternally
    var hd: String?
        get() = definedExternally
        set(value) = definedExternally
    var response_type: String?
        get() = definedExternally
        set(value) = definedExternally
    var client_id: String?
        get() = definedExternally
        set(value) = definedExternally
    var redirect_uri: String?
        get() = definedExternally
        set(value) = definedExternally
    var scope: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var state: String?
        get() = definedExternally
        set(value) = definedExternally
    var include_granted_scopes: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var login_hint: String?
        get() = definedExternally
        set(value) = definedExternally
    var prompt: String?
        get() = definedExternally
        set(value) = definedExternally
    var code_challenge_method: CodeChallengeMethod?
        get() = definedExternally
        set(value) = definedExternally
    var code_challenge: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetTokenCallback {
    @nativeInvoke
    operator fun invoke(err: GaxiosError__0?, token: Credentials? = definedExternally, res: GaxiosResponse__0? = definedExternally)
}

external interface GetTokenResponse {
    var tokens: Credentials
    var res: GaxiosResponse__0?
}

external interface GetAccessTokenCallback {
    @nativeInvoke
    operator fun invoke(err: GaxiosError__0?, token: String? = definedExternally, res: GaxiosResponse__0? = definedExternally)
}

external interface GetAccessTokenResponse {
    var token: String?
        get() = definedExternally
        set(value) = definedExternally
    var res: GaxiosResponse__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RefreshAccessTokenCallback {
    @nativeInvoke
    operator fun invoke(err: GaxiosError__0?, credentials: Credentials? = definedExternally, res: GaxiosResponse__0? = definedExternally)
}

external interface RefreshAccessTokenResponse {
    var credentials: Credentials
    var res: GaxiosResponse__0?
}

external interface RequestMetadataResponse {
    var headers: Headers
    var res: GaxiosResponse<Unit>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetFederatedSignonCertsCallback {
    @nativeInvoke
    operator fun invoke(err: GaxiosError__0?, certs: Certificates = definedExternally, response: GaxiosResponse<Unit>? = definedExternally)
}

external interface FederatedSignonCertsResponse {
    var certs: Certificates
    var format: CertificateFormat
    var res: GaxiosResponse<Unit>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GetIapPublicKeysCallback {
    @nativeInvoke
    operator fun invoke(err: GaxiosError__0?, pubkeys: PublicKeys = definedExternally, response: GaxiosResponse<Unit>? = definedExternally)
}

external interface IapPublicKeysResponse {
    var pubkeys: PublicKeys
    var res: GaxiosResponse<Unit>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RevokeCredentialsResult {
    var success: Boolean
}

external interface VerifyIdTokenOptions {
    var idToken: String
    var audience: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var maxExpiry: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OAuth2ClientOptions : RefreshOptions {
    var clientId: String?
        get() = definedExternally
        set(value) = definedExternally
    var clientSecret: String?
        get() = definedExternally
        set(value) = definedExternally
    var redirectUri: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RefreshOptions {
    var eagerRefreshThresholdMillis: Number?
        get() = definedExternally
        set(value) = definedExternally
    var forceRefreshOnFailure: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class OAuth2Client : AuthClient {
    constructor(options: OAuth2ClientOptions = definedExternally)
    constructor()
    constructor(clientId: String = definedExternally, clientSecret: String = definedExternally, redirectUri: String = definedExternally)
    constructor(clientId: String = definedExternally)
    constructor(clientId: String = definedExternally, clientSecret: String = definedExternally)
    open var redirectUri: Any
    open var certificateCache: Any
    open var certificateExpiry: Any
    open var certificateCacheFormat: Any
    open var refreshTokenPromises: Map<String, kotlin.js.Promise<GetTokenResponse>>
    open var _clientId: String
    open var _clientSecret: String
    open var apiKey: String
    override var eagerRefreshThresholdMillis: Number
    override var forceRefreshOnFailure: Boolean
    open fun generateAuthUrl(opts: GenerateAuthUrlOpts = definedExternally): String
    open fun generateCodeVerifier()
    open fun generateCodeVerifierAsync(): kotlin.js.Promise<CodeVerifierResults>
    open fun getToken(code: String): kotlin.js.Promise<GetTokenResponse>
    open fun getToken(options: GetTokenOptions): kotlin.js.Promise<GetTokenResponse>
    open fun getToken(code: String, callback: GetTokenCallback)
    open fun getToken(options: GetTokenOptions, callback: GetTokenCallback)
    open var getTokenAsync: Any
    open fun refreshToken(refreshToken: String? = definedExternally): kotlin.js.Promise<GetTokenResponse>
    open fun refreshTokenNoCache(refreshToken: String? = definedExternally): kotlin.js.Promise<GetTokenResponse>
    open fun refreshAccessToken(): kotlin.js.Promise<RefreshAccessTokenResponse>
    open fun refreshAccessToken(callback: RefreshAccessTokenCallback)
    open var refreshAccessTokenAsync: Any
    override fun getAccessToken(): kotlin.js.Promise<GetAccessTokenResponse>
    open fun getAccessToken(callback: GetAccessTokenCallback)
    open var getAccessTokenAsync: Any
    override fun getRequestHeaders(url: String): kotlin.js.Promise<Headers>
    open fun getRequestMetadataAsync(url: String? = definedExternally): kotlin.js.Promise<RequestMetadataResponse>
    open fun revokeToken(token: String): GaxiosPromise<RevokeCredentialsResult>
    open fun revokeToken(token: String, callback: BodyResponseCallback<RevokeCredentialsResult>)
    open fun revokeCredentials(): GaxiosPromise<RevokeCredentialsResult>
    open fun revokeCredentials(callback: BodyResponseCallback<RevokeCredentialsResult>)
    open var revokeCredentialsAsync: Any
    override fun <T> request(opts: GaxiosOptions): GaxiosPromise<T>
    open fun <T> request(opts: GaxiosOptions, callback: BodyResponseCallback<T>)
    open fun <T> requestAsync(opts: GaxiosOptions, retry: Boolean = definedExternally): kotlin.js.Promise<GaxiosResponse<T>>
    open fun verifyIdToken(options: VerifyIdTokenOptions): kotlin.js.Promise<LoginTicket>
    open fun verifyIdToken(options: VerifyIdTokenOptions, callback: (err: Error?, login: LoginTicket) -> Unit)
    open var verifyIdTokenAsync: Any
    open fun getTokenInfo(accessToken: String): kotlin.js.Promise<TokenInfo>
    open fun getFederatedSignonCerts(): kotlin.js.Promise<FederatedSignonCertsResponse>
    open fun getFederatedSignonCerts(callback: GetFederatedSignonCertsCallback)
    open fun getFederatedSignonCertsAsync(): kotlin.js.Promise<FederatedSignonCertsResponse>
    open fun getIapPublicKeys(): kotlin.js.Promise<IapPublicKeysResponse>
    open fun getIapPublicKeys(callback: GetIapPublicKeysCallback)
    open fun getIapPublicKeysAsync(): kotlin.js.Promise<IapPublicKeysResponse>
    open fun verifySignedJwtWithCerts()
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: String = definedExternally, issuers: Array<String> = definedExternally, maxExpiry: Number = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: String = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: String = definedExternally, issuers: Array<String> = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: Array<String> = definedExternally, issuers: Array<String> = definedExternally, maxExpiry: Number = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: Array<String> = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: Certificates, requiredAudience: Array<String> = definedExternally, issuers: Array<String> = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys, requiredAudience: String = definedExternally, issuers: Array<String> = definedExternally, maxExpiry: Number = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys, requiredAudience: String = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys, requiredAudience: String = definedExternally, issuers: Array<String> = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys, requiredAudience: Array<String> = definedExternally, issuers: Array<String> = definedExternally, maxExpiry: Number = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys, requiredAudience: Array<String> = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun verifySignedJwtWithCertsAsync(jwt: String, certs: PublicKeys, requiredAudience: Array<String> = definedExternally, issuers: Array<String> = definedExternally): kotlin.js.Promise<LoginTicket>
    open fun isTokenExpiring(): Boolean

    companion object {
        var GOOGLE_TOKEN_INFO_URL: Any = definedExternally // "https://oauth2.googleapis.com/tokeninfo"
        var GOOGLE_OAUTH2_AUTH_BASE_URL_: Any
        var GOOGLE_OAUTH2_TOKEN_URL_: Any
        var GOOGLE_OAUTH2_REVOKE_URL_: Any
        var GOOGLE_OAUTH2_FEDERATED_SIGNON_PEM_CERTS_URL_: Any
        var GOOGLE_OAUTH2_FEDERATED_SIGNON_JWK_CERTS_URL_: Any
        var GOOGLE_OAUTH2_IAP_PUBLIC_KEY_URL_: Any
        var CLOCK_SKEW_SECS_: Any
        var MAX_TOKEN_LIFETIME_SECS_: Any
        var ISSUERS_: Any
        fun getRevokeTokenUrl(token: String): String
    }
}
