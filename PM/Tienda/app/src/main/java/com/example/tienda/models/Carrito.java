package com.example.tienda.models;

import com.example.tienda.app.MyApplication;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Carrito extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String comprador;
    @Required
    private Date createdAt;

    private RealmList<Ropa> ropas;

    public Carrito (String comprador){
        this.id = MyApplication.CarritoID.incrementAndGet();
        this.comprador = comprador;
        this.createdAt = new Date();
        this.ropas = new RealmList<>();

    }

    public int getId() {
        return id;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public RealmList<Ropa> getRopas() {
        return ropas;
    }

}
