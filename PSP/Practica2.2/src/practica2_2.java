import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practica2_2 extends Applet implements Runnable,ActionListener {
    Thread h;
    int x, y;     	//posición del centro de la pelota
    int dx = 1;         //desplazamientos

    int retardo=8;
    
	private boolean parar;
    
	private Button b1;
	private Button b2;
    
    private String letra="F";
    private Font fuente;
    
    //Doble buffer
    Image imag;
    Graphics gBuffer;

  public void init () {
    setBackground(Color.white);
    
    add(b1=new Button("Iniciar rebotes"));		                   
	b1.addActionListener(this);
	
	add(b2=new Button("Parar rebotes"));
	b2.addActionListener(this);
    
	//Posición inicial de la letra
    x=1;			
    y=100;
    
    fuente=new Font("Verdana",Font.BOLD,20);
  }
  
  public void start(){
  }

  public void stop(){
     if(h!=null){
        h=null;
     }
  }
  
  public void run() {
	parar=false;
    while (!parar) {
        mover();
        try{
            Thread.sleep(Math.max(0, retardo));
        }catch(InterruptedException ex){
            break;
        }
    }
  }
  
  void mover(){
     x += dx;
     if (x >= (getSize().width-13) || x <= -1) {
    	 dx*= -1;
     }
     repaint();
  }
  
  public void update(Graphics g){
    if(gBuffer==null){
          imag=createImage(getSize().width, getSize().height);
          gBuffer=imag.getGraphics();
     }
    
     g.drawImage(imag, 0, 0, null);
     g.setFont(fuente);
     g.drawString(letra, x, 100);
 }

  public void paint (Graphics g) {
	  g.setFont(fuente);
	  g.drawString(letra, x, 100);
  }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){
			if(h==null || !h.isAlive()){
				h=new Thread(this);
				h.start();
				b1.setLabel("Reanudar");
			}
		}
		else{
			if(h!=null&&h.isAlive()){
				parar=true;
				b1.setLabel("Reanudar");
			}
		}
	}

}