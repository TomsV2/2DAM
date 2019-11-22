import java.util.Scanner;

public class leerCadenas {

	public static void main(String[] args) {
		
		String cadena = "";
		String cadena2 = "";
		
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Introduzca una cadena (recuerde introducir los espacios tambien):");
			cadena = teclado.nextLine();
			
			cadena2 = cadena2 + cadena;
		}
		while(!cadena.contains("*"));
		
		System.out.println("Ha introducido un '*' para terminar la ejecucion.\n");
		
		System.out.println("Su cadena introducida es: " +cadena2);
		
	}

}
