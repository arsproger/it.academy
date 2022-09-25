package module1;

import java.util.Scanner;

public class Lesson6part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int pass = 8877;
        do {
            System.out.println("Введите пароль");
            num = scanner.nextInt();
            if(num != pass)
                System.out.println("Неверный пароль");
            System.out.println();
        } while (num != pass);
        System.out.println("Разблокирован!");
    }
}
