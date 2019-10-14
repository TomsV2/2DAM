package Gestora;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class GestoraAccesoAleatorio {

    public RandomAccessFile insertarEmpleado(RandomAccessFile file) {

        //Declaración de varaibles

        //4bytes + 44bytes + 4bytes + 8bytes = 60bytes

        int id = 0;
        String apellido = "";
        int departamento = 0;
        double salario = 0;

        long posicion;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el id: ");
        id = teclado.nextInt();
        System.out.println("");

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
            posicion = (id-1) * 60;

            file.seek(posicion);

            file.writeInt(id);
            file.writeChars(apellido);
            file.writeInt(departamento);
            file.writeDouble(salario);

            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    public void consultarEmpleados(RandomAccessFile file){

        int id;
        int departamento;
        long posicion = 0;

        double salario;

        char apellido[] = new char[22], aux;

        try{
            for(;;){
                file.seek(posicion);

                id = file.readInt();

                for(int i=0; i < apellido.length; i++){
                    aux = file.readChar();
                    apellido[i] = aux;
                }

                String apellidos = new String(apellido);

                departamento = file.readInt();

                salario = file.readDouble();

                if(id > 0){
                    System.out.println("ID: " +id + "Apellido: " +apellidos.trim());
                }

                posicion = posicion + 60;

                if(file.getFilePointer() == file.length()){
                    break;
                }

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
