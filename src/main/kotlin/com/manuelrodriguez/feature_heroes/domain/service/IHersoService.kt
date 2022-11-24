package com.manuelrodriguez.feature_heroes.domain.service

import com.manuelrodriguez.feature_heroes.domain.model.HeroDM


//Esta interfaz es la que se va a implementar en la capa de domain

interface IHersoService {
    suspend fun getAllHeroes(): List<HeroDM>
}