package com.manuelrodriguez.feature_heroes.presentation.mapper

import com.manuelrodriguez.feature_heroes.domain.model.HeroDM
import com.manuelrodriguez.feature_heroes.presentation.model.Hero


//Esta clase es la que se va a implementar en la capa de presentación
fun HeroDM.toHero() = Hero(
    // Esta id que viene de Hero será la de HeroDM
    id = this.id,
    name,
    image,
    about,
    rating,
    power,
    month,
    day,
    family,
    abilities,
    natureTypes
)