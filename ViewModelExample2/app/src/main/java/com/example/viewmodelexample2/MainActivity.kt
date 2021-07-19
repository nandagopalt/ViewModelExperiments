package com.example.viewmodelexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        viewModel.resultLiveData.observe(this, {
              binding.numberTextView.text = it.toString()
        })

            binding.addButton.setOnClickListener {
                addInputNumbers(binding.numberEditText.text?.toString()?.toIntOrNull())
            }

    }
    private fun addInputNumbers(number :Int?) :Unit {
        binding.apply {
            viewModel.addCount(number).toString()
            numberEditText.text.clear()
        }
    }
}
