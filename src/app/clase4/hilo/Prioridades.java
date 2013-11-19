package app.clase4.hilo;

public class Prioridades {

    public static void main(String[] args) {
        Sleep2Thread thread1 = new Sleep2Thread("thread1", 0);
        Sleep2Thread thread2 = new Sleep2Thread("thread2", 0);
// Modificando las prioridades
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}
