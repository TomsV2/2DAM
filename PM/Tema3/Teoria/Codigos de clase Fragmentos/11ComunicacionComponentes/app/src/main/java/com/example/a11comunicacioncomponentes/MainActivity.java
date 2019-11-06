package com.example.a11comunicacioncomponentes;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int selecciona_provinica = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Código para la llamada
    public void pulsado(View v){
        Intent intent = new Intent(this, ListaProvincias.class); //El segundo parámetro en a donde voy (que java) pero con .class
        startActivityForResult(intent,selecciona_provinica);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView t = (TextView) findViewById(R.id.provinciaSeleccionada);

        if (requestCode == selecciona_provinica) {
            if (resultCode == RESULT_OK) {
                //Se ha seleccionado correctamente una provincia
                t.setText("Se ha seleccionado:\n" +
                        data.getStringExtra("PROVINCIA"));
            }
        }
    }
}
