package com.itis.examplekmp.core.database

import app.cash.sqldelight.db.SqlDriver
import com.itis.examplekmp.Database
import com.itis.examplekmp.core.qualifier.QualifierDBName
import com.itis.examplekmp.core.qualifier.QualifierSettingName
import com.itis.examplekmp.core.settings.SettingsFactory
import com.russhwolf.settings.Settings
import org.koin.core.qualifier.named
import org.koin.dsl.module

val storageModule = module {
    single<SqlDriver> {
        DriverFactory().createDriver(
            name = get(named<QualifierDBName>()),
            platformConfiguration = get(),
        )
    }
    single<Database> {
        Database(driver = get())
    }
    single<Settings> {
        SettingsFactory().create(name = get(named<QualifierSettingName>()), get())
    }
}
