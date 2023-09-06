package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var viewModel:MainActivityViewModel
    lateinit var binding:ActivityMainBinding
    lateinit var factory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //binding object
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        //view model factory
        factory=MainActivityViewModelFactory(100)

        viewModel=ViewModelProvider(this,factory).get(MainActivityViewModel::class.java)

        binding.apply {
           button.setOnClickListener(){
               viewModel.getUpdatedCount()
               textView.text=viewModel.genCurrentCount().toString()
           }

        }
    }
}