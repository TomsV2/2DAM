package com.example.a11comunicacioncomponentes;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaProvincias extends ListActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String [] elemento = {
                "Jaén","Córdoba","Sevilla","Huelva","Cádiz","Málaga","Granada","Almería"
        };

        ArrayAdapter<String> adaptador;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listaprovincias);

        ListView l = (ListView)findViewById(android.R.id.list);
        adaptador = new ArrayAdapter<String>(this,R.layout.fila,elemento);
        setListAdapter(adaptador);
        l.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> a, View view, int position, long id) {
        Intent i = new Intent();
        i.putExtra("PROVINCIA", a.getItemAtPosition(position).toString());
        setResult(RESULT_OK,i);
        finish();
    }
}
