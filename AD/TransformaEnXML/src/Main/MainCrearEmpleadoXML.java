package Main;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

import Gestoras.GestoraTransformarXML;

public class MainCrearEmpleadoXML {
    public static void main(String args[]) throws IOException {

        int id;
        int departamento;
        int posicion = 0;
        Double salario = null;
        char apellido[] = new char[22], aux;

        File fichero = new File("src/Ficheros/Empleados.dat");

        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        GestoraTransformarXML gestora = new GestoraTransformarXML();

        try{
            DocumentBuilder builder = factory.newDocumentBuilder();

            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Empleados", null);
            document.setXmlVersion("1.0");

            //Para cada empleado creamos un elemento
            for(;;){
                //Nos posicionamos
                file.seek(posicion);

                //Leo el id del empleado
                id = file.readInt();

                //Leo el apellido del empleado
                for(int i=0; i < apellido.length; i++){
                    aux = file.readChar();  //Guardamos el caracter en un auxiliar
                    apellido[i] = aux;  //Los auxiliares se van guardando en el array apellido para obtener el apellido entero
                }

                String apellidos = new String(apellido);    //Guardamos el array de char en un String

                //Leo el departamento
                departamento = file.readInt();

                //Leo el salario
                salario = file.readDouble();

                if(id>0){
                    //Creamos el nodo empleado
                    Element raiz = document.createElement("empleado");

                    //Lo pegamos al elemento "empleado"
                    document.getDocumentElement().appendChild(raiz);

                    //Añadimos el ID
                    gestora.CrearElemento("id", Integer.toString(id), raiz, document);

                    //Añadimos el Apellido
                    gestora.CrearElemento("apellido", apellidos.trim(), raiz, document);

                    //Añadimos el Departamento
                    gestora.CrearElemento("departamento", Integer.toString(departamento), raiz, document);

                    //Añadimos el Salario
                    gestora.CrearElemento("salario", Double.toString(salario), raiz, document);
                }

                //Nos posicionamos para leer el siguiente empleado
                posicion = posicion + 60;

                if(file.getFilePointer() == file.length()){
                    break;
                }

            }
            //Fin_Para

            Source source = new DOMSource(document);
            //Creamos el archivo Empleados.xml
            Result result = new StreamResult(new java.io.File("src/Ficheros/Empleados.xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            transformer.transform(source, result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        file.close();
    }
}
