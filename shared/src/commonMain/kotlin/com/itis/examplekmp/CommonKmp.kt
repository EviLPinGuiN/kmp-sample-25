package com.itis.examplekmp

import com.itis.examplekmp.config.Configuration
import com.itis.examplekmp.config.PlatformConfiguration
import com.itis.examplekmp.network.networkModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

object CommonKmp {

    fun initKoin(
        configuration: Configuration,
        koinDeclaration: KoinAppDeclaration = {},
    ) {
        startKoin {
            koinDeclaration()
            modules(
                createConfiguration(configuration),
                networkModule,
            )
        }
    }

    private fun createConfiguration(configuration: Configuration) = module {
        single<Configuration> { configuration }
        single<PlatformConfiguration> { configuration.platformConfiguration }
    }
}
