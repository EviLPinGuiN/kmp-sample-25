package com.itis.examplekmp.core.qualifier

import org.koin.core.qualifier.named
import org.koin.dsl.module

object QualifierSettingName
object QualifierDBName

val qualifierModule = module {
    factory<String>(qualifier = named<QualifierSettingName>()) {
        "weather_settings"
    }
    factory<String>(qualifier = named<QualifierDBName>()) {
        "weather.db"
    }
}