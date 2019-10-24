package com.example.click;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, frPrincipal.OnFragmentInteractionListener, frMejoras.OnFragmentInteractionListener {

    Button bt_M;
    Button bt_J;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frPrincipal fragmentoPrincipal = new frPrincipal();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmentoPrincipal).commit();

        bt_M = (Button)findViewById(R.id.bt_M);
        bt_J = (Button)findViewById(R.id.bt_J);

        bt_M.setOnClickListener(this);
        bt_J.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.bt_J:

                frPrincipal fragmentoPrincipal = new frPrincipal();

                FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.contenedor, fragmentoPrincipal);
                transition.commit();

                break;

            case R.id.bt_M:

                frMejoras fragmentoMejoras = new frMejoras();
                FragmentTransaction transition1 =  getSupportFragmentManager().beginTransaction();
                transition1.replace(R.id.contenedor, fragmentoMejoras);
                transition1.commit();

                break;
        }

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
