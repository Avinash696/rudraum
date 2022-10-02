package com.example.rudraum.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.rudraum.repositary.Repositary

class RegisterViewModelFactory(private val repositary: Repositary):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RegisterViewModel(repositary) as T
    }
}