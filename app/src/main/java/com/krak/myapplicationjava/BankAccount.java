package com.krak.myapplicationjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Double.parseDouble;

public class BankAccount extends AppCompatActivity {

    EditText BApercents;
    EditText BAyears;
    EditText BAstartSum;
    Button BAsolve;
    Button BAcomeBack;
    TextView BAresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bank_account);

        BApercents = findViewById(R.id.BApercents);
        BAyears = findViewById(R.id.BAyears);
        BAstartSum = findViewById(R.id.BAstartSum);
        BAsolve = findViewById(R.id.BAsolve);
        BAcomeBack = findViewById(R.id.BAcomeBack);
        BAresult = findViewById(R.id.BAresult);

        BAcomeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(BankAccount.this, MainActivity.class);
                startActivity(intent);
            }
        });

        BAsolve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    String percents = BApercents.getText().toString().equals("") ?
                            "0" : BApercents.getText().toString();
                    double percentsVal = Double.parseDouble(percents);
                    String years = BAyears.getText().toString().equals("") ?
                            "0" : BAyears.getText().toString();
                    double yearsVal = Double.parseDouble(years);
                    String startSum = BAstartSum.getText().toString().equals("") ?
                            "0" : BAstartSum.getText().toString();
                    double startSumVal = Double.parseDouble(startSum);

                    for (int i = 0; i < yearsVal; i++) {
                        startSumVal = startSumVal * percentsVal / 100 + startSumVal;
                    }

                    BAresult.setText(startSumVal + "");
                } catch (Exception e){
                    BAresult.setText("Что-то пошло не так");
                }
            }
        });
    }
}
