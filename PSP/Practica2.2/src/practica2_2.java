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

/*public class ejemploRebota extends Applet implements Runnable {
    Thread anima;
    int radio=10;       //radio de la pelota
    int x, y;     	//posición del centro de la pelota
    int dx = 1;         //desplazamientos
    int anchoApplet;
    int altoApplet;
    int retardo=8;
    
    private String letra="F";
    private Font fuente;
//Doble buffer
     Image imag;
     Graphics gBuffer;

  public void init () {
    setBackground(Color.white);
    
    anchoApplet=getSize().width;	//dimensiones del applet
    altoApplet=getSize().height;
    x=100;			//posición inicial de partida
    y=100;
    
    fuente=new Font("Verdana",Font.BOLD,40);
}
  
  public void start(){
     if(anima ==null){
        anima=new Thread(this);
        anima.start();
     }
  }

  public void stop(){
     if(anima!=null){
        anima.stop();
        anima=null;
     }
  }
  
  public void run() {
    long t=System.currentTimeMillis();
    while (true) {
        mover();
        try{
            t+=retardo;
            Thread.sleep(Math.max(0, t-System.currentTimeMillis()));
        }catch(InterruptedException ex){
            break;
        }
    }
  }
  
  void mover(){
     x += dx;
     //y += dy;
     if (x >= (anchoApplet-radio) || x <= radio) dx*= -1;
     //if (y >= (altoApplet-radio)  || y <= radio) dy*= -1;
     repaint();		//llama a update
  }
  
  public void update(Graphics g){
     if(gBuffer==null){
          imag=createImage(anchoApplet, altoApplet);
          gBuffer=imag.getGraphics();
     }
     
     gBuffer.setColor(getBackground());
     //gBuffer.fillRect(0,0, anchoApplet, altoApplet);
//dibuja la pelota
     //gBuffer.setColor(Color.red);
     //gBuffer.fillOval(x-radio, y-radio, 2*radio, 2*radio);
//transfiere la imagen al contexto gráfico del applet
     g.drawImage(imag, 0, 0, null);
     g.setFont(fuente);
     g.drawString(letra, x, 100);
 }

  public void paint (Graphics g) {
//se llama la primera vez que aparece el applet
  }
}*/