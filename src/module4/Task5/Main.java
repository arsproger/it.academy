package module4.Task5;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.print("Введите ваш номер телефона: ");
        String number = scanner.nextLine().trim();
        if(number.length() != 8) System.out.println("Номер телефона должен состоять из 8 цифр!");
        else hashMap.put(name, number);
        System.out.println(hashMap);
    }
}
