package module1;

import java.util.Scanner;

public class Lesson15part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� �����:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
            sum(a, b);
    }
    static void sum(int num1, int num2) {
        System.out.println("����� = " + (num1 + num2));
    }
}
