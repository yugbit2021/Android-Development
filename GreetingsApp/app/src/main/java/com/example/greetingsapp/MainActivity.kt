package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText=findViewById(R.id.editText);
        val btn:Button=findViewById(R.id.button);



        btn.setOnClickListener(){
            val str=et.text;
            Toast.makeText(this,"Hello "+str,Toast.LENGTH_LONG).show();
        }
    }
}