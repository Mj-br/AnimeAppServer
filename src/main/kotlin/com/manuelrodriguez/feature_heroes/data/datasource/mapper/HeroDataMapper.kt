package com.manuelrodriguez.feature_heroes.data.datasource.mapper

import com.manuelrodriguez.feature_heroes.data.datasource.dto.HeroDto
import com.manuelrodriguez.feature_heroes.domain.model.HeroDM


// Funcion que mapea los datos de la capa de datos a la capa del domain

fun HeroDto.toHeroDM(): HeroDM {
    return HeroDM(

        //Esta id iguala la id de la capa de datos con la capa de domain
        id =this.id,
        name,
        image,
        about,
        rating, power, month, day, family, abilities, natureTypes
    )
}