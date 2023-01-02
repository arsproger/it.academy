package practice.multithreading.Task4;

public class MyThread extends Thread {
    volatile boolean running = true; // volatile - гарантирует когерентность кэшей
                                    // - говорим программе что переменная может быть изменена!
                                   // - тем самым она не будет кэшироваться и будет находиться в главной памяти (main memory).
    public void run() {
        while (running) {
            System.out.println("Hello!");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
