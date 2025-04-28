package com.itis.examplekmp.feature.weather.data.repository

import com.itis.examplekmp.feature.weather.data.datasource.PersistentWeatherDataSource
import com.itis.examplekmp.feature.weather.data.datasource.RemoteWeatherDataSource
import com.itis.examplekmp.feature.weather.data.datasource.remote.mapToEntity
import com.itis.examplekmp.feature.weather.domain.model.CityWeather
import com.itis.examplekmp.feature.weather.domain.repository.WeatherRepository

internal class WeatherRepositoryImpl(
    private val remoteDataSource: RemoteWeatherDataSource,
    private val persistentDataSource: PersistentWeatherDataSource,
) : WeatherRepository {

    override suspend fun getWeather(city: String): CityWeather {
        return remoteDataSource.getWeather(query = city).mapToEntity()
    }
}