package month1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      // int num = scanner.nextInt();
        System.out.println("��� ��� �����?");
        String name = scanner.nextLine();
        System.out.println("���� ����� " + name);
        System.out.println("������� ��� ���?");
        int num = scanner.nextInt();
        System.out.println("��� " + num + " ���");
        System.out.println("������� �� ������� 5 �� 2 = " + 5 % 2);

    }
}
