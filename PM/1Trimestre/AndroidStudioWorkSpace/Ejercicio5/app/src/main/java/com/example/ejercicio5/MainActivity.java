package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaraciones de variables
        RadioGroup radioGroup_Fondo = (RadioGroup) findViewById(R.id.radioGroup_Fondo);
        RadioGroup radioGroup_Texto = (RadioGroup) findViewById(R.id.radioGroup_Texto);


    }

    public void colorFondo(View view) {

    }

    public void colorTexto(View view) {

    }

    public void cambiarTexto(View view) {

    }
}
