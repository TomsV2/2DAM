package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

//https://www.tutlane.com/tutorial/sqlite/sqlite-java-tutorial

public class MainEjInsercionEnTablas2 {
	
	public static boolean existeID(ArrayList arrayIdEmpleados){
		
		
		
		return false;
	}
	
	public static void main(String[] args) {

		//Declaraciones de variables
		int id = 0;
		String apellido = "";
		int salario = 0;
		int IDdepartamento = 0;
		int jefeDepartamento = 0;
		
		Connection conexion = null;
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		try {
			conexion = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\InsecionTablas.db");
			Statement sentencia = conexion.createStatement();
			
			if(conexion != null){
				System.out.println("Conectado.\n");
			}
			
			System.out.println("Introduzca el apellido del empleado:");
			apellido = teclado.nextLine();
			if(apellido.length()>0){
				
				System.out.println("Introduzca el ID del empleado:");
				id = teclado.nextInt();
				
				String sql = "SELECT COUNT(ID) FROM Empleado WHERE ID = " +id;
				ResultSet resul = sentencia.executeQuery(sql);
				
				if(id>0 && resul.getInt(1)==0){
					
					System.out.println("Introduzca el departamento del empleado:");
					IDdepartamento = teclado.nextInt();
					if(IDdepartamento >= 1 && IDdepartamento <= 4){
						
						System.out.println("Introduzca el salario del empleado:");
						salario = teclado.nextInt();
						if(salario>=1000 && salario<=7000){
							
							sql = "INSERT INTO Empleado(ID, Apellido, Salario, JefeDepartamento, ID_Departamento)"
											+ "VALUES(" +id +",'" +apellido +"'," +salario +"," +jefeDepartamento +"," +IDdepartamento +")";
							sentencia.executeUpdate(sql);
							
							System.out.println("\no---------------------------------------------o");
							System.out.println  ("| Se ha introducido el usuario correctamente. |");
							System.out.println  ("o---------------------------------------------o\n");
							
							sentencia.close();
							
							do{
								System.out.println("Indique si quiere que este empleado sea jefe del departamento");
								System.out.println("[0] NO");
								System.out.println("[1] SI");
								jefeDepartamento = teclado.nextInt();
							}
							while(jefeDepartamento<0 || jefeDepartamento>1);
							
							if(jefeDepartamento == 1){
								sql = "UPDATE Empleado SET JefeDepartamento=1 WHERE ID=" +id ;
								sentencia.executeUpdate(sql);
								
								System.out.println("\no-------------------------------o");
								System.out.println  ("| Se ha hecho jefe al empleado. |");
								System.out.println  ("o-------------------------------o\n");
							}
						}
						else{
							System.out.println("\no------------------------------------------------------------------o");
							System.out.println  ("| ERROR: Ha introducido un salario menor a 1000 o superior a 7000. |");
							System.out.println  ("o------------------------------------------------------------------o\n");
						}
					}
					else{
						System.out.println("\no------------------------------------------------------o");
						System.out.println  ("| ERROR: Ha introducido un departamento que no existe. |");
						System.out.println  ("o------------------------------------------------------o\n");
					}
				}
				else{
					if(id<=0){
						System.out.println("\no-----------------------------------------------------o");
						System.out.println  ("| ERROR: Ha introducido un ID menor o igual que cero. |");
						System.out.println  ("o-----------------------------------------------------o\n");
					}
					else{
						System.out.println("\no--------------------------------------------o");
						System.out.println  ("| ERROR: Ha introducido un ID que ya existe. |");
						System.out.println  ("o--------------------------------------------o\n");
					}
				}
			}
			else{
				System.out.println("\no-----------------------------------------------------------------------------o");
				System.out.println  ("| ERROR: No ha introducido un apellido (no se permiten nulos en el apellido). |");
				System.out.println  ("o-----------------------------------------------------------------------------o\n");
			}
			
			conexion.close();
			
		}
		catch(Exception ex) {
			System.out.println("Error " +ex.getMessage());
		}
		
	}
}
