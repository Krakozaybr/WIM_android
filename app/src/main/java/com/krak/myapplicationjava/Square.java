package com.krak.myapplicationjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Square extends AppCompatActivity {

    Button ScomeBack;
    Button rectangle;
    Button triangle;
    Button parallelogram;
    Button round;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.square);

        ScomeBack = findViewById(R.id.ScomeBack);
        rectangle = findViewById(R.id.rectangle);
        triangle = findViewById(R.id.triangle);
        parallelogram = findViewById(R.id.parallelogram);
        round = findViewById(R.id.round);

        ScomeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Square.this, MainActivity.class);
                startActivity(intent);
            }
        });
        rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        triangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        parallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
