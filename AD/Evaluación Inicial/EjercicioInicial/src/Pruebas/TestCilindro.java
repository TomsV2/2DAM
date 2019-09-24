package Pruebas;

import Clases.Cilindro;
import Clases.Circulo;
import Clases.Punto;

public class TestCilindro {

    public static void main(String[] args) {

        //Test distancia =-=-=-= Resultado: √37
        /*Punto punto1 = new Punto(-3, 0);
        Punto punto2 = new Punto(-4, 6);

        System.out.println(punto1.distancia(punto2));*/

        //Constructores
        Punto centroBase = new Punto(3.0, 5.0);
        Circulo base = new Circulo(centroBase, 4.0);
        Cilindro miCilindro = new Cilindro(base, 10.0);

        //Vemos los datos del cilindro
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(miCilindro);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        //Vemos que las coordenadas del cilindro se han cambiado con el método trasladar
        miCilindro.trasladar(2.0, 2.0);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(miCilindro);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println(new Cilindro(new Circulo(new Punto(3.0, 5.0), 4.0),10.0));
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");

        System.out.println(centroBase);
    }
}
