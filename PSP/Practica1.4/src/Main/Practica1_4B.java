package Main;

import java.io.*;

public class Practica1_4B {
	public static void main(String[] args) {

		
		Process p = null;
		
		try {
			p = Runtime.getRuntime().exec("cmd /c java -jar .\\src\\ArchivosJar\\PedirMostrarNombre.jar");
			
			//Preparamos la salida
			OutputStream os = p.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			
			//Preparamos la entrada de las lineas del programa
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//Preparamos la entrada de datos por teclado
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String linea;
			
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			
				//os.write((reader.readLine() + "\n").getBytes());
				pw.println(reader.readLine());
				pw.flush();
			}
			
			//os.close();
			pw.close();
			
			/*is.close();
			br.close();
			
			reader.close();*/
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Detectamos los fallos que puedan aparecer en la ejecución
		try {
			InputStream err = p.getInputStream();
			BufferedReader brerr = new BufferedReader(new InputStreamReader(err));
			String linea;
			while ((linea = brerr.readLine()) != null) {
				System.out.println(linea);
			}
			brerr.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
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
