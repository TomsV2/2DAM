package Main;

import java.io.File;

public class MainApartadoA {
    public static void main(String[] args){

        //Inicializaciones
        File directorio = new File("src/Ficheros");

        for(File nombreFichero: directorio.listFiles()){
            System.out.println(nombreFichero.getName());
        }

    }
}
