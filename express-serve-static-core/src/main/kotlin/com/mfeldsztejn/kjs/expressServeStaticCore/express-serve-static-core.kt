@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.expressServeStaticCore

import QueryString.ParsedQs
import com.mfeldsztejn.kjs.expressServeStaticCore.internal.Application as InternalApplication
import com.mfeldsztejn.kjs.expressServeStaticCore.internal.Request as InternalRequest
import com.mfeldsztejn.kjs.expressServeStaticCore.internal.Response as InternalResponse
import events.EventEmitter.EventEmitter
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
import tsstdlib.Record

typealias Query = ParsedQs

external interface NextFunction {
    @nativeInvoke
    operator fun invoke(err: Any = definedExternally)
    @nativeInvoke
    operator fun invoke()
    @nativeInvoke
    operator fun invoke(deferToNext: String /* "router" | "route" */)
}

external interface Dictionary<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T)
}

external interface ParamsDictionary {
    @nativeGetter
    operator fun get(key: String): String?
    @nativeSetter
    operator fun set(key: String, value: String)
}

typealias ParamsArray = Array<String>

external interface RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> {
    @nativeInvoke
    operator fun invoke(req: Request<P, ResBody, ReqBody, ReqQuery, Locals>, res: Response__2<ResBody, Locals>, next: NextFunction)
}

external interface RequestHandler__1<P> : RequestHandler<P, Any, Any, ParsedQs, Record<String, Any>>

external interface RequestHandler__0 : RequestHandler<ParamsDictionary, Any, Any, ParsedQs, Record<String, Any>>

typealias ErrorRequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> = (err: Any, req: Request<P, ResBody, ReqBody, ReqQuery, Locals>, res: Response__2<ResBody, Locals>, next: NextFunction) -> Unit

external interface IRouterMatcher<T, Method: String> {
    @nativeInvoke
    operator fun <P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> invoke(path: String, vararg handlers: RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals>): T
    @nativeInvoke
    operator fun <P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> invoke(path: RegExp, vararg handlers: RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals>): T
    @nativeInvoke
    operator fun <P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> invoke(path: Array<Any /* String | RegExp */>, vararg handlers: RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals>): T
    @nativeInvoke
    operator fun invoke(path: String, vararg handlers: Any /* RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | ErrorRequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | Array<dynamic /* RequestHandler__1<P> | ErrorRequestHandler<P> */> */): T
    @nativeInvoke
    operator fun invoke(path: RegExp, vararg handlers: Any /* RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | ErrorRequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | Array<dynamic /* RequestHandler__1<P> | ErrorRequestHandler<P> */> */): T
    @nativeInvoke
    operator fun invoke(path: Array<Any /* String | RegExp */>, vararg handlers: Any /* RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | ErrorRequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | Array<dynamic /* RequestHandler__1<P> | ErrorRequestHandler<P> */> */): T
    @nativeInvoke
    operator fun invoke(path: String, subApplication: Application): T
    @nativeInvoke
    operator fun invoke(path: RegExp, subApplication: Application): T
    @nativeInvoke
    operator fun invoke(path: Array<Any /* String | RegExp */>, subApplication: Application): T
}

external interface IRouterMatcher__1<T> : IRouterMatcher<T, String>

external interface IRouterHandler<T> {
    @nativeInvoke
    operator fun invoke(vararg handlers: RequestHandler__0): T
    @nativeInvoke
    operator fun invoke(vararg handlers: Any /* RequestHandler<ParamsDictionary, any, any, ParsedQs, Record<string, any>> | ErrorRequestHandler<ParamsDictionary, any, any, ParsedQs, Record<string, any>> | Array<dynamic /* RequestHandler__1<ParamsDictionary> | ErrorRequestHandler<ParamsDictionary> */> | RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | ErrorRequestHandler<P, ResBody, ReqBody, ReqQuery, Locals> | Array<dynamic /* RequestHandler__1<P> | ErrorRequestHandler<P> */> */): dynamic
    @nativeInvoke
    operator fun <P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> invoke(vararg handlers: RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals>): T
}

external interface IRouter : RequestHandler__0 {
    @nativeGetter
    operator fun get(key: String): IRouterMatcher__1<IRouter /* this */>?
    @nativeSetter
    operator fun set(key: String, value: IRouterMatcher__1<IRouter /* this */>)
    fun param(name: String, handler: RequestParamHandler): IRouter /* this */
    fun param(callback: (name: String, matcher: RegExp) -> RequestParamHandler): IRouter /* this */
    var all: IRouterMatcher<IRouter /* this */, String /* "all" */>
    var get: IRouterMatcher<IRouter /* this */, String /* "get" */>
    var post: IRouterMatcher<IRouter /* this */, String /* "post" */>
    var put: IRouterMatcher<IRouter /* this */, String /* "put" */>
    var delete: IRouterMatcher<IRouter /* this */, String /* "delete" */>
    var patch: IRouterMatcher<IRouter /* this */, String /* "patch" */>
    var options: IRouterMatcher<IRouter /* this */, String /* "options" */>
    var head: IRouterMatcher<IRouter /* this */, String /* "head" */>
    var checkout: IRouterMatcher__1<IRouter /* this */>
    var connect: IRouterMatcher__1<IRouter /* this */>
    var copy: IRouterMatcher__1<IRouter /* this */>
    var lock: IRouterMatcher__1<IRouter /* this */>
    var merge: IRouterMatcher__1<IRouter /* this */>
    var mkactivity: IRouterMatcher__1<IRouter /* this */>
    var mkcol: IRouterMatcher__1<IRouter /* this */>
    var move: IRouterMatcher__1<IRouter /* this */>
    var notify: IRouterMatcher__1<IRouter /* this */>
    var propfind: IRouterMatcher__1<IRouter /* this */>
    var proppatch: IRouterMatcher__1<IRouter /* this */>
    var purge: IRouterMatcher__1<IRouter /* this */>
    var report: IRouterMatcher__1<IRouter /* this */>
    var search: IRouterMatcher__1<IRouter /* this */>
    var subscribe: IRouterMatcher__1<IRouter /* this */>
    var trace: IRouterMatcher__1<IRouter /* this */>
    var unlock: IRouterMatcher__1<IRouter /* this */>
    var unsubscribe: IRouterMatcher__1<IRouter /* this */>
    var use: IRouterHandler<IRouter /* this */> /* IRouterHandler<IRouter /* this */> & IRouterMatcher__1<IRouter /* this */> */
    fun route(prefix: String): IRoute
    fun route(prefix: RegExp): IRoute
    fun route(prefix: Array<Any /* String | RegExp */>): IRoute
    var stack: Array<Any>
}

external interface IRoute {
    @nativeGetter
    operator fun get(key: String): IRouterHandler<IRoute /* this */>?
    @nativeSetter
    operator fun set(key: String, value: IRouterHandler<IRoute /* this */>)
    var path: String
    var stack: Any
    var all: IRouterHandler<IRoute /* this */>
    var get: IRouterHandler<IRoute /* this */>
    var post: IRouterHandler<IRoute /* this */>
    var put: IRouterHandler<IRoute /* this */>
    var delete: IRouterHandler<IRoute /* this */>
    var patch: IRouterHandler<IRoute /* this */>
    var options: IRouterHandler<IRoute /* this */>
    var head: IRouterHandler<IRoute /* this */>
    var checkout: IRouterHandler<IRoute /* this */>
    var copy: IRouterHandler<IRoute /* this */>
    var lock: IRouterHandler<IRoute /* this */>
    var merge: IRouterHandler<IRoute /* this */>
    var mkactivity: IRouterHandler<IRoute /* this */>
    var mkcol: IRouterHandler<IRoute /* this */>
    var move: IRouterHandler<IRoute /* this */>
    var notify: IRouterHandler<IRoute /* this */>
    var purge: IRouterHandler<IRoute /* this */>
    var report: IRouterHandler<IRoute /* this */>
    var search: IRouterHandler<IRoute /* this */>
    var subscribe: IRouterHandler<IRoute /* this */>
    var trace: IRouterHandler<IRoute /* this */>
    var unlock: IRouterHandler<IRoute /* this */>
    var unsubscribe: IRouterHandler<IRoute /* this */>
}

external interface Router : IRouter

external interface CookieOptions {
    var maxAge: Number?
        get() = definedExternally
        set(value) = definedExternally
    var signed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var expires: Date?
        get() = definedExternally
        set(value) = definedExternally
    var httpOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var path: String?
        get() = definedExternally
        set(value) = definedExternally
    var domain: String?
        get() = definedExternally
        set(value) = definedExternally
    var secure: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var encode: ((param_val: String) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var sameSite: dynamic /* Boolean? | "lax" | "strict" | "none" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ByteRange {
    var start: Number
    var end: Number
}

external interface RequestRanges

typealias Errback = (err: Error) -> Unit

external interface Request<P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> : http.IncomingMessage, InternalRequest {
    fun get(name: String /* "set-cookie" */): dynamic /* Array | String */
    fun header(name: String /* "set-cookie" */): dynamic /* Array | String */
    fun accepts(): Array<String>
    fun accepts(type: String): dynamic /* String | Boolean */
    fun accepts(type: Array<String>): dynamic /* String | Boolean */
    fun acceptsCharsets(): Array<String>
    fun acceptsCharsets(charset: String): dynamic /* String | Boolean */
    fun acceptsCharsets(charset: Array<String>): dynamic /* String | Boolean */
    fun acceptsEncodings(): Array<String>
    fun acceptsEncodings(encoding: String): dynamic /* String | Boolean */
    fun acceptsEncodings(encoding: Array<String>): dynamic /* String | Boolean */
    fun acceptsLanguages(): Array<String>
    fun acceptsLanguages(lang: String): dynamic /* String | Boolean */
    fun acceptsLanguages(lang: Array<String>): dynamic /* String | Boolean */
    fun range(size: Number, options: RangeParser.Options = definedExternally): dynamic /* RangeParserRanges? | RangeParserResult? */
    var accepted: Array<MediaType>
    fun param(name: String, defaultValue: Any = definedExternally): String
    fun `is`(type: String): dynamic /* String? | Boolean? */
    fun `is`(type: Array<String>): dynamic /* String? | Boolean? */
    var protocol: String
    var secure: Boolean
    var ip: String
    var ips: Array<String>
    var subdomains: Array<String>
    var path: String
    var hostname: String
    var host: String
    var fresh: Boolean
    var stale: Boolean
    var xhr: Boolean
    var body: ReqBody
    var cookies: Any
    override var method: String
    var params: P
    var query: ReqQuery
    var route: Any
    var signedCookies: Any
    var originalUrl: String
    override var url: String
    var baseUrl: String
    var app: Application
    var res: Response__2<ResBody, Locals>?
        get() = definedExternally
        set(value) = definedExternally
    var next: NextFunction?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Request__0 : Request<ParamsDictionary, Any, Any, ParsedQs, Record<String, Any>>

external interface MediaType {
    var value: String
    var quality: Number
    var type: String
    var subtype: String
}

typealias Send<ResBody, T> = (body: ResBody) -> T

external interface Response<ResBody, Locals : Record<String, Any>, StatusCode : Number> : http.ServerResponse, InternalResponse {
    fun status(code: StatusCode): Response<ResBody, Locals, StatusCode> /* this */
    fun sendStatus(code: StatusCode): Response<ResBody, Locals, StatusCode> /* this */
    fun links(links: Any): Response<ResBody, Locals, StatusCode> /* this */
    var send: Send<ResBody, Response<ResBody, Locals, StatusCode> /* this */>
    var json: Send<ResBody, Response<ResBody, Locals, StatusCode> /* this */>
    var jsonp: Send<ResBody, Response<ResBody, Locals, StatusCode> /* this */>
    fun sendFile(path: String, fn: Errback = definedExternally)
    fun sendFile(path: String)
    fun sendFile(path: String, options: Any, fn: Errback = definedExternally)
    fun sendFile(path: String, options: Any)
    fun sendfile(path: String)
    fun sendfile(path: String, options: Any)
    fun sendfile(path: String, fn: Errback)
    fun sendfile(path: String, options: Any, fn: Errback)
    fun download(path: String, fn: Errback = definedExternally)
    fun download(path: String)
    fun download(path: String, filename: String, fn: Errback = definedExternally)
    fun download(path: String, filename: String)
    fun download(path: String, filename: String, options: Any, fn: Errback = definedExternally)
    fun download(path: String, filename: String, options: Any)
    fun contentType(type: String): Response<ResBody, Locals, StatusCode> /* this */
    fun type(type: String): Response<ResBody, Locals, StatusCode> /* this */
    fun format(obj: Any): Response<ResBody, Locals, StatusCode> /* this */
    fun attachment(filename: String = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    fun set(field: Any): Response<ResBody, Locals, StatusCode> /* this */
    fun set(field: String, value: String = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    fun set(field: String): Response<ResBody, Locals, StatusCode> /* this */
    fun set(field: String, value: Array<String> = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    fun header(field: Any): Response<ResBody, Locals, StatusCode> /* this */
    fun header(field: String, value: String = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    fun header(field: String): Response<ResBody, Locals, StatusCode> /* this */
    fun header(field: String, value: Array<String> = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    override var headersSent: Boolean
    fun get(field: String): String
    fun clearCookie(name: String, options: Any = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    fun cookie(name: String, param_val: String, options: CookieOptions): Response<ResBody, Locals, StatusCode> /* this */
    fun cookie(name: String, param_val: Any, options: CookieOptions): Response<ResBody, Locals, StatusCode> /* this */
    fun cookie(name: String, param_val: Any): Response<ResBody, Locals, StatusCode> /* this */
    fun location(url: String): Response<ResBody, Locals, StatusCode> /* this */
    fun redirect(url: String)
    fun redirect(status: Number, url: String)
    fun redirect(url: String, status: Number)
    fun render(view: String, options: Any? = definedExternally, callback: (err: Error, html: String) -> Unit = definedExternally)
    fun render(view: String)
    fun render(view: String, options: Any? = definedExternally)
    fun render(view: String, callback: (err: Error, html: String) -> Unit = definedExternally)
    var locals: Locals
    var charset: String
    fun vary(field: String): Response<ResBody, Locals, StatusCode> /* this */
    var app: Application
    fun append(field: String, value: Array<String> = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    fun append(field: String): Response<ResBody, Locals, StatusCode> /* this */
    fun append(field: String, value: String = definedExternally): Response<ResBody, Locals, StatusCode> /* this */
    var req: Request__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Response__2<ResBody, Locals : Record<String, Any>> : Response<ResBody, Locals, Number>

external interface Response__0 : Response<Any, Record<String, Any>, Number>

external interface Handler : RequestHandler__0

typealias RequestParamHandler = (req: Request__0, res: Response__0, next: NextFunction, value: Any, name: String) -> Any

external interface Application : EventEmitter, IRouter, InternalApplication {
    @nativeInvoke
    operator fun invoke(req: Request__0, res: Response__0): Any
    @nativeInvoke
    operator fun invoke(req: Request__0, res: http.ServerResponse): Any
    @nativeInvoke
    operator fun invoke(req: http.IncomingMessage, res: Response__0): Any
    @nativeInvoke
    operator fun invoke(req: http.IncomingMessage, res: http.ServerResponse): Any
    fun init()
    fun defaultConfiguration()
    fun engine(ext: String, fn: (path: String, options: Any?, callback: (e: Any, rendered: String) -> Unit) -> Unit): Application /* this */
    fun set(setting: String, param_val: Any): Application /* this */
    override fun param(name: String, handler: RequestParamHandler): Application /* this */
    fun param(name: Array<String>, handler: RequestParamHandler): Application /* this */
    override fun param(callback: (name: String, matcher: RegExp) -> RequestParamHandler): Application /* this */
    fun path(): String
    fun enabled(setting: String): Boolean
    fun disabled(setting: String): Boolean
    fun enable(setting: String): Application /* this */
    fun disable(setting: String): Application /* this */
    fun render(name: String, options: Any? = definedExternally, callback: (err: Error, html: String) -> Unit = definedExternally)
    fun render(name: String)
    fun render(name: String, options: Any? = definedExternally)
    fun render(name: String, callback: (err: Error, html: String) -> Unit)
    fun listen(port: Number, hostname: String, backlog: Number, callback: () -> Unit = definedExternally): http.Server
    fun listen(port: Number, hostname: String, backlog: Number): http.Server
    fun listen(port: Number, hostname: String, callback: () -> Unit = definedExternally): http.Server
    fun listen(port: Number, hostname: String): http.Server
    fun listen(port: Number, callback: () -> Unit = definedExternally): http.Server
    fun listen(port: Number): http.Server
    fun listen(callback: () -> Unit = definedExternally): http.Server
    fun listen(): http.Server
    fun listen(path: String, callback: () -> Unit = definedExternally): http.Server
    fun listen(path: String): http.Server
    fun listen(handle: Any, listeningListener: () -> Unit = definedExternally): http.Server
    fun listen(handle: Any): http.Server
    var router: String
    var settings: Any
    var resource: Any
    var map: Any
    var locals: Record<String, Any>
    var routes: Any
    var _router: Any
    override var use: IRouterHandler<IRouter> /* IRouterHandler<Application> & IRouterMatcher__1<Application> & (handlers: dynamic /* RequestHandler<ParamsDictionary, any, any, ParsedQs, Record<string, any>> | ErrorRequestHandler<ParamsDictionary, any, any, ParsedQs, Record<string, any>> | Array<dynamic /* RequestHandler__1<ParamsDictionary> | ErrorRequestHandler<ParamsDictionary> */> */) -> Application */
    var on: (event: String, callback: (parent: Application) -> Unit) -> Application
    var mountpath: dynamic /* String | Array<String> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Express : Application {
    var request: Request__0
    var response: Response__0
}