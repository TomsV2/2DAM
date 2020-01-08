package com.dam.chari.a04_insercion_edicion.fragments;


import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import io.realm.RealmList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import com.dam.chari.a04_insercion_edicion.R;
import com.dam.chari.a04_insercion_edicion.interfaz.OnNuevaPizarraListener;
import com.dam.chari.a04_insercion_edicion.models.Notas;
import com.dam.chari.a04_insercion_edicion.models.Pizarra;

import java.util.Date;


public class EditPizarraDialogFragment extends DialogFragment {

    private int idPizarra;
    private String titulo;
    private Date date;
    private RealmList<Notas> notas;
    EditText editTextTitulo;
    AlertDialog.Builder builder;
    OnNuevaPizarraListener mListener;
    View v;
    public EditPizarraDialogFragment() {
        // Required empty public constructor
    }

public static EditPizarraDialogFragment newInstance(int id, String titulo, Date date, RealmList<Notas> notas) {
        EditPizarraDialogFragment fragment = new EditPizarraDialogFragment();
        Bundle args = new Bundle();
        args.putInt(Pizarra.PIZARRA_ID, id);
        args.putString(Pizarra.PIZARRA_TITULO,titulo);
        args.putString(Pizarra.PIZARRA_CREADA,String.valueOf(date));
        //args.putParcelableArrayList(Pizarra.PIZARRA_NOTAS,notas);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idPizarra = getArguments().getInt(Pizarra.PIZARRA_ID);
            titulo = getArguments().getString(Pizarra.PIZARRA_TITULO);
            //date = getArguments().getString(Pizarra.PIZARRA_CREADA);

        }
    }

    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        // Use the Builder class for convenient dialog construction
        builder= new AlertDialog.Builder(getActivity());

        //obtener una referencia al layout que vamos a cargar
        LayoutInflater inflater = getActivity().getLayoutInflater();

        v= inflater.inflate(R.layout.dialog_nueva_pizarra,null);
        editTextTitulo = (EditText)v.findViewById(R.id.editTextTitulo);
        editTextTitulo.setText(titulo);
        //cargar un layout sobre el cuadro de dialogo
        builder.setView(v);
        builder.setTitle("Editar pizarra")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(getActivity(),"Pizarra guardada",Toast.LENGTH_LONG).show();

                        String titulo = editTextTitulo.getText().toString();
                        if (!titulo.isEmpty()) {
                            mListener.onPizarraActualizarCLicListener(idPizarra,titulo);
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
