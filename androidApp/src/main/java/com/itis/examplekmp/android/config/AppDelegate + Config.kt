package com.itis.examplekmp.android.config

import android.content.res.Resources
import android.os.Build
import com.itis.examplekmp.CommonKmp
import com.itis.examplekmp.android.AppDelegate
import com.itis.examplekmp.android.BuildConfig
import com.itis.examplekmp.config.Configuration
import com.itis.examplekmp.config.PlatformConfiguration
import org.koin.android.ext.koin.androidContext

internal fun AppDelegate.initCommon() {
    val config = Configuration(
        platformConfiguration = PlatformConfiguration(
            androidContext = applicationContext,
            appVersionName = BuildConfig.VERSION_NAME,
            appVersionNumber = BuildConfig.VERSION_CODE.toString(),
            osVersion = Build.VERSION.RELEASE.toString(),
            deviceType = resources.deviceType
        ),
        isDebug = BuildConfig.DEBUG,
        isHttpLoggingEnabled = BuildConfig.DEBUG,
    )
    CommonKmp.initKoin(config)

    // ----------- or -----------

//    CommonKmp.initKoin(config) {
//        androidContext(applicationContext)
//    }
}

private val Resources.deviceType: Configuration.DeviceType
    get() = when {
        displayMetrics.widthPixels > 600.dp -> Configuration.DeviceType.Tablet
        else -> Configuration.DeviceType.Phone
    }

private inline val Int.dp: Int
    get() = (this * Resources.getSystem().displayMetrics.density).toInt()