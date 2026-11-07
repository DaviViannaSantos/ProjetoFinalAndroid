package com.DaviVianna.harrypotter.userinterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.DaviVianna.harrypotter.viewmodel.PersonagensViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                PersonagensScreen()
            }
        }
    }
}

@Composable
fun PersonagensScreen(viewModel: PersonagensViewModel = viewModel()) {
    val personagens = viewModel.personagens.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Personagens de Harry Potter",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            modifier = Modifier.weight(1f), // Adiciona isto para preencher o espaço
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(personagens) { personagem ->
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = personagem.name ?: "Sem Nome", style = MaterialTheme.typography.titleLarge)
                        Text(text = "Casa: ${personagem.house ?: "Desconhecida"}")
                        Text(text = "Ator: ${personagem.actor ?: "Desconhecido"}")
                    }
                }
            }
        }
    }
}