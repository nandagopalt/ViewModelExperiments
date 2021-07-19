package com.example.viewmodelexample2

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivityViewModelFactory(var number :Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)) MainActivityViewModel(number) as T
          else throw IllegalArgumentException("Unknown ViewModel Class")
    }
}