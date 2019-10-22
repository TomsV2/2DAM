package Gestoras;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class GestoraTransformarXML {

    public void CrearElemento(String datoEmpleado, String valor, Element raiz, Document document){
        //Creamos el hijo
        Element elem = document.createElement(datoEmpleado);

        //Le damos valor
        Text text = document.createTextNode(valor);

        //Pegamos el elemento hijo a la raiz (como un hijo)
        raiz.appendChild(elem);

        //Le damos el valor al elemento hijo
        elem.appendChild(text);
    }

    public void CrearEmpleadoXML() throws IOException {
        int id;
        int departamento;
        int posicion = 0;
        Double salario = null;
        char apellido[] = new char[22], aux;

        File fichero = new File("src/Ficheros/Empleados.dat");

        RandomAccessFile file = new RandomAccessFile(fichero, "r");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

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
                    CrearElemento("id", Integer.toString(id), raiz, document);

                    //Añadimos el Apellido
                    CrearElemento("apellido", apellidos.trim(), raiz, document);

                    //Añadimos el Departamento
                    CrearElemento("departamento", Integer.toString(departamento), raiz, document);

                    //Añadimos el Salario
                    CrearElemento("salario", Double.toString(salario), raiz, document);
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

    public void LeerEmpleadoXML(){
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
