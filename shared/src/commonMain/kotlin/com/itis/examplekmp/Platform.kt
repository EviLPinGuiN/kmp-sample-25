package com.itis.examplekmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform