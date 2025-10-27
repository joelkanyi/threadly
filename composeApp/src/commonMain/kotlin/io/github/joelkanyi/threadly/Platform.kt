package io.github.joelkanyi.threadly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform