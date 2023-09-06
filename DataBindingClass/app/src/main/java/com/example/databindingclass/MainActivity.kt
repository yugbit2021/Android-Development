package com.example.databindingclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

       var u1=user(1,"jack","123");

        binding.apply {
            textView.setText(""+u1.id)
          nametxt.setText(u1.name)
          passwordtxt.setText(u1.pass);
        }


    }
}