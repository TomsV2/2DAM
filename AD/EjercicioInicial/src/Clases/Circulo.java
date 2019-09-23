package Clases;

public class Circulo {

    //Atributos
    private double x;
    private double y;

    //Constructor por defecto
    public Carta(){
        x = "";
        y = "";
    }

    //Constructor con parámetros
    public Carta(String valor, String palo){
        this.valor = valor;
        this.palo = palo;
    }

    //Gets
    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }

    //Métodos sobrescritos
    @Override
    public String toString () {

        String s = getValor() +" de " +getPalo();

        return s;
    }

}
