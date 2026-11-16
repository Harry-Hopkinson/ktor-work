// Task 4.6.1: Pebble templates

import io.ktor.server.application.Application

fun Application.module() {
    configureSerialization()
    // invoke template configuration module here
    configureTemplates()
    configureRouting()
}

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}
