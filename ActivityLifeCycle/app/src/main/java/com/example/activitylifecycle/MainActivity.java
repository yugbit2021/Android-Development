package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecondActivity();
            }
        });

        button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebPage();
            }
        });

        Toast.makeText(this, "onCreate() is called ", Toast.LENGTH_SHORT).show();
    }
    //Explicit Intent
    public  void goToSecondActivity(){
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    //Implicit Intent
    public void openWebPage(){
        Uri webpage= Uri.parse("https://github.com/yugbit2021");

        Intent intent=new Intent(Intent.ACTION_VIEW,webpage);
        startActivity(intent);
    }















    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart() is called ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume() is called ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause() is called ", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Release resources , save data , etc
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart() is called ", Toast.LENGTH_SHORT).show();
    }
}
