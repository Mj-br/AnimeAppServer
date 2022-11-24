package com.manuelrodriguez

import io.ktor.server.application.*
import com.manuelrodriguez.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.


// Como no lleva suspend es syncrono

fun Application.module() {

    //Insertamos el configure que acabamos de crear configureKoin()
    configureKoin()

    configureSockets()
    configureHTTP()
    configureSerialization()
    configureMonitoring()
    configureSecurity()
    configureRouting()
}
