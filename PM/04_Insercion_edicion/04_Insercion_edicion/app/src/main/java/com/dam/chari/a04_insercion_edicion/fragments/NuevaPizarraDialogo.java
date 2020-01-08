package com.dam.chari.a04_insercion_edicion.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.dam.chari.a04_insercion_edicion.R;
import com.dam.chari.a04_insercion_edicion.interfaz.OnNuevaPizarraListener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class NuevaPizarraDialogo extends DialogFragment {
    @NonNull
    AlertDialog.Builder builder;
    OnNuevaPizarraListener mListener;
    View v;
    EditText editTextTitulo;


    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // Use the Builder class for convenient dialog construction
        builder= new AlertDialog.Builder(getActivity());

        //obtener una referencia al layout que vamos a cargar
        LayoutInflater inflater = getActivity().getLayoutInflater();

        v= inflater.inflate(R.layout.dialog_nueva_pizarra,null);
        editTextTitulo = (EditText)v.findViewById(R.id.editTextTitulo);
        //cargar un layout sobre el cuadro de dialogo
        builder.setView(v);
        builder.setTitle("Nueva Pizarra")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(),"Pizarra guardada",Toast.LENGTH_LONG).show();

                        String titulo = editTextTitulo.getText().toString();
                        if (!titulo.isEmpty()) {
                            mListener.onPizarraGuardaClickListener(titulo);
                        }else{
                            Toast.makeText(getActivity(),"complete los campos",Toast.LENGTH_LONG).show();
                        }
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Cancelar es cerrar el cuadro de dialogo
                        dialog.dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();

    }

    //permite verificar que el activity que carga esta pizarra implementa la interfaz OnNuevaPizarraListener


    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnNuevaPizarraListener) activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString()
                + "debe implementar OnNuevaPizarraListener");
        }
    }
}
