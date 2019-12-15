package com.example.fruteria.ui.nuevasFrutas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.fruteria.AdaptadorListaFrutas;
import com.example.fruteria.Fruta;
import com.example.fruteria.R;
import com.example.fruteria.ScrollingActivity_Banana;
import com.example.fruteria.ScrollingActivity_Cereza;
import com.example.fruteria.ScrollingActivity_Fresa;
import com.example.fruteria.ScrollingActivity_Manzana;
import com.example.fruteria.ScrollingActivity_Mora;
import com.example.fruteria.ScrollingActivity_Naranja;
import com.example.fruteria.ScrollingActivity_Pera;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class NuevasFrutasFragment extends Fragment {

    ListView listView;
    List<Fruta> listFruta;

    View vista;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        vista =  inflater.inflate(R.layout.fragment_nuevasfrutas, container, false);

        listFruta = new ArrayList<>();

        listFruta.add(new Fruta("Added nº" + (listFruta.size()+1), "Desconocido", R.drawable.plum_ic));
        listFruta.add(new Fruta("Added nº" + (listFruta.size()+1), "Desconocido", R.drawable.plum_ic));

        final AdaptadorListaFrutas adaptadorListaFrutas = new AdaptadorListaFrutas(
                getContext(),
                R.layout.fruta_item,
                listFruta
        );
        listView = (ListView) vista.findViewById(R.id.listview_nuevasfrutas);

        listView.setAdapter(adaptadorListaFrutas);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, final View view, int position, long id) {



                final AlertDialog alertDialog = new AlertDialog.Builder(getContext()).create();
                alertDialog.setTitle("¿Borrar fruta?");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Borrar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Snackbar.make(view, "Se debería de borrar", Snackbar.LENGTH_LONG)
                                        .setAction("Action", null).show();
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();

                /*public Dialog onCreateDialog(Bundle savedInstanceState) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                    // Get the layout inflater
                    LayoutInflater inflater = requireActivity().getLayoutInflater();

                    // Inflate and set the layout for the dialog
                    // Pass null as the parent view because its going in the dialog layout
                    builder.setView(inflater.inflate(R.layout.dialog_signin, null))
                            // Add action buttons
                            .setPositiveButton("Crear", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int id) {
                                    // sign in the user ...
                                }
                            })
                            .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    LoginDialogFragment.this.getDialog().cancel();
                                }
                            });
                    return builder.create();
                }*/

                return false;
            }
        });

        return vista;
    }

}
