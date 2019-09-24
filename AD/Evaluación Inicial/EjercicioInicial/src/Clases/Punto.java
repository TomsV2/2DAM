package Clases;

import java.sql.SQLOutput;

public class Punto {

    //Atributos
    private double x;
    private double y;

    //Constructor por defecto
    public Punto(){
        x = 0;
        y = 0;
    }

    //Constructor con parámetros
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Gets
    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    //Sets
    public void x(double a){
        this.x = a;
    }

    public void y(double b){
        this.y = b;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "(" +x +"," +y +")";

        return s;
    }

    //Métodos añadidos
    public double distancia(Punto p){
        return Math.sqrt((Math.abs(x-p.x) * Math.abs(x-p.x)) + (Math.abs(y-p.y) * Math.abs(y-p.y)));
    }

    public void trasladar(double a, double b){
        x += a;
        y += b;
    }

}
