package com.itis.examplekmp.feature.weather.data

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

internal class RemoteWeatherDataSource(
    private val httpClient: HttpClient,
) {

    suspend fun getWeather(query: String) {
        httpClient.get {
            parameter("q", query)
        }.body()
    }
}