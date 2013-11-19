package app.clase4.hilo;

public class SleepThread extends Thread {

    @Override
    public void run() {
//
        for (int i = 0; i < 5; i++) {
            try {
// 1000 ms
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
