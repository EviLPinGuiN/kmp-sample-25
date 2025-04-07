package com.itis.examplekmp.core.settings

import android.content.Context
import com.itis.examplekmp.core.config.PlatformConfiguration
import com.russhwolf.settings.Settings
import com.russhwolf.settings.SharedPreferencesSettings

actual class SettingsFactory {

    actual fun create(
        name: String,
        conf: PlatformConfiguration
    ): Settings = SharedPreferencesSettings(
        delegate = conf.androidContext.getSharedPreferences(name, Context.MODE_PRIVATE)
    )
}
