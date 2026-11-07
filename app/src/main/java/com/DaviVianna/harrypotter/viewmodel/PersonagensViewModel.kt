package com.DaviVianna.harrypotter.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.DaviVianna.harrypotter.data.model.PersonagemDto
import com.DaviVianna.harrypotter.data.repository.HarryPotterRepository
import kotlinx.coroutines.launch

class PersonagensViewModel : ViewModel() {
    private val repository = HarryPotterRepository()

    private val _personagens = mutableStateOf<List<PersonagemDto>>(emptyList())
    val personagens: State<List<PersonagemDto>> = _personagens

    init {
        carregarPersonagens()
    }

    private fun carregarPersonagens() {
        viewModelScope.launch {
            _personagens.value = repository.getPersonagens()
        }
    }
}