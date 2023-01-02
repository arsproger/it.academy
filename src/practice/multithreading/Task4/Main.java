package practice.multithreading.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // Запуск потока

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Ждет ввода enter

        myThread.shutdown(); // Остановка потока с помощью своего метода
    }
}
