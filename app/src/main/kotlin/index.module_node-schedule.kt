@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

import events.EventEmitter.EventEmitter
import kotlin.js.Date

typealias JobCallback = (fireDate: Date) -> Unit

external open class Job : EventEmitter {
    constructor(name: String, job: JobCallback = definedExternally, callback: () -> Unit = definedExternally)
    constructor(name: String)
    constructor(name: String, job: JobCallback = definedExternally)
    constructor(name: String, job: () -> Unit = definedExternally, callback: () -> Unit = definedExternally)
    constructor(name: String, job: () -> Unit = definedExternally)
    constructor(name: JobCallback, job: JobCallback = definedExternally, callback: () -> Unit = definedExternally)
    constructor(name: JobCallback)
    constructor(name: JobCallback, job: JobCallback = definedExternally)
    constructor(name: JobCallback, job: () -> Unit = definedExternally, callback: () -> Unit = definedExternally)
    constructor(name: JobCallback, job: () -> Unit = definedExternally)
    open var name: String
    open fun trackInvocation(invocation: Invocation): Boolean
    open fun stopTrackingInvocation(invocation: Invocation): Boolean
    open fun triggeredJobs(): Number
    open fun setTriggeredJobs(triggeredJobs: Number)
    open fun cancel(reschedule: Boolean = definedExternally): Boolean
    open fun cancelNext(reschedule: Boolean = definedExternally): Boolean
    open fun reschedule(spec: RecurrenceRule): Boolean
    open fun reschedule(spec: String): Boolean
    open fun reschedule(spec: Number): Boolean
    open fun nextInvocation(): Date
    open fun pendingInvocations(): Array<Invocation>
    open fun invoke()
    open fun runOnDate(date: Date)
    open fun schedule(date: Date): Boolean
    open fun schedule(date: String): Boolean
    open fun schedule(date: Number): Boolean
//    open override fun removeAllListeners(): events.global.NodeJS.EventEmitter /* EventEmitter | EventEmitter */
}

external open class Range(start: Number = definedExternally, end: Number = definedExternally, step: Number = definedExternally) {
    open fun contains(value: Number): Boolean
}

typealias Timezone = String

external open class RecurrenceRule {
    open var date: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var dayOfWeek: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var hour: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var minute: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var month: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var second: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var year: dynamic /* Number | Range | String | Array<dynamic /* Number | Range | String */> */
    open var tz: Timezone
    constructor(year: Number = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally, tz: Timezone = definedExternally)
    constructor()
    constructor(year: Number = definedExternally)
    constructor(year: Number = definedExternally, month: Any = definedExternally)
    constructor(year: Number = definedExternally, month: Any = definedExternally, date: Any = definedExternally)
    constructor(year: Number = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally)
    constructor(year: Number = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally)
    constructor(year: Number = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally)
    constructor(year: Number = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally, tz: Timezone = definedExternally)
    constructor(year: Range = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally, date: Any = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally)
    constructor(year: Range = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally, tz: Timezone = definedExternally)
    constructor(year: String = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally, date: Any = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally)
    constructor(year: String = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally, tz: Timezone = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally, date: Any = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally)
    constructor(year: Array<Any /* Number | Range | String */> = definedExternally, month: Any = definedExternally, date: Any = definedExternally, dayOfWeek: Any = definedExternally, hour: Any = definedExternally, minute: Any = definedExternally, second: Any = definedExternally)
    open fun nextInvocationDate(base: Date): Date
}

external interface RecurrenceSpecDateRange {
    var start: dynamic /* Date? | String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var end: dynamic /* Date? | String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var rule: String
    var tz: Timezone?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RecurrenceSpecObjLit {
    var date: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dayOfWeek: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var hour: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var minute: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var month: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var second: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var year: dynamic /* Number? | Range? | String? | Array<dynamic /* Number | Range | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var tz: Timezone?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Invocation(job: Job, fireDate: Date, recurrenceRule: RecurrenceRule) {
    open var fireDate: Date
    open var job: Job
    open var recurrenceRule: RecurrenceRule
    open var timerID: Number
}

external fun scheduleJob(name: String, rule: RecurrenceRule, callback: JobCallback): Job

external fun scheduleJob(name: String, rule: RecurrenceSpecDateRange, callback: JobCallback): Job

external fun scheduleJob(name: String, rule: RecurrenceSpecObjLit, callback: JobCallback): Job

external fun scheduleJob(name: String, rule: Date, callback: JobCallback): Job

external fun scheduleJob(name: String, rule: String, callback: JobCallback): Job

external fun scheduleJob(name: String, rule: Number, callback: JobCallback): Job

external fun scheduleJob(rule: RecurrenceRule, callback: JobCallback): Job

external fun scheduleJob(rule: RecurrenceSpecDateRange, callback: JobCallback): Job

external fun scheduleJob(rule: RecurrenceSpecObjLit, callback: JobCallback): Job

external fun scheduleJob(rule: Date, callback: JobCallback): Job

external fun scheduleJob(rule: String, callback: JobCallback): Job

external fun scheduleJob(rule: Number, callback: JobCallback): Job

external fun rescheduleJob(job: Job, spec: RecurrenceRule): Job

external fun rescheduleJob(job: Job, spec: RecurrenceSpecDateRange): Job

external fun rescheduleJob(job: Job, spec: RecurrenceSpecObjLit): Job

external fun rescheduleJob(job: Job, spec: Date): Job

external fun rescheduleJob(job: Job, spec: String): Job

external fun rescheduleJob(job: String, spec: RecurrenceRule): Job

external fun rescheduleJob(job: String, spec: RecurrenceSpecDateRange): Job

external fun rescheduleJob(job: String, spec: RecurrenceSpecObjLit): Job

external fun rescheduleJob(job: String, spec: Date): Job

external fun rescheduleJob(job: String, spec: String): Job

external object scheduledJobs {
    @nativeGetter
    operator fun get(jobName: String): Job?
    @nativeSetter
    operator fun set(jobName: String, value: Job)
}

external fun cancelJob(job: Job): Boolean

external fun cancelJob(job: String): Boolean
