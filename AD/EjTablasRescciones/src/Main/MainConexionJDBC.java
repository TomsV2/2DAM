package Main;

import Gestora.GestoraConexionJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainConexionJDBC {
	public static void main(String[] args) {
		
		try {
			GestoraConexionJDBC gestora = new GestoraConexionJDBC();
			Connection conexion = null;
			ResultSet resul = null;
			
			//Llamadas a las conexiones
			conexion = gestora.conectarSQLite();
			
			if(conexion != null){
				System.out.println("Conectado.\n");
			}
			
			//Llamada a la consulta y mostrar resultado por pantalla.
			while(gestora.consultar(conexion).next()){
				System.out.printf("%d, %s, %s, %d", resul.getInt(1), resul.getString(2), resul.getString(3), resul.getInt(4));
			}
			
			//Cerramos las conexiones
			gestora.cerrarConexion(conexion, resul);
			
			resul.close();
			conexion.close();
		}
		catch(Exception ex) {
			System.out.println("Error " +ex.getMessage());
		}
		
	}
}
