package subject.multithreading.Task2;

public class Runner implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("Hello from my thread " + i);
        }
    }
}
