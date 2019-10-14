package Main;

/*
* ID = 4 bytes (empieza a escribir a los empleados en la posición 4)
*
* APELLIDO = 20 bytes
* DEPARTAMENTO = 4 bytes
* SALARIO = 8 bytes
*
* Total = 32 bytes
*
*
* */

//PG
//Inicio
    //Mostrar menu, leer y validar opción
    //Según opcion
        //Caso 1: Consulta
        //Caso 2: Inserción
        //Caso 3: Modificación
        //Caso 4: Borrado
        //Caso 0: Salir
    //Fin_Segun
//Fin

import Gestora.GestoraAccesoAleatorio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MainAccesoAleatorio {

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("[1] Consultar");
        System.out.println("[2] Insertar");
        System.out.println("[3] Modificar");
        System.out.println("[4] Borrar");
        System.out.println("[0] Salir");
    }

    public static void main(String[] args){
        try{
            //Declaraciones de variables
            int opcionMenu = 0;

            //Inicializaciones
            Scanner teclado = new Scanner(System.in);

            File fichero = new File("src/Ficheros/Empleados.dat");
            RandomAccessFile file = new RandomAccessFile(fichero, "rw");

            GestoraAccesoAleatorio Gestora = new GestoraAccesoAleatorio();

            do{
                //Mostrar menu, leer y validar opción
                mostrarMenu();

                do{
                    System.out.print("Su opcion es: ");
                    opcionMenu = teclado.nextInt();

                }while(opcionMenu<0 || opcionMenu>4);

                //Según opcion
                switch(opcionMenu){
                    case 1:
                        //System.out.println("Consultar WIP");
                        Gestora.consultarEmpleados(file);
                        break;

                    case 2:
                        //System.out.println("Insertar WIP");
                        Gestora.insertarEmpleado(file);
                        break;

                    case 3:
                        System.out.println("Modificar WIP");
                        break;

                    case 4:
                        System.out.println("Borrar WIP");
                        break;
                }
                //Fin_Segun
            }while(opcionMenu != 0);

            System.out.println("\nAshta luego!");
        }
        catch (FileNotFoundException e){
            System.out.println("No se ha encontrado el fichero");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
