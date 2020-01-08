package com.dam.chari.a04_insercion_edicion.adapters;

import androidx.recyclerview.widget.RecyclerView;
import io.realm.OrderedRealmCollection;
import io.realm.RealmChangeListener;
import io.realm.RealmList;
import io.realm.RealmObjectChangeListener;
import io.realm.RealmResults;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.dam.chari.a04_insercion_edicion.R;
import com.dam.chari.a04_insercion_edicion.interfaz.OnPizarraInteractionListener;
import com.dam.chari.a04_insercion_edicion.models.Pizarra;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MyPizarraRecyclerViewAdapter extends RecyclerView.Adapter<MyPizarraRecyclerViewAdapter.ViewHolder> {

    private final RealmResults<Pizarra> mValues;
    private final OnPizarraInteractionListener mListener;
    private Context ctx;
    private RealmChangeListener listenerRefresco ;

    public MyPizarraRecyclerViewAdapter(Context context,RealmResults<Pizarra> items, OnPizarraInteractionListener listener) {
        mValues = items;
        mListener = listener;
        ctx = context;
        this.listenerRefresco = new RealmChangeListener<OrderedRealmCollection<Pizarra>>() {
            @Override
            public void onChange(OrderedRealmCollection<Pizarra> result) {
                notifyDataSetChanged();

            }
        };
        if (items != null){
            addListener(items);

        }
    }

    private void addListener(OrderedRealmCollection<Pizarra> items) {
        if (items instanceof RealmResults){
            RealmResults realmResults = (RealmResults) items;
            realmResults.addChangeListener(listenerRefresco);
        }else if (items instanceof RealmList){
            RealmList<Pizarra> list = (RealmList<Pizarra>) items;
            list.addChangeListener((RealmChangeListener)listenerRefresco);
        }else{
            throw new IllegalArgumentException("RealmCollection not supported" +items);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pizarra_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.textViewTitulo.setText(holder.mItem.getTitulo());
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        String createAt = df.format(holder.mItem.getCreada());
        holder.textViewFecha.setText(createAt);
        int numberOfNotes = holder.mItem.getNotas().size();
        String textForNotes = (numberOfNotes==1)?numberOfNotes + " nota": numberOfNotes +" notas";
        holder.textViewNotas.setText(textForNotes);


        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onPizarraClick(holder.mItem);
                }
            }
        });

        holder.imageViewEdit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onPizarraEdit(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView textViewTitulo;
        public final TextView textViewNotas;
        public final TextView textViewFecha;
        public final ImageView imageViewEdit;
        public Pizarra mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            textViewTitulo = (TextView) view.findViewById(R.id.textViewTitulo);
            textViewNotas = (TextView)view.findViewById(R.id.textViewNotas);
            textViewFecha = (TextView) view.findViewById(R.id.textViewDate);
            imageViewEdit = (ImageView) view.findViewById(R.id.imageViewEdit);

        }

        @Override
        public String toString() {
            return super.toString() + " '" + textViewTitulo.getText() + "'";
        }
    }
}
