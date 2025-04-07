package com.itis.examplekmp.core.settings

import com.itis.examplekmp.core.config.PlatformConfiguration
import com.russhwolf.settings.NSUserDefaultsSettings
import com.russhwolf.settings.Settings

actual class SettingsFactory {

    actual fun create(
        name: String,
        conf: PlatformConfiguration
    ): Settings = NSUserDefaultsSettings.Factory().create(name = name)
}