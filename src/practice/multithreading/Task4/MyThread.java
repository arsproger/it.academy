package practice.multithreading.Task4;

public class MyThread extends Thread {
    volatile boolean running = true; // volatile - ����������� ������������� �����
                                    // - ������� ��������� ��� ���������� ����� ���� ��������!
                                   // - ��� ����� ��� �� ����� ������������ � ����� ���������� � ������� ������ (main memory).
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
