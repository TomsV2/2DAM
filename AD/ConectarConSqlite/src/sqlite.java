import java.sql.*;

public class sqlite {

	public static void main(String[] args) {
		
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\empleados.db");
			
			if(conexion != null){
				System.out.println("Conectado.");
			}
			
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM empleado";
			ResultSet resul = sentencia.executeQuery(sql);
			
			while(resul.next()){
				System.out.printf("%d, %s, %s, %d", resul.getInt(1), resul.getString(2), resul.getString(3), resul.getInt(4));
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
