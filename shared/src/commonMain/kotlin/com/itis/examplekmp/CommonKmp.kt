package com.itis.examplekmp

import com.itis.examplekmp.core.config.Configuration
import com.itis.examplekmp.core.config.PlatformConfiguration
import com.itis.examplekmp.core.network.networkModule
import com.itis.examplekmp.core.qualifier.qualifierModule
import com.itis.examplekmp.feature.weather.data.PersistentWeatherDataSource
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

object CommonKmp {

    fun initKoin(
        configuration: Configuration,
        appDeclaration: KoinAppDeclaration = {},
    ) {
        startKoin {
            appDeclaration()
            modules(
                createConfiguration(configuration),
                networkModule,
                qualifierModule,

                // 2 варианта
//                storageModule,
                platformModule(),
            )
        }
    }

    private fun createConfiguration(configuration: Configuration) = module {
        single<Configuration> { configuration }
        single<PlatformConfiguration> { configuration.platformConfiguration }

        single<Database> {
            Database(get())
        }

        factory {
            PersistentWeatherDataSource(get(), get())
        }
    }
}
