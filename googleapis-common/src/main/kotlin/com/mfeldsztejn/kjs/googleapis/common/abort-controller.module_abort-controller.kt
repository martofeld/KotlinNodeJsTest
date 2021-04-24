@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.mfeldsztejn.kjs.googleapis.common

external interface Events {
    var abort: Any
}

external interface EventAttributes {
    var onabort: Any
}

external open class AbortSignal : EventTarget<Events, EventAttributes> {
    open var aborted: Boolean
}
