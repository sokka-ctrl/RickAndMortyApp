package com.example.rickandmortyapp.presintation.viewmodel


import com.example.rickandmortyapp.domain.usescases.GetCharacterUseCase
import com.example.rickandmortyapp.presintation.base.BaseViewModel
import com.example.rickandmortyapp.presintation.utils.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


class CharacterViewModel(
    private val getCharacterUseCase: GetCharacterUseCase
): BaseViewModel() {

    private val _characterState = MutableStateFlow<UiState<List<Character>>>(UiState.Empty)
    val characterState = _characterState.asStateFlow()

    fun getCharacters() {
        getCharacterUseCase.getCharacters().handleFlowData(_characterState)

    }
}