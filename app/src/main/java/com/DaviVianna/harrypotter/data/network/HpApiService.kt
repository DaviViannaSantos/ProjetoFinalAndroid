package com.DaviVianna.harrypotter.data.network

import com.DaviVianna.harrypotter.data.model.PersonagemDto
import retrofit2.http.GET

interface HpApiService {
    @GET("characters")
    suspend fun listarPersonagens(): List<PersonagemDto>
}