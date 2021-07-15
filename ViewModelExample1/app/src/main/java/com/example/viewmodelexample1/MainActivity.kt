package com.example.viewmodelexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    //private var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.count.text = viewModel.getStartCount().toString()
        //binding.count.text = viewModel.getStartCount().toString() = count
        //setContentView(R.layout.activity_main)
        binding.apply {
        button.setOnClickListener {
            //count++
            count.text = viewModel.increaseCount().toString()
            //binding.count.text = count.toString()
        }
        }
    }
}