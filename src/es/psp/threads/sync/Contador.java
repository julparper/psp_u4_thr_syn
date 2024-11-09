package es.psp.threads.sync;

public class Contador {

    private int total;

    public synchronized void sumar(){
        total = total +1;
    }

    public int getTotal() {
        return total;
    }
}
