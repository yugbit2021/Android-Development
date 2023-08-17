package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

var counter=0;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val tv:TextView=findViewById(R.id.textView);
        val btn:Button=findViewById(R.id.button);

        btn.setOnClickListener(){
            tv.setText(""+increaseCounter());
        }
    }
    fun increaseCounter():Int{
        counter++
        return counter
    }
}