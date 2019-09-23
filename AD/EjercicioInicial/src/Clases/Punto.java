package Clases;

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

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "(" +x() +"," +y() +")";

        return s;
    }

}
