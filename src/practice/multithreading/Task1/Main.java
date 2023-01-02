package practice.multithreading.Task1;

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        System.out.println("Hello from main thread");
        myThread1.start();
        System.out.println("Hello from main thread");
        myThread2.start();
        System.out.println("Hello from main thread");

    }
}
