package Main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MainExtra {

    public static boolean esPrimo(int numero){

        //Para que un número 'x' sea primo solo puede ser divisible entre 1 y ese mismo número 'x'

        //Declaración de variables
        boolean resultado = false;

        int contadorDivisibles = 0;

        //Incio
            //Calcular cantidad de numeros divisibles
            for(int i=1; i<=numero; i++){
                if(numero%i == 0){
                    contadorDivisibles++;
                }
            }

            //Si es divisible por dos numeros
            if(contadorDivisibles == 2){
                resultado = true;
            }
        //Fin

        return resultado;
    }

    public static void main(String[] args){

        //Declaraciones de variables
        boolean todoOk = true;

        try{
            //Escribir en un nuevo fichero primos.dat
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Ficheros/primos.dat"));

            //Miramos los números del 1 al 500
            for(int i=1; i<=500; i++){

                //Si el numero es primo
                if(esPrimo(i)){

                    //Imprimir por pantalla el número
                    //System.out.print(i +"\n");    //He utilizado un "\n" porque los ficheros no detectan el salto de línea con el .println()

                    //Escribimos en el fichero el numero haciendo un casting a String
                    bw.write(Integer.toString(i));

                    //Insertamos una nueva línea para es cribir el siguiente número en una línea nueva
                    bw.newLine();
                }
            }

            bw.close();
        }
        catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero");
        }
        catch (IOException e){
            System.out.println("No se ha podido escribir en el fichero");
        }

        System.out.println("\nSe ha escrito su fichero con exito.");

    }
}
