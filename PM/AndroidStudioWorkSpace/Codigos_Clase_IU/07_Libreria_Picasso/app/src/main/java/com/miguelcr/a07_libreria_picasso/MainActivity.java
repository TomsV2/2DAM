package com.miguelcr.a07_libreria_picasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView logotipo; //1 definir el elemento imagen que quiero controlar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaro el elemento imagen
        logotipo = (ImageView) findViewById(R.id.imageViewLogotipo);

        Picasso.with(this)//contexto
                .load("http://miguelcamposrivera.com/logo_mecaround.png")//dirección donde está la imagen
                .resize(400, 200)//puedo redimensionar
                .centerCrop()//centrar la imagen segun dimensiones anteriores, ambas opciones antes del into
                .into(logotipo); // elemento imagenView de mi activity_main


        /*
        * más opciones antes de .into(logotipo)
        * .placeholder(R.drawable.user_placeholder) //cargar opcion por defecto si conexión lenta
          .error(R.drawable.user_placeholder_error)*/
    }
}
