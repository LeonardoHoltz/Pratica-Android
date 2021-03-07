package com.example.praticaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class Atividade1Exercicio3 extends AppCompatActivity {

    TextView x_value, y_value, z_value;
    private SensorManager sensorManager;
    private Sensor sensor;

    float x, y, z;
    float x_old, y_old, z_old;
    boolean firstTime = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade1_exercicio3);

        x_value = findViewById(R.id.xValue);
        y_value = findViewById(R.id.yValue);
        z_value = findViewById(R.id.zValue);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }

    protected void onResume() {
        super.onResume();
        sensorManager.registerListener((SensorEventListener) this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
        firstTime = true;
    }

    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener((SensorEventListener) this);
    }

    @SuppressLint("DefaultLocale")
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            x_old = x;
            y_old = y;
            z_old = z;

            x = event.values[0];
            y = event.values[1];
            z = event.values[2];

            x_value.setText(String.format("%.5f", x));
            y_value.setText(String.format("%.5f", y));
            z_value.setText(String.format("%.5f", z));

            if (!firstTime && (noteDifference(x,x_old) || noteDifference(y,y_old) || noteDifference(z,z_old))) {
                sendAction(x,y,z, x_old, y_old, z_old);
            }

            firstTime = false;
        }
    }

    public boolean noteDifference(float val, float old_val) {
        return Math.abs(val - old_val) > 5;
    }

    public void sendAction(float x, float y, float z, float x_old, float y_old, float z_old) {
        Intent intent = new Intent(this, Atividade1Ex3Mensagem.class);
        intent.putExtra("x", x);
        intent.putExtra("y", y);
        intent.putExtra("z", z);
        intent.putExtra("x_old", x_old);
        intent.putExtra("y_old", y_old);
        intent.putExtra("z_old", z_old);
        startActivity(intent);
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}