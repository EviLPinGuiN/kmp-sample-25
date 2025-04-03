package com.itis.examplekmp.network

import com.itis.examplekmp.config.Configuration
import io.ktor.client.engine.HttpClientEngineConfig
import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.darwin.Darwin

actual open class HttpEngineFactory actual constructor() {

    actual fun createEngine(config: Configuration): HttpClientEngineFactory<HttpClientEngineConfig> {
        return Darwin
    }
}