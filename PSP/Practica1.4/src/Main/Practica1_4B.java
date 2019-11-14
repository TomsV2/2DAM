package Main;

import java.io.*;

public class Practica1_4B {
	public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();

        //String comando = "CMD /C java -jar C:\\Users\\Familia\\Desktop\\GitHub\\2DAM\\PSP\\Practica1.4\\src\\ArchivosJar\\Ejemplo2.jar";
        String comando = "CMD /C java -jar C:\\Users\\Familia\\Desktop\\GitHub\\2DAM\\PSP\\Practica1.4\\src\\ArchivosJar\\PedirMostrarNombre.jar";

        Process p = null;

        try{
        	p = r.exec(comando);
        	InputStream is = p.getInputStream();
        	//FileOutputStream fos = new FileOutputStream();
       	 	//PrintWriter pw = new PrintWriter(fos);
         	 
         	 //Interceptamos la salida del proceso con InputStream para leerla
            //InputStream is = p.getInputStream();
       	 BufferedReader br = new BufferedReader (new InputStreamReader (is));
            String linea;
            
            //Leemos la salida de Unsaludo
       	 while((linea = br.readLine())!=null) 
       	 {
              System.out.println("INSERTO EN "+args[0]+" > "+linea);
              //pw.println(linea); //la inserta en el fichero
       	 }
       	 br.close();
       	 //pw.close();
          } 
          catch (Exception e)  { e.printStackTrace(); }


     // COMPROBACION DE ERROR  0 bien 1 mal
        int exitVal;
        
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        }
        catch (InterruptedException e) {
        	e.printStackTrace();
        }

		System.out.println("****************************");
    }
}
