package Clases;

public class Circulo extends Punto {

    //Atributos
    private double radio;
    private Punto centro;

    //Constructor por defecto
    public Circulo(){
        radio = 1;
        centro = new Punto();
    }

    //Constructor con parámetros
    public Circulo(Punto p, double r){
        this.radio = r;
        this.centro = p;
    }

    //Gets
    public double radio() {
        return radio;
    }

    public Punto centro() {
        return centro;
    }

    //Sets
    public void radio(double r){
        this.radio = r;
    }

    public void centro(Punto p){
        this.centro = p;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "\n\tRadio:  " +radio +
                   "\n\tCentro: " +centro.toString();

        return s;
    }

    //Métodos añadidos
    public void trasladar(double a, double b) {
        centro.trasladar(a, b);
    }

}
