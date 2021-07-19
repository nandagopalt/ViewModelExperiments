package com.example.viewmodelexample1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = MutableLiveData<Int>()
    val countLiveData: LiveData<Int>
    get() = count

    init {
        count.value = 0
    }

    fun increaseCount() {
        count.value = count.value?.plus(1)
    }
}