package Gestoras;

import org.w3c.dom.*;

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

}
