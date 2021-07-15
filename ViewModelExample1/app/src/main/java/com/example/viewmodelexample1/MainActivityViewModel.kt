package com.example.viewmodelexample1

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count: Int = 0

    fun getStartCount(): Int {
        return count
    }

    fun increaseCount(): Int {
        return ++count
    }

}