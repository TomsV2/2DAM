import java.applet.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ejercicioDeOtro extends Applet implements Runnable {
	int x = 1, y = 100;   
	int dx = 10, dy = 0;          
	
	Thread t;
	boolean stopFlag;
	
	Button b1,b2;

	private Font fuente;
	
	public void init() {
        b1 = new Button("Reanudar"); 
        b2 = new Button("Finalizar");
        add(b1);
        add(b2);
        fuente=new Font("Verdana",Font.BOLD,20);
	}
	
	public void start() {
		t = new Thread(this);
		stopFlag=false; 
		t.start();
	}

	public void paint(Graphics g) {
		g.setFont(fuente);
		g.drawString("A",x,y);
	}

	public void run() {
		while(true) {
			if(stopFlag)
				break;
			if ((x + dx < 0) || (x + dx > getSize().width)) dx = -dx;
			if ((y + dy < 0) || (y + dy > getSize().height)) dy = -dy;
			x += dx;  y += dy;

			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e);
			};
			repaint();
		}
	}

	public void stop() {
		stopFlag=true;
		t=null;
	}
}