package module1;

import java.util.Scanner;

public class Lesson6part2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����");
        int a = scanner.nextInt();
        int i = 0;
        while (a > 0) {
            a /= 10;
            i++;
        }
        if(i >= 7) {
            System.out.println("������, ����� ������ ��������!");
        }
        else {
            System.out.println(i);
        }
    }
}
