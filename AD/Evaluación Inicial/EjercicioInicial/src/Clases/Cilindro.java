package Clases;

public class Cilindro extends Circulo {

    //Atributos
    private double altura;
    private Circulo base;

    //Constructor por defecto
    public Cilindro(){
        altura = 1;
        base = new Cilindro();
    }

    //Constructor con parámetros
    public Cilindro(Circulo b, double a){
        this.altura = a;
        this.base = b;
    }

    //Gets
    public double altura() {
        return altura;
    }

    public Circulo base() {
        return base;
    }

    //Sets
    public void altura(double a){
        this.altura = a;
    }

    public void base(Circulo b){
        this.base = b;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = "Altura:  " +altura +
                   "\nBase:    " +base.toString();

        return s;
    }

    //Métodos añadidos
    public void trasladar(double a, double b) {
        base.trasladar(a, b);
    }

}
