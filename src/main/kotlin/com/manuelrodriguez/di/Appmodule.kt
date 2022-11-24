package com.manuelrodriguez.di

import com.manuelrodriguez.feature_heroes.data.HeroList
import com.manuelrodriguez.feature_heroes.data.datasource.LocalListDataSourceImpl
import com.manuelrodriguez.feature_heroes.data.datasource.interfaces.ILocalListDatasource
import com.manuelrodriguez.feature_heroes.data.repository.HeroRepositoryImpl
import com.manuelrodriguez.feature_heroes.domain.repository.IHeroRepository
import com.manuelrodriguez.feature_heroes.domain.service.HeroServiceImpl
import com.manuelrodriguez.feature_heroes.domain.service.IHersoService
import org.koin.dsl.module



val  appModule =  module {

    single<HeroList>{HeroList}


    // Se instancian estos objetos como single tone, un objeto en memoria
    single<ILocalListDatasource>{

        // Le pasamos a la implementación el get donde buscará el heroList en memoria
        LocalListDataSourceImpl(get ())

    }


    single<IHeroRepository>{

        // Le pasamos a la implementación el get, a esto se le llama inyectar datos
        HeroRepositoryImpl(get())

    }

    single<IHersoService>{
        HeroServiceImpl(get())
    }

}