package month1;

import java.util.Scanner;

public class Lesson2part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Вы прошли регистрацию!");
        }
            else {
                System.out.println("ОШИБКА! Вам нет 18 лет!");
            }
        }
    }