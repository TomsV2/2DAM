package com.example.fruteria;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdaptadorListaFrutas extends ArrayAdapter<Fruta> {
    Context ctx;
    int layoutTemplate;
    List<Fruta> listFruta;

    public AdaptadorListaFrutas(@NonNull Context context, int resource, @NonNull List<Fruta> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.layoutTemplate = resource;
        this.listFruta = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        Fruta elementoActual = listFruta.get(position);

        TextView tv_NombreFruta = (TextView) v.findViewById(R.id.tv_NombreFruta);
        TextView tv_OrigenFruta = (TextView) v.findViewById(R.id.tv_OrigenFruta);
        ImageView imagenFruta = (ImageView) v.findViewById(R.id.imagenFruta);

        tv_NombreFruta.setText(elementoActual.getNombre());
        tv_OrigenFruta.setText(elementoActual.getOrigen());

            Glide.with(ctx)
                    .load(elementoActual.getUrlFoto())
                    .into(imagenFruta);

        return v;
    }
}
