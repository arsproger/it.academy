package module1;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        String res = "Наименьшее число: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if(a < b) {
            System.out.println(res + a);
        }
        else if(a == b) {
            System.out.println("Они равны!");
        }
        else {
            System.out.println(res + b);
        }


    }
}
