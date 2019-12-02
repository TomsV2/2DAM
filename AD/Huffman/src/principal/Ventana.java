package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import excepciones.FueraDeRango;
import excepciones.ListaVacia;
import excepciones.NombreNulo;

public class Ventana extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Winzip winzip;
	private JTextField entrada;
	private JTextArea salida;

	public Ventana(){
		//Establecemos las propiedades de nuestro Frame
		super("Winzip");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(400, 70, 500, 370);
		this.setResizable(false);
		//Creamos un panel para agregar todos nuestros objetos
		JPanel todo=(JPanel)this.getContentPane();
		todo.setLayout(new BorderLayout());
		//Creamos dos cajas de texto y establecemos sus propiedades
		entrada=new JTextField();
		entrada.setToolTipText("Teclea el mensaje.");
		entrada.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		entrada.setForeground(Color.RED);
		salida=new JTextArea();
		salida.setToolTipText("Mensaje comprimido");
		salida.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		salida.setEditable(false);
		salida.setLineWrap(true);
		salida.setForeground(Color.BLUE);
		JScrollPane scroll = new JScrollPane(salida);
		//Obtenemos una imagen y la metemos en un Label
		ImageIcon imagen=new ImageIcon("titulo2.jpg");
		JLabel logo = new JLabel(imagen);
		logo.setVisible(true);
		//Creamos un panel para meter las cajas de texto
		JPanel cajas=new JPanel();
		cajas.setLayout(new GridLayout(2,0));
		cajas.add(entrada);
		cajas.add(scroll);
		//Creamos un panel para almacenar los botones
		JPanel botones=new JPanel();
		botones.setLayout(new GridLayout(5,0));
		botones.setBackground(Color.GRAY);
		String[] nombre={"Comprimir","Descomprimir","Limpiar"};
		for(int i=0;i<nombre.length;i++){
			JButton button =new JButton(nombre[i]);
			button.addActionListener(this);
			button.setBackground(Color.LIGHT_GRAY);
			button.setForeground(Color.RED);
			botones.add(button);
		}
		//agregamos nuestros contenedores al panel principal
		todo.add(logo, BorderLayout.NORTH);
		todo.add(cajas, BorderLayout.CENTER);
		todo.add(botones,BorderLayout.WEST);
		winzip=new Winzip();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Obtenemos el primer caracter del nombre del boton clickeado
		char caracter=((JButton) e.getSource()).getText().charAt(0);
		try {
			//Dependiendo del caracter, procedemos a hacer los procedimientos correspondientes
			switch(caracter){
			case 'C':
				//obtenemos el texto ingresado en la caja de texto
					String texto=entrada.getText();
					//Verificamos que la cadena no sea nula, si lo es se lanza una excepcion
					if(texto.length()==0){
						JOptionPane.showMessageDialog(null, "Error. No hay datos que comprimir","Error",JOptionPane.ERROR_MESSAGE);
						throw new NombreNulo();
					}
					//Utilizamos la funcion comprimir del objeto winzip y le pasamos la cadena a comprimir
					String[] cadenas=winzip.Comprimir(texto);
					//Mostramos la cadena de direcciones y la cadena de bytes
					salida.setText("Direcciones: "+cadenas[0]+"\nCaracteres: "+cadenas[1]);
				
				break;
			case 'D':
				entrada.setText("");
				//Utilizamos la funcion descomprimir de la clase Winzip
				salida.setText("El mensaje original es: "+winzip.Descomprimir());
				break;
			case 'L':
				//Limpiamos las cajas de texto
				salida.setText("");
				entrada.setText("");
				break;
			}
		} catch (FueraDeRango e1) {
			e1.printStackTrace();
		} catch (ListaVacia e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NombreNulo e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
