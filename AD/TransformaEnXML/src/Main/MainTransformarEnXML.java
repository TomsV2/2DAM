package Main;

import Gestoras.GestoraTransformarXML;

import java.io.IOException;
import java.util.Scanner;

public class MainTransformarEnXML {

    public static void mostrarMenu(){
        System.out.println();
        System.out.println("[1] ---> Leer fichero empleados");
        System.out.println("[2] ---> Crear fichero empleados");
        System.out.println("[0] ---> Salir");
        System.out.print("Su opcion es: ");
    }

    public static void main(String[] args) throws IOException {

        //Declaraciones de variables
        int opcionMenu = 0;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);
        GestoraTransformarXML gestora = new GestoraTransformarXML();

        //Hacer
        do{
            //Mostrar menu, leer y validar opcion del menu
            do{
                mostrarMenu();
                opcionMenu = teclado.nextInt();

            }while(opcionMenu<0 || opcionMenu>4);

            switch (opcionMenu){
                case 1:
                    gestora.LeerEmpleadoXML();
                    break;

                case 2:
                    gestora.CrearEmpleadoXML();
                    break;
            }

        }
        while(opcionMenu != 0); //Mientras opcion del menu no sea 0

        System.out.println("\nAhsta lue!");

    }
}
