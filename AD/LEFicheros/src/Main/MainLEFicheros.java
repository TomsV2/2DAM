package Main;

import java.io.*;

public class MainLEFicheros {
    public static void main(String[] args){

        try{
            //Inicializaciones
            BufferedReader br = new BufferedReader(new FileReader("src/Ficheros/ficheroTexto.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/Ficheros/ficheroTexto.txt"));

            //Declaraciones de variables
            String linea = "";

            //Mientras no sea fin de fichero
            while (linea != null) {

                //Si la linea es un String vacio (Este if es solo para no tener el valor por defecto de String linea)
                if(!linea.equals("")){
                    System.out.println(linea);
                }

                //Leer línea
                linea = br.readLine();
            }
            //Fin_Mientras

            if(linea == null){

            }

            br.close();

            bw.write("El archivo ha sido leído.");

            bw.close();

        }
        catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
