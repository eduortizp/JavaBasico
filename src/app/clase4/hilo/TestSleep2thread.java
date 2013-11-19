package app.clase4.hilo;

public class TestSleep2thread {

    public static void main(String[] args) {
        int delay1 = (int) (Math.random() * 2000);
        int delay2 = (int) (Math.random() * 2000);
        int delay3 = (int) (Math.random() * 2000);
        Sleep2Thread thread1 = new Sleep2Thread("thread1", delay1);
        Sleep2Thread thread2 = new Sleep2Thread("thread2", delay2);
        Sleep2Thread thread3 = new Sleep2Thread("thread3", delay3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
