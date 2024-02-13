package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*
import io.netty.handler.codec.DefaultHeaders
import kotlin.time.Duration

fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
            header(
            name = HttpHeaders.CacheControl,
            value ="365")
    }
}