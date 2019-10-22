package Main;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class MainLeerEmpleadoXML {
    public static void main(String[] args){

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("src/Ficheros/Empleados.xml"));

            document.getDocumentElement().normalize();

            System.out.println("Elemento raiz: " +document.getDocumentElement().getNodeName() +"\n");

            NodeList empleados = document.getElementsByTagName("empleado");

            System.out.println("Nodos empleado a recorrer: " +empleados.getLength());

            for(int i=0; i < empleados.getLength(); i++){
                Node emple = empleados.item(i);

                if(emple.getNodeType() == Node.ELEMENT_NODE){
                    Element elemento = (Element) emple;

                    System.out.println();
                    System.out.println("ID           ==> " +elemento.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Apellido     ==> " +elemento.getElementsByTagName("apellido").item(0).getTextContent());
                    System.out.println("Departamento ==> " +elemento.getElementsByTagName("departamento").item(0).getTextContent());
                    System.out.println("Salario      ==> " +elemento.getElementsByTagName("salario").item(0).getTextContent());
                }

            }

        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
