package module1;

import java.util.Scanner;

public class Lesson6part3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� 2 �����");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        while (a > 0) {
//            System.out.println("������ �����: " + a + " ������ �����: " +b);
            count += b;
            a--;
        }
        System.out.println("\n�����: " + count);

    }
}
