package com.dam.chari.spinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Spinner.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Crear un array con los elementos seleccionables
        String [] elementos ={ "Jaén", "Córdoba", "Sevilla", "Huelva", "Cádiz", "Málaga", "Granada", "Almería"};

        //Declara un adaptador de texto (String)
        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtienes la referencia del spinners
        Spinner sp = (Spinner)findViewById(R.id.spin);
        adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, elementos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adaptador);
        sp.setOnItemSelectedListener(this);

    }

    @Override
    //Callback cuando se selecciona un elemento del Spinner
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView t = (TextView)findViewById(R.id.TextoSelect);
        Spinner sp = (Spinner)findViewById(R.id.spin);

        t.setText(sp.getSelectedItem().toString());
    }

    @Override
    //Callback cuando no se selecciona un elemento del Spinner
    public void onNothingSelected(AdapterView<?> adapterView) {
        TextView t = (TextView)findViewById(R.id.TextoSelect);
        t.setText("No se ha seleccionado nada");
    }
}
