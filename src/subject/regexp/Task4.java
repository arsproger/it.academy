package subject.regexp;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� ���: ");
        String name = scanner.nextLine();
        if (name.matches("[A-Za-z�-��-�]+")) {
            System.out.println("Welcome " + name + '!');
        } else {
            System.out.println("��� ������ ��������� ������ �����!");
        }
    }
}
