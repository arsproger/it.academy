package month1;

import java.util.Scanner;

public class Lesson4part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ��� ���?");
        int age = scanner.nextInt();
        if (age >= 25 && age <= 40) {
            System.out.println("�� �������!");
        } else if (age < 0) {
            System.out.println("������������ �������!");
        } else {
            System.out.println("�� �� �������!");
        }

    }
}
