package com.example.luckynumberapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText=findViewById(R.id.editText);
        Button button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=editText.getText().toString();

                //Explicit Intent
                Intent intent=new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("name",username);
                startActivity(intent);
            }
        });
    }

//    public void goToSecond(){
//        Intent intent=new Intent(this, MainActivity2.class);
//        startActivity(intent);
//    }
}