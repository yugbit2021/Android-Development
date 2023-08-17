package com.example.unitconverterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et:EditText=findViewById(R.id.editText);
        val btn:Button=findViewById(R.id.button);
        val result_txt:TextView=findViewById(R.id.textView);

        btn.setOnClickListener(){
            val str:Double =et.text.toString().toDouble();
            result_txt.setText(""+convert(str));

        }
    }

    fun convert(kilos :Double):Double{
        return kilos*2.20462262;
    }
}