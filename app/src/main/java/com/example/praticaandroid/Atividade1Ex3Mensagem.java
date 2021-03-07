package com.example.praticaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Atividade1Ex3Mensagem extends AppCompatActivity {

    TextView viewXNew, viewYNew, viewZNew;
    TextView viewXOld, viewYOld, viewZOld;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade1_ex3_mensagem);

        float x = getIntent().getFloatExtra("x", 0);
        float y = getIntent().getFloatExtra("y", 0);
        float z = getIntent().getFloatExtra("z", 0);
        float x_old = getIntent().getFloatExtra("x_old", 0);
        float y_old = getIntent().getFloatExtra("y_old", 0);
        float z_old = getIntent().getFloatExtra("z_old", 0);

        viewXNew = findViewById(R.id.xNew);
        viewYNew = findViewById(R.id.yNew);
        viewZNew = findViewById(R.id.zNew);
        viewXOld = findViewById(R.id.xOld);
        viewYOld = findViewById(R.id.yOld);
        viewZOld = findViewById(R.id.zOld);

        viewXNew.setText(String.format("%.2f",x));
        viewYNew.setText(String.format("%.2f",y));
        viewZNew.setText(String.format("%.2f",z));
        viewXOld.setText(String.format("%.2f",x_old));
        viewYOld.setText(String.format("%.2f",y_old));
        viewZOld.setText(String.format("%.2f",z_old));
    }
}