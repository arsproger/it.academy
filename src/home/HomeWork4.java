package home;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 7:");
        int num = scanner.nextInt();
        switch(num) {
                case 1, 3, 5, 7:
                    System.out.println("����� ��������");
                    break;
                case 2, 4, 6:
                    System.out.println("����� ������");
                    break;
        }
    }
}
