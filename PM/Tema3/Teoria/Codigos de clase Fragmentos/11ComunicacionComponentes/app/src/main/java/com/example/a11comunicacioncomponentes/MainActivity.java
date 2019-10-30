package com.example.a11comunicacioncomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Código para la llamada
    public void pulsado(View v){
        Intent intent = new Intent(this, actividad2.class) //El segundo parámetro en a donde voy (que java) pero con .class
        starA
    }

}
