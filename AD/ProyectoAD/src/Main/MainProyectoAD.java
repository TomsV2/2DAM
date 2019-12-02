package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class MainProyectoAD {

    public static byte[] getBytesFromFile(String texto) throws IOException {
        long length = texto.length();

        if (length > Integer.MAX_VALUE) {
            throw new IOException("El archivo es kilometrico!!! Intente uno mas chico.");
        }

        byte[] bytes = new byte[(int)length];
        int offset = 0;
        int numRead = 0;

        texto.getBytes();

        InputStream is = new FileInputStream(texto);
        try {
            while (offset < bytes.length
                    && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
                offset += numRead;
            }
        } finally {
            is.close();
        }

        return bytes;
    }

    public static void main(String [] args){

        int posicionLetra = 0;
        String texto = "";

        File ficheroBin = new File("src/Ficheros/binario.bin");
        File txt = new File("src/Ficheros/Texto.txt");

        ArrayList<String> letras = new ArrayList<String>();
        ArrayList<Integer> cantidades = new ArrayList<Integer>();

        //Leer texto del fichero .txt
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Ficheros/Texto.txt"));

            String linea = br.readLine();

            while (linea != null) {
                texto = texto+linea;

                linea = br.readLine();
            }

            br.close();

            System.out.println(texto);

        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int i=0; i<texto.length(); i++){

            String letra = String.valueOf(texto.charAt(i));

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



    }
}
