package module3.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        Main.ageCheck(age);
    }

    public static void ageCheck(int age) throws AgeException {
        if (age < 18) throw new AgeException("Error вам меньше 18 лет!");
        else System.out.println("Все отлично!");
    }
}
