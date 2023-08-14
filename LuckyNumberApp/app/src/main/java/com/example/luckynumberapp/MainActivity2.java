package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView1=findViewById(R.id.textView3);
        Button share=findViewById(R.id.button2);

        //Recieve data from main activity
        Intent i=getIntent();
        String userName=i.getStringExtra("name");

        //Generate random number
        int ranNumber=generateRandomNumber();
        textView1.setText(""+ranNumber);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareData(userName,ranNumber);
            }
        });

    }

    public void shareData(String user,int num){
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("text/plain");

        i.putExtra(Intent.EXTRA_SUBJECT,user+"got lucky today!");
        i.putExtra(Intent.EXTRA_TEXT,"His lucky number is: "+num);

        startActivity(Intent.createChooser(i,"Choose a platform"));

    }

    public int generateRandomNumber(){
        Random random=new Random();
//        int upperlim=1000;
        int ranNum=random.nextInt(1000);
        return ranNum;
    }
}