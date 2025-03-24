package com.itis.examplekmp

import kotlin.experimental.ExperimentalObjCName
import kotlin.native.ObjCName

sealed class MainAction {

    data object CloseScreen : MainAction()

    data class ShowMessage @OptIn(ExperimentalObjCName::class) constructor(
        val message: String,
        @ObjCName("desc")
        val description: String,
    ) : MainAction()
}

sealed interface MainAction2 {

    data object CloseScreen : MainAction2

    data class ShowMessage constructor(
        val message: String,
        val description: String,
    ) : MainAction2
}