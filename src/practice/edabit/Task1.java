package practice.edabit;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пин код: ");
        String pin = scanner.nextLine();
        System.out.println(pincode(pin));
    }

    public static String pincode(String number) {
        String res = "Не подходит!";
        if (number.length() >= 4 && number.length() <= 6) res = "Подходит!";
        else return res;

        for (int i = 0; i < number.length(); i++) {
            String n = String.valueOf(number.charAt(i));
            if (n.equals(" ")) {
                res = "Не подходит!";
                break;
            }
            res = switch (n) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> "Подходит!";
                default -> "Не подходит!";
            };
        }
          return res;
    }
}
