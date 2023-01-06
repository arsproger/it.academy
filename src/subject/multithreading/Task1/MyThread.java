package subject.multithreading.Task1;

public class MyThread extends Thread{
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello from my thread " + i);
        }
    }
}
