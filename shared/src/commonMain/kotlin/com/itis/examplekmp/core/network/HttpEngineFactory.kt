package com.itis.examplekmp.core.network

import com.itis.examplekmp.core.config.Configuration
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.HttpClientEngineFactory

expect open class HttpEngineFactory() {

    fun createEngine(config: Configuration): HttpClientEngineFactory<HttpClientEngineConfig>
}