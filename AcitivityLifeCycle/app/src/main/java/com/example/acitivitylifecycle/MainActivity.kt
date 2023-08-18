package com.example.acitivitylifecycle

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1:Button=findViewById(R.id.button);
        btn1.setOnClickListener(){
            //Explicit Intent
            var i: Intent = Intent(this,Activity2::class.java);

            //Passing data b/w activities
            //Key , value
            //key should be string
            i.putExtra("age",30);
            startActivity(i);
        }

        val btn2:Button=findViewById(R.id.button2);
        btn2.setOnClickListener(){
            //Implicit Intent
            var intent:Intent=Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.google.com"));
            startActivity(intent);
        }

    }
}