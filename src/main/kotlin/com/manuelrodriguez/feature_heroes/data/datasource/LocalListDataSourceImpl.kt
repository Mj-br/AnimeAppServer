package com.manuelrodriguez.feature_heroes.data.datasource

import com.manuelrodriguez.feature_heroes.data.HeroList
import com.manuelrodriguez.feature_heroes.data.datasource.dto.HeroDto
import com.manuelrodriguez.feature_heroes.data.datasource.interfaces.ILocalListDatasource

//Esto es como accedemos a los datos desde la capa de datos que sería usando (implementando) la interfaz

class LocalListDataSourceImpl
    (
    private val localList : HeroList
    ) : ILocalListDatasource
        {
             override suspend fun getALLHeroes(): List<HeroDto>
             {
             return localList.listOfHeroes
             }
        }

