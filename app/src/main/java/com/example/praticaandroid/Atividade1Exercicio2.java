package com.example.praticaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Atividade1Exercicio2 extends AppCompatActivity {

    EditText messageEditText;
    Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade1_exercicio2);

        messageEditText = findViewById(R.id.messageEditText);
        buttonSend = findViewById(R.id.buttonSend);
    }

    public void sendMessage(View view) {
        String message = messageEditText.getText().toString();

        Intent intent = new Intent(this, Atividade1Ex2Mensagem.class);
        intent.putExtra("message", message);
        startActivity(intent);
    }
}