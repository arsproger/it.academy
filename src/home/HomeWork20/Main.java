package home.HomeWork20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Sunday", "�����������");
        hashMap.put("Monday", "�����������");
        hashMap.put("Tuesday", "�������");
        hashMap.put("Wednesday", "�����");
        hashMap.put("Thursday", "�������");
        hashMap.put("Friday", "�������");
        hashMap.put("Saturday", "�������");
        System.out.print("������� ���� ������ �� ����������: ");
        String nameDay = scanner.nextLine();
        boolean res = false;
        for(Map.Entry<String, String> translate : hashMap.entrySet()) {
            if(translate.getKey().equalsIgnoreCase(nameDay)) {
                System.out.println(translate.getKey() + " ������� -> " + translate.getValue());
                res = true;
            }
        }
        if(!res) System.out.println("��� ������ ��� ������!");
    }
}
