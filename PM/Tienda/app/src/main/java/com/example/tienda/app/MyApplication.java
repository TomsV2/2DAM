package com.example.tienda.app;

import android.app.Application;

import com.example.tienda.models.Carrito;
import com.example.tienda.models.Ropa;

import java.util.concurrent.atomic.AtomicInteger;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.RealmResults;

public class MyApplication extends Application {

    public static AtomicInteger CarritoID = new AtomicInteger();
    public static AtomicInteger RopaID = new AtomicInteger();
    public static AtomicInteger ArmaID = new AtomicInteger();

    @Override
    public void onCreate() {
        super.onCreate();
        initRealm();
        Realm realm = Realm.getDefaultInstance();
        CarritoID = getIdByTable(realm, Carrito.class);
        RopaID = getIdByTable(realm, Ropa.class);
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

    private <T extends RealmObject> AtomicInteger getIdByTable(Realm realm, Class<T> anyClass){
        RealmResults<T> results = realm.where(anyClass).findAll();
        return (results.size() > 0) ? new AtomicInteger(results.max("id").intValue()) : new AtomicInteger();
    }

}
