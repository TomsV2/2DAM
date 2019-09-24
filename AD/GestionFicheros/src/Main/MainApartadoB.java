package Main;

import java.io.File;

public class MainApartadoB {
    public static void main(String[] args){

        //Inicializaciones
        File directorio = new File(args[0]);

        for(File nombreFichero: directorio.listFiles()){
            System.out.println(nombreFichero.getName());
        }

    }

}
