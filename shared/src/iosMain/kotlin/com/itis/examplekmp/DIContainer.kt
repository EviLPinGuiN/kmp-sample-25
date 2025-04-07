package com.itis.examplekmp

import kotlinx.cinterop.ObjCClass
import kotlinx.cinterop.ObjCObject
import kotlinx.cinterop.ObjCProtocol
import kotlinx.cinterop.getOriginalKotlinClass
import org.koin.core.component.KoinComponent
import org.koin.core.parameter.ParametersDefinition
import org.koin.core.qualifier.Qualifier

// Альтернативный спос
object DIContainer : KoinComponent {

    fun get(
        type: ObjCObject,
        qualifier: Qualifier? = null,
        parameters: ParametersDefinition? = null,
    ): Any? = getKoin().get(
        clazz = when (type) {
            is ObjCProtocol -> getOriginalKotlinClass(type)!!
            is ObjCClass -> getOriginalKotlinClass(type)!!
            else -> error("Cannot convert $type to KClass<*>")
        },
        qualifier = qualifier,
        parameters = parameters,
    )
}

// region Inject ios by koin docs
/*
class KoinHelper : KoinComponent {
    private val greeting : Greeting by inject()
    fun greet() : String = greeting.greet()
}

// swift
let greet = KoinHelper().greet()
*/
// endregion
