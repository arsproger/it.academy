package home;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int num = scanner.nextInt();
        String result;
        switch(num) {
            case 1: result = "Понедельник"; break;
            case 2: result = "Вторник"; break;
            case 3: result = "Среда"; break;
            case 4: result = "Четверг"; break;
            case 5: result = "Пятница"; break;
            case 6, 7: result = "Выходной"; break;
            default: result = "Некорректное число!"; break;
        }
        System.out.println(result);
    }
}
