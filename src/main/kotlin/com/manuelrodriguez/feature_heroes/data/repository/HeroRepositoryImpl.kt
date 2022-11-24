package com.manuelrodriguez.feature_heroes.data.repository

import com.manuelrodriguez.feature_heroes.data.datasource.interfaces.ILocalListDatasource
import com.manuelrodriguez.feature_heroes.data.datasource.mapper.toHeroDM
import com.manuelrodriguez.feature_heroes.domain.model.HeroDM
import com.manuelrodriguez.feature_heroes.domain.repository.IHeroRepository


// clase que implementa la interfaz de la capa de datos
class HeroRepositoryImpl(
    private val localList: ILocalListDatasource
):IHeroRepository{
    override suspend fun getAllHeroes(): List<HeroDM> {
        return localList.getALLHeroes().map { heroDto ->
            heroDto.toHeroDM()
        }
    }
}
