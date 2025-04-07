package com.itis.examplekmp.core.config

import com.itis.examplekmp.core.config.Configuration

actual class PlatformConfiguration(
    actual val appVersionName: String,
    actual val appVersionNumber: String,
    actual val osVersion: String,
    actual val deviceType: Configuration.DeviceType
)