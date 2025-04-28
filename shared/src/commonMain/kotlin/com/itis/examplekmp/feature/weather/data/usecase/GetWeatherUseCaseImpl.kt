package com.itis.examplekmp.feature.weather.data.usecase

import com.itis.examplekmp.feature.weather.domain.model.CityWeather
import com.itis.examplekmp.feature.weather.domain.repository.WeatherRepository
import com.itis.examplekmp.feature.weather.domain.usecase.GetWeatherUseCase

internal class GetWeatherUseCaseImpl(
    private val weatherRepository: WeatherRepository
) : GetWeatherUseCase {

    override suspend fun invoke(city: String): CityWeather {
        return weatherRepository.getWeather(city)
    }
}