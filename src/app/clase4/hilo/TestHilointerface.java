package app.clase4.hilo;

public class TestHilointerface {

    public static void main(String[] args) {
        HiloInterface st = new HiloInterface();
        Thread th = new Thread(st);
        th.start();
    }
}
