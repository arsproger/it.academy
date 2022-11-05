package practice.edabit;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ��� ���: ");
        String pin = scanner.nextLine();
        System.out.println(pincode(pin));
    }

    public static String pincode(String number) {
        String res = "�� ��������!";
        if (number.length() >= 4 && number.length() <= 6) res = "��������!";
        else return res;

        for (int i = 0; i < number.length(); i++) {
            String n = String.valueOf(number.charAt(i));
            if (n.equals(" ")) {
                res = "�� ��������!";
                break;
            }
            res = switch (n) {
                case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> "��������!";
                default -> "�� ��������!";
            };
        }
          return res;
    }
}
