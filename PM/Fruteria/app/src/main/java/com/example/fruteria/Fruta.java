package com.example.fruteria;

public class Fruta {

    //Atributos
    private String nombre;
    private String origen;
    private int urlFoto;

    //Constructor por defecto
    public Fruta() {
    }

    //Constructor por parámetros
    public Fruta(String nombre, String origen, int urlFoto) {
        this.nombre = nombre;
        this.origen = origen;
        this.urlFoto = urlFoto;
    }


    //GETs
    public String getNombre() {
        return nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public int getUrlFoto() {
        return urlFoto;
    }

    //SETs
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setUrlFoto(int urlFoto) {
        this.urlFoto = urlFoto;
    }
}
