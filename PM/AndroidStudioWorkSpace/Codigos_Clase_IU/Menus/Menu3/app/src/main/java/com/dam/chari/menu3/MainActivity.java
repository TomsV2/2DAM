package com.dam.chari.menu3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (id){
            case R.id.Cli:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Cliente",Toast.LENGTH_LONG).show();
                return true;
            case R.id.nCliente:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Nuevo Cliente",Toast.LENGTH_LONG).show();
                return true;
            case R.id.bCliente:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Buscar Cliente",Toast.LENGTH_LONG).show();
                return true;
            case R.id.Fact:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Facturas",Toast.LENGTH_LONG).show();
                return true;
            case R.id.nFact:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Nueva Factura",Toast.LENGTH_LONG).show();
                return true;
            case R.id.bFactura:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Buscar Factura",Toast.LENGTH_LONG).show();
                return true;
            case R.id.ajust:
                Toast.makeText(getApplicationContext(),"Se ha pulsado Ajustes",Toast.LENGTH_LONG).show();
                return true;
            case R.id.confFact:
            case R.id.confClientes:
            case R.id.confPedidos:

        }

        return super.onOptionsItemSelected(item);
    }
}
