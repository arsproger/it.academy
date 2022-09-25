package module1;

import java.util.Scanner;

public class Lesson4part3 {
    public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a == b && b == c) {
            System.out.println("Все числа одинаковые");
        }
        else if(a == b || a == c || b == c){
            System.out.println("Два числа одинаковые");
        }
        else {
            System.out.println("Нет одинаковых чисел");
        }

    }
}
