package com.DaviVianna.harrypotter.data.model

import com.google.gson.annotations.SerializedName

data class PersonagemDto(
    @SerializedName("id") val id: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("house") val house: String?,
    @SerializedName("actor") val actor: String?,
    @SerializedName("image") val image: String?
)