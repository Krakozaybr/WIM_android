package com.krak.myapplicationjava;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuadraticEquation extends Activity {

    Button QEcomeBack;
    Button QEsolve;
    EditText QEa;
    EditText QEb;
    EditText QEc;
    TextView QEanswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quadratic_equation);

        QEcomeBack = findViewById(R.id.QEcomeBack);
        QEsolve = findViewById(R.id.QEsolve);
        QEa = findViewById(R.id.QEa);
        QEb = findViewById(R.id.QEb);
        QEc = findViewById(R.id.QEc);
        QEanswer = findViewById(R.id.QEanswer);

        QEcomeBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(QuadraticEquation.this, MainActivity.class);
                startActivity(intent);
            }
        });

        QEsolve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                try {
                    String astr = QEa.getText().toString().equals("") ? "0" : QEa.getText().toString();
                    String bstr = QEb.getText().toString().equals("") ? "0" : QEb.getText().toString();
                    String cstr = QEc.getText().toString().equals("") ? "0" : QEc.getText().toString();
                    double a = Double.parseDouble(astr);
                    double b = Double.parseDouble(bstr);
                    double c = Double.parseDouble(cstr);
                    double discriminant = b * b - 4 * a * c;
                    boolean a0 = a == 0;
                    boolean b0 = b == 0;
                    boolean c0 = c == 0;

                    if (discriminant < 0 ||
                        (a0 && b0 && c != 0) ||
                        (a > 0 && b0 && c0)){
                        QEanswer.setText("∅");
                    } else if (a0 && b0 && c0){
                        QEanswer.setText("(-∞; +∞)");
                    } else if (a0){
                        QEanswer.setText(b / -c + "");
                    } else if (discriminant == 0){
                        QEanswer.setText(-b / 2 / a + "");
                    } else if (discriminant > 0){
                        double x1 = (-b + Math.sqrt(discriminant)) / 2 / a;
                        double x2 = (-b - Math.sqrt(discriminant)) / 2 / a;
                        QEanswer.setText(x1 + " ∪ " + x2);
                    }
                } catch (Exception e){
                    QEanswer.setText("Что-то пошло не так");
                }
            }
        });
    }
}
