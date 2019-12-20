package MainTicTac;

import Clases.HiloTexto;

public class TicTac {
    public static void main(String[] args) throws InterruptedException {
        HiloTexto h1 = new HiloTexto("TIC");
        HiloTexto h2 = new HiloTexto("TAC");

        h1.start();
        h2.start();
    }
}
