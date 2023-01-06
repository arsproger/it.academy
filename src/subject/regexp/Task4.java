package subject.regexp;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        if (name.matches("[A-Za-zА-Яа-я]+")) {
            System.out.println("Welcome " + name + '!');
        } else {
            System.out.println("Имя должно содержать только буквы!");
        }
    }
}
