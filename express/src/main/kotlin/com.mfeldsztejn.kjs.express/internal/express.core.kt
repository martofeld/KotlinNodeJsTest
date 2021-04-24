@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package com.mfeldsztejn.kjs.express.internal

import QueryString.IParseOptions
import QueryString.ParsedQs
import com.mfeldsztejn.kjs.expressServeStaticCore.ParamsDictionary
import com.mfeldsztejn.kjs.expressServeStaticCore.RequestHandler
import com.mfeldsztejn.kjs.expressServeStaticCore.Response__2
import kotlin.js.*
import com.mfeldsztejn.kjs.servestatic.*
import tsstdlib.Record

external var json: Any

external var raw: Any

external var text: Any

external var application: Application

external var request: Request__0

external var response: Response__0

external var static: RequestHandlerConstructor<Response__0>

external var urlencoded: Any

external fun query(options: IParseOptions): Handler

external fun query(options: Any): Handler

external fun Router(options: RouterOptions = definedExternally): com.mfeldsztejn.kjs.expressServeStaticCore.Router

external interface RouterOptions {
    var caseSensitive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var mergeParams: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var strict: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Application : com.mfeldsztejn.kjs.expressServeStaticCore.Application

external interface CookieOptions : com.mfeldsztejn.kjs.expressServeStaticCore.CookieOptions

external interface Errback {
    @nativeInvoke
    operator fun invoke(err: Error)
}

external interface ErrorRequestHandler<P, ResBody, ReqBody, ReqQuery, Locals : Any> {
    @nativeInvoke
    operator fun <P, ResBody, ReqBody, ReqQuery, Locals : Any> invoke(
        err: Any,
        req: Request<P, ResBody, ReqBody, ReqQuery, Locals>,
        res: Response__2<ResBody, Locals>,
        next: NextFunction
    )
}

external interface Express : com.mfeldsztejn.kjs.expressServeStaticCore.Express

external interface Handler : com.mfeldsztejn.kjs.expressServeStaticCore.Handler

external interface IRoute : com.mfeldsztejn.kjs.expressServeStaticCore.IRoute

external interface IRouter : com.mfeldsztejn.kjs.expressServeStaticCore.IRouter

external interface IRouterHandler<T> : com.mfeldsztejn.kjs.expressServeStaticCore.IRouterHandler<T>

external interface IRouterMatcher<T> : com.mfeldsztejn.kjs.expressServeStaticCore.IRouterMatcher__1<T>

external interface MediaType : com.mfeldsztejn.kjs.expressServeStaticCore.MediaType

external interface NextFunction : com.mfeldsztejn.kjs.expressServeStaticCore.NextFunction

external interface Request<P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> :
    com.mfeldsztejn.kjs.expressServeStaticCore.Request<P, ResBody, ReqBody, ReqQuery, Locals>

external interface Request__0 :
    Request<ParamsDictionary, Any, ParamsDictionary, com.mfeldsztejn.kjs.expressServeStaticCore.Query, Record<String, Any>>

external interface RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals : Record<String, Any>> :
    RequestHandler<P, ResBody, ReqBody, ReqQuery, Locals>

external interface RequestParamHandler {
    @nativeInvoke
    operator fun invoke(req: Request__0, res: Response__0, next: NextFunction, value: Any, name: String): Any
}

external interface Response<ResBody, Locals : Record<String, Any>> : Response__2<ResBody, Locals>

external interface Response__0 : Response<Any, Record<String, Any>>

external interface RequestHandler__0 : com.mfeldsztejn.kjs.expressServeStaticCore.RequestHandler__0

external interface Router : com.mfeldsztejn.kjs.expressServeStaticCore.Router

external interface Send {
    @nativeInvoke
    operator fun <ResBody, T> invoke(body: ResBody = definedExternally): T
}