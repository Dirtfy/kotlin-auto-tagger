package com.dirtfy.tagger

/**
 *
 * This interface gives TAG child.
 *
 * NOTICE: The function name in the tag might differ from what you expect because it is derived from the current thread's stack trace.
 *
 * Expected StackTrace: getStackTrace <- getTAG(parent) <- getTAG(child) <- (target function)
 *
 * @property TAG the tag for log
 *
 */
interface Tagger {

    val TAG: String
        get() {
            return this::class.simpleName + "." +
                    Thread.currentThread().stackTrace[3].methodName
        }

}