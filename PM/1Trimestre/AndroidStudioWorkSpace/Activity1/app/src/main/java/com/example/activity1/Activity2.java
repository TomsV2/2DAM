package com.example.activity1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle valores = getIntent().getExtras();

        String nombre = valores.getString("nombre");
        int edad = valores.getInt("edad");
        String curso = valores.getString("curso");

        Toast.makeText(this, "El nombre es: " +nombre +" con una edad de " +edad +" años matriculado en " +curso, Toast.LENGTH_LONG).show();
    }
}
