package com.example.click;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements frMejoras.OnFragmentInteractionListener {

    TextView contador;
    Button click;
    Button bt_mejoras;

    int contadorInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frMejoras fragmentoMejoras = new frMejoras();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmentoMejoras);

        click = (Button)findViewById(R.id.clicker);
        contador = (TextView)findViewById(R.id.contador);

        contadorInt = Integer.parseInt(contador.getText().toString());

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                contadorInt = contadorInt + 1;

                contador.setText(String.valueOf(contadorInt));
            }
        });

        bt_mejoras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frMejoras fragmentoMejoras = new frMejoras();

                FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmentoMejoras);
                transition.commit();
            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
