package com.example.tienda.models;

import com.example.tienda.app.MyApplication;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Ropa extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String nombre;
    @Required
    private String talla;
    @Required
    private String newtons;

    public Ropa(){

    }

    public Ropa(String nombre, String talla, String newtons){
        this.id = MyApplication.RopaID.incrementAndGet();
        this.nombre = nombre;
        this.talla = talla;
        this.newtons = newtons;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getNewtons() {
        return newtons;
    }

    public void setNewtons(String newtons) {
        this.newtons = newtons;
    }
}
