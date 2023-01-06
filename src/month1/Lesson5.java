package month1;

import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "Антон";
        String name2 = "Борис";
        String name3 = "Виктор";
        System.out.println("Введите возраст");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && a < c) {
            System.out.println("Самый младший " + name1 + ", ему " + a);
        } else if (b < a && b < c) {
            System.out.println("Самый младший " + name2 + ", ему " + b);
        } else if (c < a && c < b) {
            System.out.println("Самый младший " + name3 + ", ему " + c);
        } else {
            System.out.println("Ошибка");
        }
        System.out.println(name1 + ": " + a);
        System.out.println(name2 + ": " + b );
        System.out.println(name3 + ": " + c);

    }

}
