package procedimientos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	private static Scanner scanner;
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		
		scanner = new Scanner(System.in);
		
		try {
			con = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\EmpleadosCHECK.db");
			if(con!=null) {
				System.out.println("Conectado.");
			}
			
			System.out.println("Introduzca el Numero de Departamento:");
		    int dept_no = scanner.nextInt();
			
			if(comprobarDepart(con, dept_no)==true) {
		    	Procedimiento(con, dept_no);
	    	}else {
	    		System.out.println("El departamento introducido no existe.");
	    	}
			
		} catch (Exception ex) {
			System.out.println("Error " +ex.getMessage());
		}
	    
	    
	    
	}
	
	//PreparedStatement query = con.prepareStatement("Select departamentos.dnombre, max(empleado.salario), min(empleado.salario) FROM empleado INNER JOIN departamentos WHERE empleado.dept_no=departamentos.dept_no AND empleado.dept_no IN (SELECT dept_no FROM empleado WHERE dept_no LIKE '"+dept_no+"')");
	
	public static void Procedimiento(Connection con, int dept_no) throws SQLException {
		Statement sentencia = con.createStatement();
		ResultSet result = sentencia.executeQuery("Select departamento, max(salario), min(salario) FROM empleado WHERE departamento = " +dept_no);

		while (result.next()){
			System.out.print("Numero de departamento: ");
	        System.out.println(result.getString(1));
	        System.out.print("Salario Maximo: ");
	        System.out.println(result.getInt(2));
	        System.out.print("Salario Minimo: ");
	        System.out.println(result.getInt(3));
		}
	 }
	
	public static boolean comprobarDepart(Connection con, int dept_no1) throws SQLException {
		boolean existe; 
		
		Statement sentencia = con.createStatement();
		ResultSet result = sentencia.executeQuery("SELECT departamento FROM empleado WHERE departamento = " +dept_no1);
				
		if(result.next()) {
			existe = true;
		}else {
			existe = false;
		}
		
		return existe;
	 }

}
