package practice.multithreading.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); // ������ ������

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // ���� ����� enter

        myThread.shutdown(); // ��������� ������ � ������� ������ ������
    }
}
