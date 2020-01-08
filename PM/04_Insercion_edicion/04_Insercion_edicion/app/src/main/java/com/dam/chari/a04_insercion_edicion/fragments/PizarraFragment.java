package com.dam.chari.a04_insercion_edicion.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.Realm;
import io.realm.RealmResults;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dam.chari.a04_insercion_edicion.R;
import com.dam.chari.a04_insercion_edicion.adapters.MyPizarraRecyclerViewAdapter;
import com.dam.chari.a04_insercion_edicion.interfaz.OnPizarraInteractionListener;
import com.dam.chari.a04_insercion_edicion.models.Pizarra;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class PizarraFragment extends Fragment {
    private OnPizarraInteractionListener mListener;
    RealmResults<Pizarra> pizarrasList;
    Realm realm;


    public PizarraFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        realm = Realm.getDefaultInstance();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pizarra_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;

            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            //lista de pizarra
            pizarrasList = realm.where(Pizarra.class).findAll();
            recyclerView.setAdapter(new MyPizarraRecyclerViewAdapter(getActivity(),pizarrasList, mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnPizarraInteractionListener) {
            mListener = (OnPizarraInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
