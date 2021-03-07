package com.example.praticaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView result;
    public Button buttonSum;
    public Button activity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAtividade1Ex1(View view) {
        Intent intent = new Intent(this, Atividade1Exercicio1.class);
        startActivity(intent);
    }

    public void startAtividade1Ex2(View view) {
        Intent intent = new Intent(this, Atividade1Exercicio2.class);
        startActivity(intent);
    }

    public void startAtividade1Ex3(View view) {
        Intent intent = new Intent(this, Atividade1Ex3Mensagem.class);
        startActivity(intent);
    }

    public void startAtividade2(View view) {
        Intent intent = new Intent(this, Atividade2.class);
        startActivity(intent);
    }

}

