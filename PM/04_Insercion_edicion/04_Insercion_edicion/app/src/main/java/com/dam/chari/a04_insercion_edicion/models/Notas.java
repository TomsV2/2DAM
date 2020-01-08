package com.dam.chari.a04_insercion_edicion.models;


import com.dam.chari.a04_insercion_edicion.app.MyApp;

import java.util.Date;

import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Notas extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String descripcion;
    @Required
    private Date creada;

    public Notas(){
        this.id = MyApp.NotasID.incrementAndGet();
    }

    public Notas(String descripcion) {
        this.id = MyApp.NotasID.incrementAndGet();
        this.descripcion=descripcion;
        this.creada = new Date();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getCreada() {
        return creada;
    }

}
