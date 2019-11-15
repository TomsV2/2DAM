package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Principal {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		String comando = "java -jar ./src/EjecutarSumaCifras.jar";
		Process p = null;
		
		try {
			//Ejecutamos el comando para arrancar el programa
			p = r.exec(comando); //Ejecutamos el comando para arrancar el programa
			
			//Preparamos las tuberias de salida
			OutputStream os = p.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			
			//Preparamos las tuberias de entrada de las lineas del programa
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			//Preparamos la tuberia que recibe el numero escrito por el usuario en la terminal
			BufferedReader brnumero = new BufferedReader(new InputStreamReader(System.in));
			
			String linea;

			//Leemos las lineas que muestra el programa
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				//El usuario escribe el numero cuando se requiera
				pw.println(brnumero.readLine());
				//Limpiamos el Buffer y cerramos el flujo
				pw.flush();
			}
			pw.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//En este bloque detectamos los errores que puedan salir en la ejecucion del programa
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
		
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de salida: " + exitVal);
		} catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	
	}

}
