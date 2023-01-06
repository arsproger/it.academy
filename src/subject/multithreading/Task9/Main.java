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
            wait(); // wait() and notify() -> ����� ���������� ������ ������ synchronized �����
                   // � ���������� �� ��������� �� ������� this ( this.wait() ).
                  // �����! ����� ����� notify() & wait() ������������������ �� ����� ������
                 // ������ �� ���� �������� ���������� �����
                // wait() -> ���� ���������� wait(n ms) -> ���� ������������ �����
               // ��� ������ ����������: 1 -> ������ intrinsic lock ( ������� )
              // 2 -> ���� ���� ����� ������ notify();
            System.out.println("Producer thread resumed...");
        }
    }

    public void consume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine(); // -> ���� ������� enter
            notify(); // notify() -> ���������� 1 ����� notifyAll() -> ���������� ��� ������
                     // notify() -> �� ���������� �������
            // wait() -> ���� notify() -> ���������
        }
    }
}