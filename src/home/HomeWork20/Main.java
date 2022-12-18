package home.HomeWork20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Sunday", "Воскресенье");
        hashMap.put("Monday", "Понедельник");
        hashMap.put("Tuesday", "Вторник");
        hashMap.put("Wednesday", "Среда");
        hashMap.put("Thursday", "Четверг");
        hashMap.put("Friday", "Пятница");
        hashMap.put("Saturday", "Суббота");
        System.out.print("Введите день недели на английском: ");
        String nameDay = scanner.nextLine();
        boolean res = false;
        for(Map.Entry<String, String> translate : hashMap.entrySet()) {
            if(translate.getKey().equalsIgnoreCase(nameDay)) {
                System.out.println(translate.getKey() + " перевод -> " + translate.getValue());
                res = true;
            }
        }
        if(!res) System.out.println("Нет такого дня недели!");
    }
}
