package app.clase4.hilo;

public class Sleep2Thread extends Thread {

    public String name = null;
    public int delay = 0;

    public Sleep2Thread(String str, int d) {
        this.name = str;
        this.delay = d;
    }

    public void run() {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("name : " + name + " | delay : " + delay);
    }
}
