package com.DaviVianna.harrypotter.data.repository

import com.DaviVianna.harrypotter.data.model.PersonagemDto

class HarryPotterRepository {
    suspend fun getPersonagens(): List<PersonagemDto> {
        return listOf(
            PersonagemDto("1", "Harry Potter", "Grifinória", "Daniel Radcliffe", null),
            PersonagemDto("2", "Hermione Granger", "Grifinória", "Emma Watson", null),
            PersonagemDto("3", "Rony Weasley", "Grifinória", "Rupert Grint", null),
            PersonagemDto("4", "Draco Malfoy", "Sonserina", "Tom Felton", null),
            PersonagemDto("5", "Severus Snape", "Sonserina", "Alan Rickman", null),
            PersonagemDto("6", "Alvo Dumbledore", "Grifinória", "Michael Gambon", null),
            PersonagemDto("7", "Sirius Black", "Grifinória", "Gary Oldman", null),
            PersonagemDto("8", "Luna Lovegood", "Corvinal", "Evanna Lynch", null),
            PersonagemDto("9", "Neville Longbottom", "Grifinória", "Matthew Lewis", null),
            PersonagemDto("10", "Cedrico Diggory", "Lufa-Lufa", "Robert Pattinson", null)
        )
    }
}