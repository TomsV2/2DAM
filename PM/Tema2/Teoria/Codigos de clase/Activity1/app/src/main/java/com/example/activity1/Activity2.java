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

        String n = valores.getString("Nombre");
        int edad = valores.getInt("edad");
        String curso = valores.getString("curso");

        Toast.makeText(this, "El nombre es "+n+ " con una edad de "
            + edad+ " matriculado en "+ curso, Toast.LENGTH_LONG).show();
    }
}
