package subject.multithreading.Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WaitAndNotify wn = new WaitAndNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class WaitAndNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Producer thread started...");
            wait(); // wait() and notify() -> могут вызываться только внутри synchronized блока
                   // и вызываются по умолчанию на объекте this ( this.wait() ).
                  // важно! чтобы метод notify() & wait() синхронизировались на одном объете
                 // именно за счет объектов происходит связь
                // wait() -> ждет бесконечно wait(n ms) -> ждет определенное время
               // при вызове происходит: 1 -> отдаем intrinsic lock ( монитор )
              // 2 -> ждем пока будет вызван notify();
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine(); // -> ждем нажатия enter
            notify(); // notify() -> пробуждает 1 поток notifyAll() -> пробуждает все потоки
                     // notify() -> не возвращает монитор
            // wait() -> ждет notify() -> оповещает
        }
    }
}