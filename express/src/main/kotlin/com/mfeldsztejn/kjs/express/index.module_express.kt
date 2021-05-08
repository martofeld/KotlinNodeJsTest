@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS"
)

package com.mfeldsztejn.kjs.express

import com.mfeldsztejn.kjs.express.internal.Express
import com.mfeldsztejn.kjs.express.internal.Router
import kotlin.js.*

@JsModule("express")
external fun express(): Express

@JsModule("express")
external fun Router(): Router