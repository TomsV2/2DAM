package Main;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.*;

import Gestoras.GestoraTransformarXML;

public class MainTransformarEnXML {
    public static void main(String args[]){

        int id;
        int departamento;
        int posicion = 0;
        Double salario = null;
        char apellido[] = new char[10], aux;

        File fichero = new File("Empleados.dat");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        GestoraTransformarXML gestora = new GestoraTransformarXML();

        try{
            DocumentBuilder builder = factory.newDocumentBuilder();

            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, "Empleados", null);
            document.setXmlVersion("1.0");

            //Creamos el nodo empleado
            Element raiz = document.createElement("empleado");
            //Lo pegamos a la raiz del documento
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
        catch (ParserConfigurationException e){
            System.out.println(e.getMessage());
        }

    }
}
