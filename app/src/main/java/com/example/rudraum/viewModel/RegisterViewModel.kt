package com.example.rudraum.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.rudraum.model.RegisterResponceModel
import com.example.rudraum.repositary.Repositary
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class RegisterViewModel(private val repositary: Repositary) :ViewModel() {

    init {
        GlobalScope.launch {
            repositary.getUser()
        }
    }

    val users :LiveData<RegisterResponceModel>
    get() = repositary.userData
}