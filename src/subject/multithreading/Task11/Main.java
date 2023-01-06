package subject.multithreading.Task11;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3); // ���������������� �����,
                                                              // ����� �� ������������ ���� ����� - synchronized � ��...
                                                             // � ��������� �������� ���-�� ������� ������
        ExecutorService executorService = Executors.newFixedThreadPool(3); // ���� �������

        for (int i = 1; i <= 3; i++) {
            executorService.submit(new Processor(i, countDownLatch)); // ��������� �������
        }

        executorService.shutdown(); // ���������� �������� ����� �������, � ���������� �������

        for (int i = 0; i < 3; i++) {
            Thread.sleep(1000);
            countDownLatch.countDown(); // ����������� �����, �������������� ���������� �� �������
        }
    }
}

class Processor implements Runnable{
    private int id;
    private CountDownLatch countDownLatch;

    public Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            countDownLatch.await(); // ��������� �������
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread with id " + id + " proceeded!");
    }
}
