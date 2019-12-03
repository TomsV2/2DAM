package Main;

import Gestoras.GestoraProyectoAD;

import java.io.*;
import java.util.ArrayList;


public class MainProyectoAD {



    public static void main(String [] args){

        //Declaraciones de variables
        int posicionLetra;
        String texto = "";
        int paresBinarios;
        String traductor = "";

        //Inicializaciones
        GestoraProyectoAD gestora = new GestoraProyectoAD();

        File ficheroEncriptado = new File("src/Ficheros/x.txt");
        File ficheroTraductor = new File("src/Ficheros/traductor.txt");

        ArrayList<String> letras = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();

        String[][] tablaNunez;

        //Leer texto del fichero .txt
        texto = gestora.LeerFichero();

        //Cargar arrays
        gestora.cargarArrays(texto, letras, cantidades);

        //Ordenar las palabras por frecuencia (menor a mayor)
        gestora.MetodoBurbuja(letras, cantidades);

        //Crear codificación de las letras del texto
        tablaNunez = gestora.crearTabla(letras);

        System.out.println();

        System.out.println(gestora.encriptar(texto, tablaNunez, letras));

        try {
            ficheroEncriptado.createNewFile();

            FileWriter fw = new FileWriter(ficheroEncriptado.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(gestora.encriptar(texto, tablaNunez, letras).toCharArray());

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ficheroTraductor.createNewFile();

            FileWriter fw = new FileWriter(ficheroTraductor.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(gestora.crearTraductor(letras));

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(traductor);

    }
}

/*
for(String letra:letras){
    System.out.println(letra);
}
System.out.println();
for(Integer cantidad:cantidades){
    System.out.println(cantidad);
}
*/