package subject.multithreading.Task15;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException { // причина исключения - завершение потока
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()) {        // вызов метода isInterrupted() на текущем потоке
                        System.out.println("Thread was interrupted!");
                        break;                                        // завершение потока
                    }

                    Math.sin(random.nextDouble());
                }
            }
        });

        System.out.println("Starting thread!");

        thread.start();

        Thread.sleep(1000);
        thread.interrupt(); // завершение потока, должен вызываться до join();

        thread.join();

        System.out.println("Thread has finished!");
    }
}
