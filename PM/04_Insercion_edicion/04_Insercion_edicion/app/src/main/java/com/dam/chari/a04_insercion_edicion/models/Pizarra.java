package com.dam.chari.a04_insercion_edicion.models;

import com.dam.chari.a04_insercion_edicion.app.MyApp;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Pizarra extends RealmObject {
public static final String PIZARRA_ID = "id";
public static final String PIZARRA_TITULO = "titulo";
public static final String PIZARRA_CREADA = "fecha";
public static final String PIZARRA_NOTAS = "notas";

    @PrimaryKey
    private int id;
    @Required
    private String titulo;
    @Required
    private Date creada;

    private RealmList<Notas> notas;

    public Pizarra() {
        this.id= MyApp.PizarraID.incrementAndGet();
    }

    public Pizarra(String titulo) {
        this.id= MyApp.PizarraID.incrementAndGet();
        this.titulo=titulo;
        this.creada=new Date();
        this.notas = new RealmList<Notas>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getCreada() {
        return creada;
    }

    public RealmList<Notas> getNotas() {
        return notas;
    }

}
