package month1;

import java.util.Scanner;

public class Lesson4part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������� �����");
            int num = scanner.nextInt();
            switch (num) {
                case 12,1,2:
                    System.out.println("����");
                    break;
                case 3, 4, 5:
                    System.out.println("�����");
                    break;
                case 6, 7, 8:
                    System.out.println("����");
                    break;
                case 9, 10, 11:
                    System.out.println("�����");
                    break;
                default:
                    System.out.println("������");
                    break;
            }
        }
    }
}
