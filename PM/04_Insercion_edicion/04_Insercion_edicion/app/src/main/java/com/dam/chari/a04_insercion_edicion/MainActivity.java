package com.dam.chari.a04_insercion_edicion;

import android.os.Bundle;

import com.dam.chari.a04_insercion_edicion.fragments.EditPizarraDialogFragment;
import com.dam.chari.a04_insercion_edicion.fragments.NuevaPizarraDialogo;
import com.dam.chari.a04_insercion_edicion.interfaz.OnNuevaPizarraListener;
import com.dam.chari.a04_insercion_edicion.interfaz.OnPizarraInteractionListener;
import com.dam.chari.a04_insercion_edicion.models.Pizarra;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import io.realm.Realm;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnNuevaPizarraListener , OnPizarraInteractionListener{
DialogFragment dialogoNuevaPizarra, dialogEditPizarra;
Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogoNuevaPizarra = new NuevaPizarraDialogo();
                dialogoNuevaPizarra.show(getSupportFragmentManager(),"Nueva Pizarra Dialogo");
            }
        });

        realm = Realm.getDefaultInstance();
    }





    @Override
    public void onPizarraClick(Pizarra pizarra) {

    }

    @Override
    public void onPizarraEdit(Pizarra pizarra) {
        //Con esto se lanza un dialogo para editar una pizarra y
        //se lanzaría y ya se haría el código programado
        dialogEditPizarra = EditPizarraDialogFragment.newInstance(pizarra.getId(),pizarra.getTitulo(),pizarra.getCreada(),pizarra.getNotas());
        dialogEditPizarra.show(getSupportFragmentManager(),"EditAveriaDialog");
    }

    @Override
    public void onPizarraGuardaClickListener(final String titulo) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Pizarra nuevaPizarra = new Pizarra(titulo);
                realm.copyToRealm(nuevaPizarra);
            }
        });
    }

    @Override
    public void onPizarraActualizarCLicListener(final int id, final String titulo) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                Pizarra nuevaPizarra = new Pizarra(titulo);
                nuevaPizarra.setId(id);
                realm.copyToRealmOrUpdate(nuevaPizarra);
            }
        });
    }
}
