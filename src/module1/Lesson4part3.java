package module1;

import java.util.Scanner;

public class Lesson4part3 {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        System.out.println("������� 3 �����:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a == b && b == c) {
            System.out.println("��� ����� ����������");
        }
        else if(a == b || a == c || b == c){
            System.out.println("��� ����� ����������");
        }
        else {
            System.out.println("��� ���������� �����");
        }

    }
}
