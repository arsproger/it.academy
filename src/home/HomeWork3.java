package home;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����:");
        int num = scanner.nextInt();
        if(num % 2 == 0) {
            System.out.println("����� ������");
        }
        else {
            System.out.println("����� ��������");
        }

    }

}
