package es.psp.threads.sync;

public class Hilo extends Thread {
    private Contador contador;

    public Hilo(Contador c) {
        contador = c;
    }

    @Override
    public void run() {

        for (int i = 0; i < NoSync.TOTAL; i++) {
            contador.sumar();
        }

    }
}
