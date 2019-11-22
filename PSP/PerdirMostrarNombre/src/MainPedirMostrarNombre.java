import java.util.Scanner;

public class MainPedirMostrarNombre {
	public static void main(String[] args){
		
		//Declaraciones de varaibles
		String nombre = "";
		
		//Inicializaciones
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre por favor: ");
		nombre = teclado.nextLine();
		
		System.out.println("Su nombre es: " + nombre);
	}
}
