package com.elmokhliss.elmokhliss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     // Declaration
    EditText etLogin, etPassword;
    Button bLoging;
    TextView tvRegister;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Recuperation des ids;

        etLogin =(EditText)findViewById(R.id.etLogin);
        etPassword = (EditText)findViewById(R.id.etPassword);
        bLoging =(Button)findViewById(R.id.bLogin);
        tvRegister = (TextView)findViewById(R.id.tvRegister);

        // Association de listener;

        bLoging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Traitment;
                if (etLogin.getText().toString().equals("hope") && etPassword.getText().toString().equals("allah")) {
                    startActivity(new Intent(MainActivity.this, Quiz.class));
                }else{
                    Toast.makeText(MainActivity.this, "Oops", Toast.LENGTH_SHORT).show();
                }
            }
        });


        textview = (TextView) findViewById(R.id.tvRegister);
        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);


            }
        });


    }
}