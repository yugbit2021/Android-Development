package com.example.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)


//        binding.button.setOnClickListener(){
//            val str:String=binding.editText.text.toString()
//            binding.textView.setText("Hello $str")
//
//        }

        binding.apply {
            button.setOnClickListener(){
                val str:String=editText.text.toString()
                textView.setText("Hello $str")
            }
        }


    }
}