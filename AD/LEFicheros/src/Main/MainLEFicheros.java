package Main;

import java.io.*;
import java.util.ArrayList;

public class MainLEFicheros {
    public static void main(String[] args){

        try{
            //Inicializaciones
            File fichero = new File("src/Ficheros/ficheroTexto.txt");
            FileWriter fw = new FileWriter(fichero.getAbsoluteFile(), true);

            BufferedReader br = new BufferedReader(new FileReader("src/Ficheros/ficheroTexto.txt"));
            BufferedWriter bw = new BufferedWriter(fw);

            //Declaraciones de variables
            String linea = br.readLine();

            while (linea != null) {
                System.out.println(linea);

                linea = br.readLine();
            }

            bw.newLine();
            bw.write("El archivo ha sido leído.");

            br.close();
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
