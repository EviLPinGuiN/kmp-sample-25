package com.itis.examplekmp.network

import com.itis.examplekmp.config.Configuration
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.HttpClientEngineFactory

expect open class HttpEngineFactory() {

    fun createEngine(config: Configuration): HttpClientEngineFactory<HttpClientEngineConfig>
}