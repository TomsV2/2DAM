package com.dam.chari.a04_insercion_edicion.app;

import android.app.Application;

import com.dam.chari.a04_insercion_edicion.models.Notas;
import com.dam.chari.a04_insercion_edicion.models.Pizarra;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

import static io.realm.RealmConfiguration.*;

public class MyApp extends Application {

    public static AtomicInteger PizarraID = new AtomicInteger();
    public static AtomicInteger NotasID = new AtomicInteger();
    @Override
    public void onCreate() {
        super.onCreate();
        initRealm();
        Realm realm = Realm.getDefaultInstance();
        PizarraID = getIdByTabla(realm, Pizarra.class);
        NotasID = getIdByTabla(realm, Notas.class);
        realm.close();
    }

    private void initRealm() {
        Realm.init(getApplicationContext());
        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }

    private <T extends RealmObject> AtomicInteger getIdByTabla(Realm realm, Class<T> anyClass){
        RealmResults<T> resultados = realm.where(anyClass).findAll();
        return (resultados.size() > 0)? new AtomicInteger(resultados.max("id").intValue()): new AtomicInteger();

    }

}
