package com.example.datastorageinandroid

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var name_textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText=findViewById<EditText>(R.id.editText);
        name_textView=findViewById(R.id.textView2)
        val btn=findViewById<Button>(R.id.button)

        DisplaySavedName()
        btn.setOnClickListener(){
            val enteredTxt:String=editText.text.toString()
            SaveNameInSharedPref(enteredTxt)
        }
    }
    private fun SaveNameInSharedPref(enteredTxt:String){
        //Saving the Text into shared Pref
        val sharedPreferences:SharedPreferences =
            getSharedPreferences("UserName",
            MODE_PRIVATE)
        //Writing data to shared pref
        val editor:SharedPreferences.Editor=
            sharedPreferences.edit()

        editor.putString("name",enteredTxt)
        editor.apply()
    }
//Reading data from Shared Pref
    fun DisplaySavedName(){
       val sharedPreferences:SharedPreferences=getSharedPreferences("UserName",
           MODE_PRIVATE)

    val s1:String?=sharedPreferences.getString("name","")

    name_textView.setText(s1)
    }
}


