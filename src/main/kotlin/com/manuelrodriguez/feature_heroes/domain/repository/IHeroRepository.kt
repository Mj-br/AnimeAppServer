package com.manuelrodriguez.feature_heroes.domain.repository
import com.manuelrodriguez.feature_heroes.domain.model.HeroDM


//El dominio no puede acceder directamente a la capa de datos, por lo que me creo mi propio modelo de datos de tipo domain que sería el HeroDM

interface IHeroRepository {
    suspend fun getAllHeroes(): List<HeroDM>
}