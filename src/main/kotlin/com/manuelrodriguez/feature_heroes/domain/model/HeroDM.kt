package com.manuelrodriguez.feature_heroes.domain.model

//En el dominio es donde se crea toda la lógica de negocio



data class HeroDM(
    val id:Int,
    val name: String,
    //this will be a path of that image in the backend server
    val image: String,
    val about: String,
    //max value 5 min value 0
    val rating: Double,
    //random value from 0 to 100
    val power: Int,
    //month of born
    val month: String,
    val day: String,
    val family: List<String>,
    val abilities: List<String>,
    val natureTypes: List<String>
)
