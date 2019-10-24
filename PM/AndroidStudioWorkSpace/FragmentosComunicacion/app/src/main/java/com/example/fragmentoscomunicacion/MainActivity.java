package com.example.fragmentoscomunicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnContolesFragmentoListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contenedor, new Fragmento1())
                .commit();
    }

    @Override
    public void botonCambioColorClick(String color) {
        Toast.makeText(this, "Volvimos a Activity con el color: " +color, Toast.LENGTH_LONG).show();
    }

    @Override
    public void botonCambioTextoClick(String texto) {
        Toast.makeText(this, "Volvimos a Activity con el texto: " +texto, Toast.LENGTH_LONG).show();
    }
}
