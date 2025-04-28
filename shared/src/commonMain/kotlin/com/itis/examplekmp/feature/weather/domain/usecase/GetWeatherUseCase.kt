package com.itis.examplekmp.feature.weather.domain.usecase

import com.itis.examplekmp.feature.weather.domain.model.CityWeather

interface GetWeatherUseCase {

    suspend operator fun invoke(city: String): CityWeather
}
