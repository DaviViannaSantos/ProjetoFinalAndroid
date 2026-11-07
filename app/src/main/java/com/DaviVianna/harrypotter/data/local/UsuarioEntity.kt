package com.DaviVianna.harrypotter.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "usuarios")
data class UsuarioEntity(
    @PrimaryKey val email: String,
    val senhaHash: String
)

@Entity(tableName = "favoritos_hp")
data class FavoritoEntity(
    @PrimaryKey val characterId: String,
    val userEmail: String,
    val name: String,
    val house: String,
    val imageUrl: String
)