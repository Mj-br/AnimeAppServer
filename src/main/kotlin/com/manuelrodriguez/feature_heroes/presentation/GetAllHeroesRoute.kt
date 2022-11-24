package com.manuelrodriguez.feature_heroes.presentation

import com.manuelrodriguez.feature_heroes.domain.service.IHersoService
import com.manuelrodriguez.feature_heroes.presentation.mapper.toHero
import com.manuelrodriguez.feature_heroes.presentation.util.Presentation.Consts.GET_ALL_HEROES
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

//Esta funcion coge la ruta y la implementa en la capa de presentación

fun Route.getAllHeroesRoute(
    //Para  que pida de la capa de peticion
    heroService: IHersoService
) {
    // Le pasamos el end point
    get(GET_ALL_HEROES){



        //Recibe una lista de heroes de una capa de dominio y la mapea a la capa de presentación
        heroService.getAllHeroes().map{
                it.toHero()

            //El also es que se hará algo con el resultado de la llamada
            //Y entonces también hazme lo siguiente con lo obtenido, con esa lista
        }.also{heroList ->


        if (heroList.isEmpty()) {
                call.respond(
                    status = HttpStatusCode.OK,

                    //Unit manda una lista de nada
                    message = emptyList<Unit>()
                )
            return@get
        }

            //Si no está vacía la lista, entonces manda la lista de heroes
            call.respond(
                status = HttpStatusCode.OK,
                message = heroList
            )
        }
    }
}