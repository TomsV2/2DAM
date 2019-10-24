package com.miguelcr.a04_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipoAveriaClicked(View view) {

        CheckBox checkBox = (CheckBox)view;//transformar elemento view a un checkbox pq lo que recibo es un elemento genérico,
                                           //ya que he recibido un view por cabecera
        boolean chequeado = checkBox.isChecked();//primero comprueba si el checkbox esta chequeado

        String tipo = "";

        // Sobre qué checkbox se ha hecho click. Puedo a través del elem checkbox o sobre el eleme view
        switch (view.getId()) {
            case R.id.checkBoxChapa:
                tipo = "Chapa y pintura";
                break;
            case R.id.checkBoxCristal:
                tipo = "Cristal";
                break;
            case R.id.checkBoxMecanica:
                tipo = "Avería mecánica";
                break;
        }

        Toast.makeText(this, tipo+" ("+chequeado+")", Toast.LENGTH_SHORT).show();
    }
}
