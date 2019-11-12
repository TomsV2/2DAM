import java.sql.*;

public class sqlite {
	
	public static void main(String[] args) {

		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmpleadosCHECK.db");
			DatabaseMetaData dbmd = conexion.getMetaData();
			
			if(conexion != null){
				System.out.println("Conectado.\n");
			}
			
			ResultSet columnas = dbmd.getColumns(null, null, "empleado", null);
			ResultSet pk = dbmd.getPrimaryKeys(null, null, "empleado");
			ResultSet fk = dbmd.getExportedKeys(null, null, "empleado");
			
			String nombre = dbmd.getDatabaseProductName();
			String driver = dbmd.getDriverName();
			String url = dbmd.getURL();
			String usuario = dbmd.getUserName();
			
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM empleado";
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
				
				System.out.printf("Columna: %s\n"
						        + "Tipo: %s", nombreColumna, tipoColumna);
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
			while(pk.next()) {
				String fkEmpleado = fk.getString("COLUMN_NAME");
				
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
