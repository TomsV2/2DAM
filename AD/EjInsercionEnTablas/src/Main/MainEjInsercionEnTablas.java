package Main;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainEjInsercionEnTablas {
	public static void main(String[] args) {

		Connection conexion = null;
		
		try {
			//conexion = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmpleadosCHECK.db");
			conexion = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\InsecionTablas.db");
			DatabaseMetaData dbmd = conexion.getMetaData();
			
			if(conexion != null){
				System.out.println("Conectado.\n");
			}
			
			ResultSet columnas = dbmd.getColumns(null, null, "Empleado", null);
			ResultSet pk = dbmd.getPrimaryKeys(null, null, "Empleado");
			ResultSet fk = dbmd.getImportedKeys(null, null, "Empleado");
			
			String nombre = dbmd.getDatabaseProductName();
			String driver = dbmd.getDriverName();
			String url = dbmd.getURL();
			String usuario = dbmd.getUserName();
			
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM Empleado";
			ResultSet resul = sentencia.executeQuery(sql);
			
			System.out.println("o---------------------------o");
			System.out.println("| DATOS DE LA BASE DE DATOS |");
			System.out.println("o---------------------------o");
			System.out.printf("Nombre : %s %n", nombre);
			System.out.printf("Driver : %s %n", driver);
			System.out.printf("URL    : %s %n", url);
			System.out.printf("Usuario: %s %n", usuario);
			
			System.out.println("");
			
			System.out.println("o--------------------------------o");
			System.out.println("| EMPLEADOS DE LA TABLA EMPLEADO |");
			System.out.println("o--------------------------------o");
			while(resul.next()){
				System.out.printf("%d, %s, %s, %d \n", resul.getInt(1), resul.getString(2), resul.getString(3), resul.getInt(4));
			}
			
			System.out.println("");
			
			System.out.println("o----------------------------------o");
			System.out.println("| INFORMACIÓN DE LA TABLA EMPLEADO |");
			System.out.println("o----------------------------------o");
			while(columnas.next()) {
				String nombreColumna = columnas.getString("COLUMN_NAME");
				String tipoColumna = columnas.getString("TYPE_NAME");
				
				System.out.printf("Columna: %s\t\t"
						        + "Tipo: %s\n", nombreColumna, tipoColumna);
			}
			
			System.out.println("\n");
			
			System.out.println("o---------------------o");
			System.out.println("| INFORMACIÓN PK y FK |");
			System.out.println("o---------------------o");
			System.out.println("Clave primaria:");
			while(pk.next()) {
				String pkEmpleado = pk.getString("COLUMN_NAME");
				
				System.out.println("\t- " +pkEmpleado);
			}
			
			System.out.println("\nClave foranea:");
			while(fk.next()) {
				String fkEmpleado = fk.getString("PKTABLE_NAME");
				
				System.out.println("\t- " +fkEmpleado);
			}
			
			resul.close();
			sentencia.close();
			conexion.close();
			
		}
		catch(Exception ex) {
			System.out.println("Error " +ex.getMessage());
		}
		
	}
}
