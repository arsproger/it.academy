package month1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      // int num = scanner.nextInt();
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        System.out.println("Меня зовут " + name);
        System.out.println("Сколько вам лет?");
        int num = scanner.nextInt();
        System.out.println("Мне " + num + " лет");
        System.out.println("Остаток от деления 5 на 2 = " + 5 % 2);

    }
}
