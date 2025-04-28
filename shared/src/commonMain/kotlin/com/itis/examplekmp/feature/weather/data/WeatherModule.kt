package com.itis.examplekmp.feature.weather.data

import com.itis.examplekmp.feature.weather.data.repository.WeatherRepositoryImpl
import com.itis.examplekmp.feature.weather.data.datasource.PersistentWeatherDataSource
import com.itis.examplekmp.feature.weather.data.datasource.RemoteWeatherDataSource
import com.itis.examplekmp.feature.weather.data.usecase.GetWeatherUseCaseImpl
import com.itis.examplekmp.feature.weather.domain.repository.WeatherRepository
import com.itis.examplekmp.feature.weather.domain.usecase.GetWeatherUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val weatherModule = module {
    factoryOf(::RemoteWeatherDataSource)
    factoryOf(::PersistentWeatherDataSource)

    factory<WeatherRepository> { WeatherRepositoryImpl(get(), get()) }
    factory<GetWeatherUseCase> { GetWeatherUseCaseImpl(get()) }
}