package com.mfeldsztejn.kjs.express

import com.mfeldsztejn.kjs.express.internal.*
import com.mfeldsztejn.kjs.expressServeStaticCore.RequestHandler__0

fun Express.get(path: String, handler: RequestCallback) =
    get(path, handler.asHandler())

fun Express.post(path: String, handler: RequestCallback) =
    post(path, handler.asHandler())

fun Express.patch(path: String, handler: RequestCallback) =
    patch(path, handler.asHandler())

fun Express.delete(path: String, handler: RequestCallback) =
    delete(path, handler.asHandler())

fun Express.put(path: String, handler: RequestCallback) =
    put(path, handler.asHandler())

fun Router.get(path: String, handler: RequestCallback) =
    get(path, handler.asHandler())

fun Router.post(path: String, handler: RequestCallback) =
    post(path, handler.asHandler())

fun Router.patch(path: String, handler: RequestCallback) =
    patch(path, handler.asHandler())

fun Router.delete(path: String, handler: RequestCallback) =
    delete(path, handler.asHandler())

fun Router.put(path: String, handler: RequestCallback) =
    put(path, handler.asHandler())

fun Router.use(path: String, handler: RequestCallback) =
    use(path, handler)

typealias RequestCallback = (req: Request__0, res: Response__0, next: NextFunction) -> Unit

fun RequestCallback.asHandler() = unsafeCast<RequestHandler__0>()