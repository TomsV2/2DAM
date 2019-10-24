package com.miguelcr.a04_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //1.1.- creamos un id del radioGroup
    RadioGroup radioGroupAv; //1.2.- difino un elemento RadioGroup

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1.3.- al lanzar la activity le asignamos el valor del radioGroup del layout asignandole el id
        radioGroupAv = (RadioGroup) findViewById(R.id.radioGroupAverias);
    }

    public void tipoAveriaClicked(View view) {

        String tipo = "";

        // Sobre qué checkbox se ha hecho click
        switch (view.getId()) {
            case R.id.radioButtonChapa:
                tipo = "Chapa y pintura";
                break;
            case R.id.radioButtonCristal:
                tipo = "Cristal";
                break;
            case R.id.radioButtonMecanica:
                tipo = "Avería mecánica";
                break;
        }

        Toast.makeText(this, tipo, Toast.LENGTH_SHORT).show();
    }

    public void conocerOpcionMarcada(View view) {

        //2.1.- tomo el identifocador del radiobutton
        int idSeleccionado = radioGroupAv.getCheckedRadioButtonId();
        String tipo = "";

        //2.2. compruebo con el id que radibutton ha sido marcado
        if(idSeleccionado==R.id.radioButtonChapa) {
            tipo = "Has seleccionado Chapa y pintura";
        } else if (idSeleccionado==R.id.radioButtonCristal) {
            tipo = "Has seleccionado Cristal";
        } else {
            tipo = "Has seleccionado Avería mecánica";
        }

        Toast.makeText(this, tipo, Toast.LENGTH_SHORT).show();
    }
}
