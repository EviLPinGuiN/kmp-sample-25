package com.itis.examplekmp.core.database

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import com.itis.examplekmp.Database
import com.itis.examplekmp.core.config.PlatformConfiguration

actual class DriverFactory actual constructor() {
    actual fun createDriver(
        name: String,
        platformConfiguration: PlatformConfiguration
    ): SqlDriver = NativeSqliteDriver(
        schema = Database.Schema,
        name = name
    )
}