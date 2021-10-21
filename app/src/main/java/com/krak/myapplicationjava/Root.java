package com.krak.myapplicationjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Root extends AppCompatActivity {

    Button RcomeBack;
    Button Rsolve;
    TextView Ranswer;
    EditText Ra;
    EditText Rm;
    EditText Rn;
    EditText Rk;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.root);

        RcomeBack = findViewById(R.id.RcomeBack);
        Rsolve = findViewById(R.id.Rsolve);
        Ranswer = findViewById(R.id.Ranswer);
        Ra = findViewById(R.id.Ra);
        Rm = findViewById(R.id.Rm);
        Rn = findViewById(R.id.Rn);
        Rk = findViewById(R.id.Rk);

        // (a / m) ^ (n / k)

        RcomeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Root.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Rsolve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    double a = Double.parseDouble(Ra.getText().toString().equals("") ? "0" : Ra.getText().toString());
                    double m = Double.parseDouble(Rm.getText().toString().equals("") ? "1" : Rm.getText().toString());
                    double n = Double.parseDouble(Rn.getText().toString().equals("") ? "1" : Rn.getText().toString());
                    double k = Double.parseDouble(Rk.getText().toString().equals("") ? "1" : Rk.getText().toString());
                    if (n == 0 || k == 0 || m == 0){
                        throw new Exception();
                    }
                    double result = Math.pow(a / m, 1 / (n / k));
                    Ranswer.setText(result + "");
                } catch (Exception e){
                    Ranswer.setText("Что-то пошло не так");
                }
            }
        });
    }
}
