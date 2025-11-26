package com.example.rickandmortyapp.presintation.viewmodel

import com.example.rickandmortyapp.domain.usescases.GetCharacterByIdUseCase
import com.example.rickandmortyapp.presintation.base.BaseViewModel
import com.example.rickandmortyapp.presintation.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class DetailCharacterViewModel(
    private val getCharacterByIdUseCase: GetCharacterByIdUseCase
) : BaseViewModel() {

    private val _characterState = MutableStateFlow<UiState<Character>>(UiState.Empty)
    val characterState = _characterState.asStateFlow()

    fun getCharacterById(id: Int) {
        getCharacterByIdUseCase(id).handleFlowData(_characterState)
    }
}