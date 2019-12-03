package Gestoras;

import java.io.*;
import java.util.ArrayList;

public class GestoraProyectoAD {

    public String encriptar(String texto, String [][] tablaNunez, ArrayList<String> arrayLetras){

        String textoBinario = "";

        for(char dato:texto.toCharArray()){
            System.out.print(dato);
            //System.out.println(arrayLetras.indexOf(String.valueOf(dato)));
            int posicionDato = arrayLetras.indexOf(String.valueOf(dato));

            for(int j=0; j<=tablaNunez[posicionDato].length-1; j++){
                if(!tablaNunez[posicionDato][j].equals(" ")) {
                    textoBinario = textoBinario + tablaNunez[posicionDato][j];
                }
            }
            System.out.println();
        }

        /*for(int i=0; i<=tablaNunez.length-1; i++){ //Cantidad de filas

            //textoBinario = "";

            for(int j=0; j<=tablaNunez[i].length-1; j++){   //Cantidad de columnas en la fila i
                if(!tablaNunez[i][j].equals(" ")){
                    textoBinario = textoBinario + tablaNunez[i][j];
                }
            }
        }*/

        return textoBinario;
    }

    public void cargarArrays(String texto, ArrayList<String> arrayLetras, ArrayList<Integer> arrayCantidades){

        int posicionLetra;

        for(int i=0; i<texto.length(); i++){

            String letra = String.valueOf(texto.charAt(i));

            //System.out.println(letra);

            if( arrayLetras.contains(letra) == false ) {
                arrayLetras.add(letra);
                arrayCantidades.add(1);
            }
            else{
                posicionLetra = arrayLetras.indexOf(letra);
                arrayCantidades.set( posicionLetra, arrayCantidades.get(posicionLetra)+1 );
            }
        }
    }

    public String crearTraductor(ArrayList arrayLetras){

        int paresBinarios;

        if(arrayLetras.size()%2==0){
            paresBinarios = arrayLetras.size();
        }
        else{
            paresBinarios = arrayLetras.size()+1;
        }

        String [][] tablaNunez = new String[arrayLetras.size()][paresBinarios];

        for(int i=0; i<=arrayLetras.size()-1; i++){
            for(int j=0; j<=paresBinarios-1; j++){
                tablaNunez[i][j] = " ";
            }
        }


        int intervalo = 1;
        int c = 1;
        boolean banderaNumero;

        for(int j=0; j<=paresBinarios-1; j++){

            banderaNumero = true;

            if(j%2==0){
                for(int i=0; i<=arrayLetras.size()-1; i++){

                    if(banderaNumero == true){
                        if(c <= intervalo){
                            tablaNunez[i][j] = "0";

                            c++;

                            if(c>intervalo){
                                banderaNumero = false;
                                c = 1;
                            }
                        }
                    }
                    else{
                        if(c <= intervalo){
                            c++;

                            if(c>intervalo){
                                banderaNumero = true;
                                c = 1;
                            }
                        }
                    }

                }
            }
            else{
                c = 1;
                for(int i=intervalo; i<=arrayLetras.size()-1; i++){

                    if(banderaNumero == true){
                        if(c <= intervalo){
                            tablaNunez[i][j] = "1";

                            c++;

                            if(c>intervalo){
                                banderaNumero = false;
                                c = 1;
                            }
                        }
                    }
                    else{
                        if(c <= intervalo){
                            c++;

                            if(c>intervalo){
                                banderaNumero = true;
                                c = 1;
                            }
                        }
                    }

                }
                intervalo++;
                c = 1;
            }
        }

        String cifradoBinario = "";

        for(int i=0; i<=arrayLetras.size()-1; i++){

            cifradoBinario = cifradoBinario + arrayLetras.get(i);

            //System.out.print(arrayLetras.get(i));

            for(int j=0; j<=paresBinarios-1; j++){
                if(!tablaNunez[i][j].equals(" ")){
                    cifradoBinario = cifradoBinario + tablaNunez[i][j];
                }
            }

            //System.out.print(cifradoBinario);
        }
        return cifradoBinario;
    }

    public String[][] crearTabla(ArrayList arrayLetras){

        int paresBinarios;

        if(arrayLetras.size()%2==0){
            paresBinarios = arrayLetras.size();
        }
        else{
            paresBinarios = arrayLetras.size()+1;
        }

        String [][] tablaNunez = new String[arrayLetras.size()][paresBinarios];

        for(int i=0; i<=arrayLetras.size()-1; i++){
            for(int j=0; j<=paresBinarios-1; j++){
                tablaNunez[i][j] = " ";
            }
        }


        int intervalo = 1;
        int c = 1;
        boolean banderaNumero;

        for(int j=0; j<=paresBinarios-1; j++){

            banderaNumero = true;

            if(j%2==0){
                for(int i=0; i<=arrayLetras.size()-1; i++){

                    if(banderaNumero == true){
                        if(c <= intervalo){
                            tablaNunez[i][j] = "0";

                            c++;

                            if(c>intervalo){
                                banderaNumero = false;
                                c = 1;
                            }
                        }
                    }
                    else{
                        if(c <= intervalo){
                            c++;

                            if(c>intervalo){
                                banderaNumero = true;
                                c = 1;
                            }
                        }
                    }

                }
            }
            else{
                c = 1;
                for(int i=intervalo; i<=arrayLetras.size()-1; i++){

                    if(banderaNumero == true){
                        if(c <= intervalo){
                            tablaNunez[i][j] = "1";

                            c++;

                            if(c>intervalo){
                                banderaNumero = false;
                                c = 1;
                            }
                        }
                    }
                    else{
                        if(c <= intervalo){
                            c++;

                            if(c>intervalo){
                                banderaNumero = true;
                                c = 1;
                            }
                        }
                    }

                }
                intervalo++;
                c = 1;
            }
        }

        /*for(int i=0; i<=letras.size()-1; i++){
            for(int j=0; j<=paresBinarios-1; j++){
                System.out.print(tablaNunez[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();*/

        String cifradoBinario;

        for(int i=0; i<=arrayLetras.size()-1; i++){

            cifradoBinario = "";

            System.out.print(arrayLetras.get(i) +":");

            for(int j=0; j<=paresBinarios-1; j++){
                if(!tablaNunez[i][j].equals(" ")){
                    cifradoBinario = cifradoBinario + tablaNunez[i][j];
                }
            }

            System.out.print(cifradoBinario);
            System.out.print(".");
        }
        return tablaNunez;
    }

    public void MetodoBurbuja(ArrayList<String> arrayLetras, ArrayList<Integer> arrayCantidades){

        int n = arrayCantidades.size();
        int auxCantidades = 0;
        String auxLetras = "";

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arrayCantidades.get(j-1) > arrayCantidades.get(j)){

                    //Intercambiar elementos
                    auxCantidades = arrayCantidades.get(j-1);
                    auxLetras = arrayLetras.get(j-1);

                    arrayCantidades.set(j-1, arrayCantidades.get(j));
                    arrayLetras.set(j-1, arrayLetras.get(j));

                    arrayCantidades.set(j, auxCantidades);
                    arrayLetras.set(j, auxLetras);

                }
            }
        }

        //return arrayLetras;
    }

    public String LeerFichero(){

        String texto = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/Ficheros/Texto.txt"));

            String linea = br.readLine();

            while (linea != null) {
                texto = texto+linea;

                linea = br.readLine();
            }

            br.close();

            //System.out.println(texto);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return texto;
    }

    public byte[] getBytesFromFile(String texto) throws IOException {
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
}
