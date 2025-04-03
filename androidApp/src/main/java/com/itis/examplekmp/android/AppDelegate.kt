package com.itis.examplekmp.android

import android.app.Application
import com.itis.examplekmp.android.config.initCommon

class AppDelegate : Application() {

    override fun onCreate() {
        super.onCreate()

        initCommon()
    }
}