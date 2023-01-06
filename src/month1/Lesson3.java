package month1;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите что хотите дать роботу:" + "\nПеченье или Камень");
        String a = scanner.next();
        if (a.equals("Печенье")) {
            System.out.println("Радость");
        }
        else if (a.equals("Камень")) {
            System.out.println("Печаль");
        }
        else {
            System.out.println("Ошибка!");
        }
    }
}
