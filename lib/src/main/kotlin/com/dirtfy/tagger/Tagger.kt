package com.dirtfy.tagger

/**
 * This is an auto tagger interface. It has TAG as property
 */
interface Tagger {

    /**
     * NOTICE: The function name in the tag might differ from what you expect because it is derived from the current thread's stack trace.
     */
    val TAG: String
        get() {
            return this::class.simpleName + "." +
                    Thread.currentThread().stackTrace[3].methodName
        }

}