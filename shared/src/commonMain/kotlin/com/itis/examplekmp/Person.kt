package com.itis.examplekmp

import kotlin.experimental.ExperimentalObjCName
import kotlin.experimental.ExperimentalObjCRefinement
import kotlin.native.HiddenFromObjC
import kotlin.native.ObjCName

@OptIn(ExperimentalObjCName::class)
class Person(
    name: String,
    age: Int? = null,
    @ObjCName("ofEmail")
    email: String = "test@test.ru",
) {

    constructor(name: String) : this(
        name,
        null,
        "test@test.ru"
    )

    fun test(action: MainAction) {
        println()

        when (action) {
            MainAction.CloseScreen -> TODO()
            is MainAction.ShowMessage -> TODO()
        }
    }

    @OptIn(ExperimentalObjCRefinement::class)
    @HiddenFromObjC
    fun test2() {
        println()
    }
}