package com.example.fruteria.ui.frutas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.fruteria.AdaptadorListaFrutas;
import com.example.fruteria.Fruta;
import com.example.fruteria.R;

import java.util.ArrayList;
import java.util.List;

public class FrutasFragment extends Fragment {

    ListView listView;
    List<Fruta> listFruta;

    View vista;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista =  inflater.inflate(R.layout.fragment_frutas, container, false);

        listFruta = new ArrayList<>();
        listFruta.add(new Fruta("Pato", "PatoLandia", R.drawable.pato));
        listFruta.add(new Fruta("Pato2", "PatoLandia", R.drawable.pato));

        AdaptadorListaFrutas adaptadorListaFrutas = new AdaptadorListaFrutas(
                getContext(),
                R.layout.fruta_item,
                listFruta
        );
        listView = (ListView) vista.findViewById(R.id.listview_frutas);

        listView.setAdapter(adaptadorListaFrutas);

        return vista;
    }

}
