package com.itis.examplekmp.core.settings

import com.itis.examplekmp.core.config.PlatformConfiguration
import com.russhwolf.settings.Settings

expect class SettingsFactory() {

    fun create(name: String, conf: PlatformConfiguration): Settings
}