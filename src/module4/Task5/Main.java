package module4.Task5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� ���: ");
        String name = scanner.nextLine();
        System.out.print("������� ��� ����� ��������: ");
        String number = scanner.nextLine().trim();
        if(number.length() != 8) System.out.println("����� �������� ������ �������� �� 8 ����!");
        else hashMap.put(name, number);
        System.out.println(hashMap);
    }
}
