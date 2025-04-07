package com.itis.examplekmp.core.database

import app.cash.sqldelight.db.SqlDriver
import com.itis.examplekmp.core.config.PlatformConfiguration

expect class DriverFactory() {

    fun createDriver(
        name: String,
        platformConfiguration: PlatformConfiguration,
    ): SqlDriver
}
