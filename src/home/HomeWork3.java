package home;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����� �� 1 �� 7");
        int num = scanner.nextInt();
        String result;
        switch(num) {
            case 1: result = "�����������"; break;
            case 2: result = "�������"; break;
            case 3: result = "�����"; break;
            case 4: result = "�������"; break;
            case 5: result = "�������"; break;
            case 6, 7: result = "��������"; break;
            default: result = "������������ �����!"; break;
        }
        System.out.println(result);
    }
}
