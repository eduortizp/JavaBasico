package app.clase4.hilo;

public class HiloInterface implements Runnable {

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
