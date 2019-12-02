package Main;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class MainProyectoAD {
    public static void main(String [] args){

        String palabra = "Palabra";
        int posicionLetra = 0;

        HashMap<String, Integer> diccionario = new HashMap<>();

        ArrayList<String> letras = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();

        for(int i=0; i<palabra.length(); i++){

            String letra = String.valueOf(palabra.charAt(i));

            System.out.println(letra);

            if( letras.contains(letra) == false ) {
                letras.add(letra);
                cantidades.add(1);
            }
            else{
                posicionLetra = letras.indexOf(letra);
                cantidades.set( posicionLetra, cantidades.get(posicionLetra)+1 );
            }
        }

        System.out.println();

        for(String letra:letras){
            System.out.println(letra);
        }
        System.out.println();
        for(Integer cantidad:cantidades){
            System.out.println(cantidad);
        }

        int n = cantidades.size();
        int auxCantidades = 0;
        String auxLetras = " ";

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(cantidades.get(j-1) > cantidades.get(j)){

                    //Intercambiar elementos
                    auxCantidades = cantidades.get(j-1);
                    auxLetras = letras.get(j-1);

                    cantidades.set(j-1, cantidades.get(j));
                    letras.set(j-1, letras.get(j));

                    cantidades.set(j, auxCantidades);
                    letras.set(j, auxLetras);

                }
            }
        }

        System.out.println();

        for(String letra:letras){
            System.out.println(letra);
        }
        System.out.println();
        for(Integer cantidad:cantidades){
            System.out.println(cantidad);
        }

        File fichero = new File("src/Ficheros/binario.txt");

    }
}
