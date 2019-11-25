import java.sql.*;

public class MainEjProcedimientos {

	public static void main(String[] args) {
		
		
		
		try {
			//Conectamos con la base de datos
			Connection conexion = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmpleadosCHECK.db");
			//DatabaseMetaData dbmd = conexion.getMetaData();
	
			if(conexion != null){
				System.out.println("Conectado.\n");
			}
			
		}
		catch(Exception ex) {
			System.out.println("Error " +ex.getMessage());
		}

	}

}
