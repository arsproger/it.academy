package home;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 7");
        int num = scanner.nextInt();
        if(num == 1) {
            System.out.println("�����������");
        }
        else if(num == 2) {
            System.out.println("�������");
        }
        else if(num == 3) {
            System.out.println("�����");
        }
        else if(num == 4) {
            System.out.println("�������");
        }
        else if(num == 5) {
            System.out.println("�������");
        }
        else if (num == 6 || num == 7) {
            System.out.println("��������");
        }
        else {
            System.out.println("������������ �����!");
        }
    }
}
