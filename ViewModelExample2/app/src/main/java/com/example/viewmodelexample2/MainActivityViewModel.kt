package com.example.viewmodelexample2

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

private const val TAG = "MainActivityViewModel"
class MainActivityViewModel(number : Int) : ViewModel() {

    private var resultForAddition = MutableLiveData<Int>()
    val resultLiveData: LiveData<Int> get() = resultForAddition

    init {
        resultForAddition.value = number
    }

    fun addCount(number: Int?) {
        //number?.let { resultForAddition.value = number.plus(resultForAddition.value!) }
        resultForAddition.value = number?.let { resultForAddition.value?.plus(it) }
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "onCleared")
    }
}