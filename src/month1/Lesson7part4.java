package month1;

import java.util.Scanner;

public class Lesson7part4 {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int num;
      do {
          System.out.println("Введите число");
          num = scanner.nextInt();
      } while(num >= 0);
        System.out.println("Выход!");
    }
}
