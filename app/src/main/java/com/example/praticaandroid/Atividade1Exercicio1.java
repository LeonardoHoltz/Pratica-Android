package com.example.praticaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Atividade1Exercicio1 extends AppCompatActivity {

    EditText firstValue;
    EditText secondValue;
    Button sumButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade1_exercicio1);

        firstValue = findViewById(R.id.firstValue);
        secondValue = findViewById(R.id.secondValue);
        sumButton = findViewById(R.id.sumButton);
        resultText = findViewById(R.id.showResult);

    }

    @SuppressLint("SetTextI18n")
    public void sum(View view) {
        String value1Text = firstValue.getText().toString();
        String value2Text = secondValue.getText().toString();

        if(!value1Text.isEmpty() && !value2Text.isEmpty()) {
            try {
                int value1 = Integer.parseInt(value1Text);
                int value2 = Integer.parseInt(value2Text);
                String result = String.valueOf(value1 + value2);
                resultText.setText(result);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                resultText.setText("ERRO NO FORMATO DOS VALORES");
            }
        }
    }
}