package Gestora;
import java.sql.*;

public class GestoraConexionJDBC {
		
	//Conexiones
	public Connection conectarSQLite() throws SQLException {
		return DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmpleadosCHECK.db");
	}
	
	//Consulta
	public ResultSet consultar (Connection conexion) throws SQLException{
		Statement sentencia = conexion.createStatement();
		String sql = "SELECT * FROM empleado";
		ResultSet resul = sentencia.executeQuery(sql);
		return resul;
	}
	
	//Cerrar
	public void cerrarConexion(Connection conexion, ResultSet resul) throws SQLException {
		resul.close();
		conexion.close();
	}


}
