package com.example.tienda.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Arma extends RealmObject {

    @PrimaryKey
    private int id;
    @Required
    private String estilo;
    @Required
    private String electrica;
    @Required
    private String punio;

    public Arma(){

    }

    public Arma (String estilo, String electrica, String punio){
        this.id = 0;
        this.estilo = estilo;
        this.electrica = electrica;
        this.punio = punio;
    }

    public int getId() {
        return id;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getElectrica() {
        return electrica;
    }

    public void setElectrica(String electrica) {
        this.electrica = electrica;
    }

    public String getPunio() {
        return punio;
    }

    public void setPunio(String punio) {
        this.punio = punio;
    }
}
