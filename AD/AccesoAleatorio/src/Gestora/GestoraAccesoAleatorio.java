package Gestora;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class GestoraAccesoAleatorio {

    public void insertarEmpleado(RandomAccessFile file) {

        //Declaración de varaibles
        String apellido = "";
        int departamento = 0;
        double salario = 0;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el apellido: ");
        apellido = teclado.next();
        System.out.println("");

        System.out.print("Introduzca el departamento: ");
        departamento = teclado.nextInt();
        System.out.println("");

        System.out.print("Introduzca el salario: ");
        salario = teclado.nextDouble();
        System.out.println("");

        try {
            file.writeInt(1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
