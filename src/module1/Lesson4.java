package module1;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        String res = "���������� �����: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �����");
        int a = scanner.nextInt();
        System.out.println("������� ������ �����");
        int b = scanner.nextInt();
        if(a < b) {
            System.out.println(res + a);
        }
        else if(a == b) {
            System.out.println("��� �����!");
        }
        else {
            System.out.println(res + b);
        }


    }
}
