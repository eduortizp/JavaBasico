package app.clase4.hilo;

public class HiloHerencia extends Thread {

    public static void main(String[] args) {
        
        HiloHerencia.ejemploHilo();

    }

    public static void ejemploHilo() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}
