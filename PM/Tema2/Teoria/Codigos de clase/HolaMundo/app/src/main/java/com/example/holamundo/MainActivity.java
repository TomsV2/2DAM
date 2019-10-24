package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView texto, texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = (TextView) findViewById(R.id.textoEvento);
        texto2 = (TextView) findViewById(R.id.textoEvento2);

        texto.setOnClickListener(this);
        texto2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.textoEvento:
                Toast.makeText(this, "Pulsado texto 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.textoEvento2:
                Toast.makeText(this, "Pulsado texto 2", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
