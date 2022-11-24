package com.manuelrodriguez.plugins

import com.manuelrodriguez.di.appModule
import  io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun Application.configureKoin() {
    install(Koin){
        modules(appModule)
    }
}