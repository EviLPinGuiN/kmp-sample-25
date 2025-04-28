package com.itis.examplekmp.feature.weather.domain.repository

import com.itis.examplekmp.feature.weather.domain.model.CityWeather

interface WeatherRepository {

    suspend fun getWeather(city: String): CityWeather
}