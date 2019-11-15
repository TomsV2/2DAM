package Main;

import java.io.*;

public class Practica1_4B {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Process p = null;
		
		try {
			p = Runtime.getRuntime().exec("cmd /c java -jar C:\\Users\\alumno\\Desktop\\Github\\2DAM\\PSP\\Practica1.4\\src\\ArchivosJar\\PedirMostrarNombre.jar");
			InputStream is = p.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
			/*OutputStream os = p.getOutputStream();
			os.write((reader.readLine() + "\n").getBytes());
			os.flush();
			os.close();*/

			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
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
