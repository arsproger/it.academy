package subject.freeCode;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� �����:");
        String abc = scanner.nextLine();
        System.out.println("� ����� " + abc);
        abc.toLowerCase();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < abc.length(); i++) {
            String a = String.valueOf(abc.charAt(i));
            if (a.equals("�") || a.equals("�") || a.equals("�") || a.equals("�") || a.equals("�") ||
                    a.equals("�") || a.equals("�") || a.equals("�") || a.equals("�")) {
                sum1++;
            }
            else {
                sum2++;
            }
        }
        System.out.println("���������� ������� ����: " + sum1);
        System.out.println("���������� ��������� ����: " + sum2);
    }
}
