package com.manuelrodriguez.feature_heroes.domain.service

import com.manuelrodriguez.feature_heroes.domain.repository.IHeroRepository

//Le pasamos la interface a esta clase y extendemos de la interfaz que hemos creado en la capa de domain

class HeroServiceImpl(
    private val repository: IHeroRepository
    ): IHersoService {
        override suspend fun getAllHeroes() = repository.getAllHeroes()
    }