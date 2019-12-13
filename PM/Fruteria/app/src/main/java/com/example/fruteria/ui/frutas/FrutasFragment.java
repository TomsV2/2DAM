package com.example.fruteria.ui.frutas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.fruteria.AdaptadorListaFrutas;
import com.example.fruteria.Fruta;
import com.example.fruteria.MainActivity;
import com.example.fruteria.R;
import com.example.fruteria.ScrollingActivity_Banana;

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
        listFruta.add(new Fruta("Plátano", "Gran Canaria", R.drawable.banana_ic));
        listFruta.add(new Fruta("Fresa", "Huelva", R.drawable.strawberry_ic));
        listFruta.add(new Fruta("Naranja", "Sevilla", R.drawable.orange_ic));
        listFruta.add(new Fruta("Manzana", "Madrid", R.drawable.apple_ic));
        listFruta.add(new Fruta("Cereza", "Galicia", R.drawable.cherry_ic));
        listFruta.add(new Fruta("Pera", "Zaragoza", R.drawable.pear_ic));
        listFruta.add(new Fruta("Mora", "Barcelona", R.drawable.raspberry_ic));

        final AdaptadorListaFrutas adaptadorListaFrutas = new AdaptadorListaFrutas(
                getContext(),
                R.layout.fruta_item,
                listFruta
        );
        listView = (ListView) vista.findViewById(R.id.listview_frutas);

        listView.setAdapter(adaptadorListaFrutas);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent();

                switch(position){
                    case 0:
                        intent = new Intent(view.getContext(), ScrollingActivity_Banana.class);
                        //Toast.makeText(getContext(), "Fruta 1", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Toast.makeText(getContext(), "Fruta 2", Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Toast.makeText(getContext(), "Fruta 3", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Toast.makeText(getContext(), "Fruta 4", Toast.LENGTH_SHORT).show();
                        break;

                    case 4:
                        Toast.makeText(getContext(), "Fruta 5", Toast.LENGTH_SHORT).show();
                        break;

                    case 5:
                        Toast.makeText(getContext(), "Fruta 6", Toast.LENGTH_SHORT).show();
                        break;

                    case 6:
                        Toast.makeText(getContext(), "Fruta 7", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        intent = new Intent();
                        break;
                }

                startActivity(intent);
            }
        });

        return vista;
    }



}
