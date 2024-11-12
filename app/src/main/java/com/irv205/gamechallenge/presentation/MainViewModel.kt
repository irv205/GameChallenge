package com.irv205.gamechallenge.presentation

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.irv205.gamechallenge.core.util.ResponseHandler
import com.irv205.gamechallenge.domain.model.Game
import com.irv205.gamechallenge.domain.repository.GameRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: GameRepository
): ViewModel() {

    private val _list = mutableStateListOf<Game>()
    val list : SnapshotStateList<Game> get() = _list

    init {
        getGames()
    }

    private fun getGames() {
        viewModelScope.launch(Dispatchers.IO) {
            when(val result = repository.getGames()) {
                is ResponseHandler.Error -> {
                    Log.e("EXCEPTION", result.message)
                }
                is ResponseHandler.Success -> {
                    _list.addAll(result.data)
                    Log.e("FUNCIONA :D", result.data.toString())
                }
            }
        }
    }
}