

public class TicTac {

    public static class HiloTexto extends Thread{
        //Atributos
        private String texto;

        //Constructor
        public HiloTexto(String texto){
            this.texto = texto;
            System.out.println("CREANDO HILO CON TEXTO: " +texto);
        }

        public void run(){
            for(int i=1; i<=10; i++){
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

    public static void main(String[] args) throws InterruptedException {
        HiloTexto h1 = new HiloTexto("ooooo");
        HiloTexto h2 = new HiloTexto("-----");

        //h1.setPriority(1);
        //h2.setPriority(1);

        h1.start();
        h2.start();
    }
}
