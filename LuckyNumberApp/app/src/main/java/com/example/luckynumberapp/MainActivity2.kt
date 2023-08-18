package com.example.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val tv:TextView=findViewById(R.id.textView2);
        val btn2:Button=findViewById(R.id.button2);

        var user_name=recieveusername();

        tv.setText(""+randomnum());

        btn2.setOnClickListener(){
            shareData(user_name,randomnum())
        }

    }

    fun recieveusername():String{
        val bundle:Bundle?=intent.extras
        val user_name=bundle?.get("name").toString();
        return user_name;
    }
    //Random Number
    fun randomnum():Int{
        val random= Random.nextInt(1000);
        return random;
    }

    //Sharing the username and results
    fun shareData(username:String,num:Int){
        //Implicit intent
        var i= Intent(Intent.ACTION_SEND);
        i.setType("text/plain");
        i.putExtra(Intent.EXTRA_SUBJECT,"$username is lucky today");
        i.putExtra(Intent.EXTRA_TEXT,"His lucky number is $num");
        startActivity(i);
    }
}