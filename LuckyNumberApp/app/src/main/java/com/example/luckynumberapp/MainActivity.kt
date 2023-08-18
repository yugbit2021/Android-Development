package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText=findViewById(R.id.editText);
        val btn:Button=findViewById(R.id.button);

        btn.setOnClickListener(){
            val edittext=et.text;
            val i:Intent=Intent(this,MainActivity2::class.java);
            i.putExtra("name",edittext);
            startActivity(i);
        }
    }
}