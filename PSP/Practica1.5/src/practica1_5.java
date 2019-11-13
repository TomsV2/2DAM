import java.io.*;

public class practica1_5 {
    public static void main(String[] args)  {
        Runtime r = Runtime.getRuntime();
        String comando = "CMD /C tasklist /fi \"imagename eq svchost.exe\" /svc";
        Process p=null;

        File fichero = new File("src/Ficheros/SVCHOST.txt");

        try{
            FileOutputStream fos = new FileOutputStream(fichero);
            PrintWriter pw = new PrintWriter(fos);

            p = r.exec(comando);

            InputStream is = p.getInputStream();
            BufferedReader br = new BufferedReader (new InputStreamReader (is));
            String linea;

            while((linea = br.readLine())!=null){
                pw.println(linea);
            }
            br.close();
            pw.close();
        }
        catch (Exception e)  { e.printStackTrace(); }

        // COMPROBACION DE ERROR  0 bien 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
