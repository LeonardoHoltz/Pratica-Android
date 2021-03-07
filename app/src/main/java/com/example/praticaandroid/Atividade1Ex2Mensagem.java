package com.example.praticaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Atividade1Ex2Mensagem extends AppCompatActivity {

    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade1_ex2_mensagem);

        message = findViewById(R.id.message);
        message.setText(getIntent().getStringExtra("message"));
    }
}