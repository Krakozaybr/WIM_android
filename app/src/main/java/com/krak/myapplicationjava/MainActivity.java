package com.krak.myapplicationjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button quadraticEquation;
    Button perimeterOfCircle;
    Button bankAccount;
    Button root;
    Button combinations;
    Button square;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //chatWindow = findViewById(R.id.chatWindow);

        quadraticEquation = findViewById(R.id.quadraticEquation);
        perimeterOfCircle = findViewById(R.id.perimeterOfCircle);
        bankAccount = findViewById(R.id.bankAccount);
        root = findViewById(R.id.root);
        combinations = findViewById(R.id.combinations);
        square = findViewById(R.id.square);

        quadraticEquation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, QuadraticEquation.class);
                startActivity(intent);
            }
        });
        bankAccount.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, BankAccount.class);
                startActivity(intent);
            }
        });
        root.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Root.class);
                startActivity(intent);
            }
        });
        combinations.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Combinations.class);
                startActivity(intent);
            }
        });
        square.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Square.class);
                startActivity(intent);
            }
        });
        perimeterOfCircle.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}