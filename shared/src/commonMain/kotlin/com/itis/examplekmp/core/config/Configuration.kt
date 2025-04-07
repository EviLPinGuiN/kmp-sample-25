package com.itis.examplekmp.core.config

data class Configuration(
    val platformConfiguration: PlatformConfiguration,
    val isHttpLoggingEnabled: Boolean,
    val isDebug: Boolean,
) {

    enum class DeviceType {
        Tablet,
        Phone,
    }
}
