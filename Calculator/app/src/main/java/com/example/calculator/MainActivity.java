package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;

    Button add;
    Button sub;
    Button mul;
    Button div;

    Button equals;


    
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1=findViewById(R.id.editText);
        EditText editText2=findViewById(R.id.editText2);
        
        one=findViewById(R.id.onebutton);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        two=findViewById(R.id.twobutton);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        TextView textView=findViewById(R.id.display);

        equals=findViewById(R.id.equalsbutton);
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        add=findViewById(R.id.addbutton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=editText1.getText().toString();
                String str2=editText2.getText().toString();
                int a= Integer.parseInt(str1);
                int b= Integer.parseInt(str2);

                int c=a+b;
                //Toast.makeText(MainActivity.this, ""+c, Toast.LENGTH_SHORT).show();

                textView.setText(""+c);
            }
        });

        sub=findViewById(R.id.subbutton);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=editText1.getText().toString();
                String str2=editText2.getText().toString();
                int a= Integer.parseInt(str1);
                int b= Integer.parseInt(str2);

                int c=a-b;
                //Toast.makeText(MainActivity.this, ""+c, Toast.LENGTH_SHORT).show();

                textView.setText(""+c);
            }
        });

        mul=findViewById(R.id.multbutton);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=editText1.getText().toString();
                String str2=editText2.getText().toString();
                int a= Integer.parseInt(str1);
                int b= Integer.parseInt(str2);

                int c=a*b;
                //Toast.makeText(MainActivity.this, ""+c, Toast.LENGTH_SHORT).show();

                textView.setText(""+c);
            }
        });

        div=findViewById(R.id.divbutton);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=editText1.getText().toString();
                String str2=editText2.getText().toString();
                int a= Integer.parseInt(str1);
                int b= Integer.parseInt(str2);

                int c=a/b;
                //Toast.makeText(MainActivity.this, ""+c, Toast.LENGTH_SHORT).show();

                textView.setText(""+c);
            }
        });



    }


}