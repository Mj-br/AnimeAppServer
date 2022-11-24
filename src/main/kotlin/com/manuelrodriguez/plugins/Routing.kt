package com.manuelrodriguez.plugins

import com.manuelrodriguez.feature_heroes.domain.service.IHersoService
import com.manuelrodriguez.feature_heroes.presentation.getAllHeroesRoute
import io.ktor.server.routing.*

import io.ktor.server.http.content.*
import io.ktor.server.application.*
import org.koin.ktor.ext.inject

fun Application.configureRouting() {
    
    val heroService:IHersoService by inject()


    routing {

        getAllHeroesRoute(heroService)


        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
