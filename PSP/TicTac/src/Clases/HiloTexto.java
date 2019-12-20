package Clases;

public class HiloTexto extends Thread{
    //Atributos
    private String texto;

    //Constructor
    public HiloTexto(String texto){
        this.texto = texto;
        System.out.println("CREANDO HILO CON TEXTO: " +texto);
    }

    public void run(){
        for(int i=1; i<=10; i--){
            try {
                System.out.println(texto);
                Thread.sleep(500);
                Thread.yield();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
