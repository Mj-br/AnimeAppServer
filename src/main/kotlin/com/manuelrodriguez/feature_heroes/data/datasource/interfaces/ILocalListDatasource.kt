package com.manuelrodriguez.feature_heroes.data.datasource.interfaces

import com.manuelrodriguez.feature_heroes.data.datasource.dto.HeroDto

// Esta interfaz devuelve aquello que espero de la base de datos, en este caso una lista de Heroes de la capa de datos

interface ILocalListDatasource {
    suspend fun  getALLHeroes(): List<HeroDto>
}