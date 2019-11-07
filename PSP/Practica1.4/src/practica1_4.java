import java.io.*;

public class practica1_4 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        String comando = "CMD /C java -jar C:\\Users\\alumno\\Desktop\\Github\\2DAM\\PSP\\Ejemplos.jar";

        Process p = null;

        try {
            p = r.exec(comando);
            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader
                    (new InputStreamReader(is));
            String linea;
            while ((linea = br.readLine()) != null)
                // lee una línea del fichero
                System.out.println(linea);
            br.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }


        // COMPROBACION DE ERROR - 0 bien - 1 mal
        int exitVal;

        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + 					exitVal);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("****************************");
    }
}