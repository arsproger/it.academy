package month1;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������� ��� ������ ���� ������:" + "\n������� ��� ������");
        String a = scanner.next();
        if (a.equals("�������")) {
            System.out.println("�������");
        }
        else if (a.equals("������")) {
            System.out.println("������");
        }
        else {
            System.out.println("������!");
        }
    }
}
