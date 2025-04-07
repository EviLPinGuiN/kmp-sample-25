package com.itis.examplekmp

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import com.itis.examplekmp.core.qualifier.QualifierDBName
import com.itis.examplekmp.core.qualifier.QualifierSettingName
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings
import org.koin.core.module.Module
import org.koin.core.qualifier.named
import org.koin.dsl.module

internal actual fun platformModule(): Module = module {
    single<SqlDriver> {
        AndroidSqliteDriver(
            context = get(),
            name = get(named<QualifierDBName>()),
            schema = Database.Schema,
        )
    }
    single<Settings> {
        val name = get<String>(named<QualifierSettingName>())
        SharedPreferencesSettings(
            delegate = get<Context>().getSharedPreferences(name, Context.MODE_PRIVATE)
        )
    }
}
