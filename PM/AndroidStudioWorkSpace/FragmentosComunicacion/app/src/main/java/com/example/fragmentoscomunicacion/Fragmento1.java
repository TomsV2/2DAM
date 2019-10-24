package com.example.fragmentoscomunicacion;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragmento1 extends Fragment {

    private OnContolesFragmentoListener mListener;

    public Fragmento1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragmento1, container, false);

        Button botonColor = (Button) view.findViewById(R.id.buttonColor);
        Button botonTexto = (Button) view.findViewById(R.id.buttonTexto);

        botonColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.botonCambioColorClick("Colorao");
            }
        });

        botonTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.botonCambioTextoClick("Hola");
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnContolesFragmentoListener) {
            mListener = (OnContolesFragmentoListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


}
