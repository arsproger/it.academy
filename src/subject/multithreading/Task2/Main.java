package subject.multithreading.Task2;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runner());
        Thread thread2 = new Thread(new Runner());
        System.out.println("Hello from main thread");
        thread1.start();
        System.out.println("Hello from main thread");
        thread2.start();
        System.out.println("Hello from main thread");
    }
}
