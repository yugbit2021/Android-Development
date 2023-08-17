package com.example.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText=findViewById(R.id.editText);

        //getting the data from edittext;
        val editText=et.text;

        //Button
        val btn:Button=findViewById(R.id.button);

        //Handling the click events
        btn.setOnClickListener(){
            //execute this code when button is clicked
            Toast.makeText(this@MainActivity,
                "Hello "+editText,
                Toast.LENGTH_LONG).show();
        }
        val iv:ImageView=findViewById(R.id.imageView);
    }
}