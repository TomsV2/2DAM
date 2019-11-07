package Gestora;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLOutput;
import java.util.Scanner;

public class GestoraAccesoAleatorio {

    public boolean idExists(RandomAccessFile file, int id){

        //Declaraciones de variables
        boolean exists = false;

        long posicion = 0;

        try {

            for(;;){
                file.seek(posicion);

                //id = file.readInt();

                if(file.getFilePointer() == file.length()){
                    break;
                }
                else{
                    if(file.readInt() == id){
                        exists = true;
                    }
                }

                posicion = posicion + 60;

                if(file.getFilePointer() == file.length() || exists==true){
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return exists;
    }

    public RandomAccessFile insertarEmpleado(RandomAccessFile file) {

        //Declaración de varaibles      4bytes + 44bytes + 4bytes + 8bytes = 60bytes
        int id = 0;
        String apellido = "";
        int departamento = 0;
        double salario = 0;

        int caracteresRelleno = 0;
        boolean bandera = true;

        long posicion;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        //Inicio
        do{
            System.out.print("Introduzca el id: ");
            id = teclado.nextInt();

            if( idExists(file,id) ){
                System.out.println("El id ya está registrado, introduzca otro diferente.");
            }
            else{
                bandera = false;
            }
        }
        while(bandera == true);
        System.out.println("");

        System.out.print("Introduzca el apellido: ");
        apellido = teclado.next();

        caracteresRelleno = 22-apellido.length();

        if(apellido.length()<22){
            for(int i=1; i<=(caracteresRelleno); i++){
                //apellido = apellido + "%";    Linea para ver que creaba bien la cantidad de relleno hasta 22
                apellido = apellido + " ";
            }
        }
        else{
            apellido = apellido.substring(0,22);
        }
        apellido = apellido.toUpperCase();
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
            if(file.length()==0){
                System.out.println("\nTodavía no hay ningún empleado, prueba a introducir uno con la opción 2.");
            }
            else{
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

                    if(id > 0 && departamento!=-1){
                        System.out.println("\nID: " +id +
                                "\nApellido: " +apellidos.trim() +
                                "\nDepartamento: " +departamento +
                                "\nSalario: " +salario);
                    }

                    posicion = posicion + 60;

                    if(file.getFilePointer() == file.length()){
                        break;
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public RandomAccessFile borrarEmpleado(RandomAccessFile file) {

        //Declaración de varaibles
        int id = 0;

        long posicion;

        //Inicializaciones
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el id del empleado a borrar: ");
        id = teclado.nextInt();
        System.out.println("");

        try {
            posicion = (id-1) * 60;

            file.seek(posicion);

            file.writeInt(0);
            file.writeChars("*                     ");
            file.writeInt(-1);
            file.writeDouble(-1);

            System.out.println("Se ha borrado al empleado.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

}
