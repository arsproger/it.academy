package month1;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "�����";
        String name2 = "�����";
        String name3 = "������";
        System.out.println("������� �������");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a < c) {
            System.out.println("����� ������� " + name1 + ", ��� " + a);
        } else if (b < a && b < c) {
            System.out.println("����� ������� " + name2 + ", ��� " + b);
        } else if (c < a && c < b) {
            System.out.println("����� ������� " + name3 + ", ��� " + c);
        } else {
            System.out.println("������");
        }
        System.out.println(name1 + ": " + a);
        System.out.println(name2 + ": " + b );
        System.out.println(name3 + ": " + c);

    }

}
