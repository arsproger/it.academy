package subject.freeCode;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String abc = scanner.nextLine();
        System.out.println("В слове " + abc);
        abc.toLowerCase();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < abc.length(); i++) {
            String a = String.valueOf(abc.charAt(i));
            if (a.equals("а") || a.equals("о") || a.equals("у") || a.equals("э") || a.equals("ы") ||
                    a.equals("я") || a.equals("е") || a.equals("ю") || a.equals("и")) {
                sum1++;
            }
            else {
                sum2++;
            }
        }
        System.out.println("Количество гласных букв: " + sum1);
        System.out.println("Количество согласных букв: " + sum2);
    }
}
