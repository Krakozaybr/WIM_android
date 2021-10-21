package com.krak.myapplicationjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Combinations extends AppCompatActivity {

    Button CcomeBack;
    Button Csolve;
    TextView Canswer;
    EditText Cn;
    EditText Ck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.combinations);

        CcomeBack = findViewById(R.id.CcomeBack);
        Csolve = findViewById(R.id.Csolve);
        Canswer = findViewById(R.id.Canswer);
        Cn = findViewById(R.id.Cn);
        Ck = findViewById(R.id.Ck);

        CcomeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Combinations.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Csolve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try{
                    int n = Integer.parseInt((Cn.getText().toString().equals("")) ? "0" : Cn.getText().toString());
                    int k = Integer.parseInt((Ck.getText().toString().equals("")) ? "0" : Ck.getText().toString());
                    if (k > n){
                        throw new RuntimeException();
                    }
                    long result = factorial(n) / factorial(n - k) / factorial(k);
                    Canswer.setText(result + "");
                } catch (RuntimeException e){
                    Canswer.setText("k не может быть больше n");
                } catch (Exception e){
                    Canswer.setText("Что-то пошло не так");
                }
            }
        });
    }
    private long factorial(long a) throws Exception{
        int result = 1;
        if (a < 0){
            throw new Exception();
        }
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}
