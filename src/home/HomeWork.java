package home;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("Здравстуйте, сколько вам лет?");
            int age = scanner.nextInt();
            int getAge = 17;
            int resultAge = getAge - age;
            if (age >= 17) {
                System.out.println("Вы можете получить водительские права!");
            } else if (age < 17 && age == 16) {
                System.out.println("Вы не можете получить водительские права, приходите через " + resultAge + " год!");
            } else if (age == 15 || age == 14 || age == 13) {
                System.out.println("Вы не можете получить водительские права, приходите через " + resultAge + " года!");
            } else if (age < 0) {
                System.out.println("Некорректный возраст!");
            } else {
                System.out.println("Вы не можете получить водительские права, приходите через " + resultAge + " лет!");
            }

        }
    }

