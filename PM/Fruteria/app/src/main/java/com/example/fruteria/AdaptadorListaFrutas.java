package com.example.fruteria;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class AdaptadorListaFrutas extends ArrayAdapter<Fruta> {
    public AdaptadorListaFrutas(@NonNull Context context, int resource, @NonNull List<Fruta> objects) {
        super(context, resource, objects);
    }
}
