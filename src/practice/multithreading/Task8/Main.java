package practice.multithreading.Task8;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    /* ���������������� - ����� ���������� � ���������� �������
       ���� ���������� ������ - ��� �� ����� ������� ������
       ������� ������� ��������� �� ������ � ���������� ������� */
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }

    private static void produce() throws InterruptedException {
        Random random = new Random();

        while (true) {
            Thread.sleep(random.nextInt(10, 500));
            queue.put(random.nextInt(100)); // ���� ������� ��������� - ����� ����� ���� ������ � ������� �� �����������
        }
    }

    private static void consumer() throws InterruptedException {
        Random random = new Random();
        while (true) {
            Thread.sleep(random.nextInt(100, 1000));
            System.out.println(queue.take()); // ���� - ���� � ������� ��� ���������
            System.out.println("Queue size is " + queue.size());
        }
    }
}