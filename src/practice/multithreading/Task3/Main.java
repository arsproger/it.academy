package practice.multithreading.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Start downloading!");
//        Thread.sleep(1000);
//        System.out.println("20%");
//        Thread.sleep(1500);
//        System.out.println("35%");
//        Thread.sleep(2000);
//        System.out.println("65%");
//        Thread.sleep(2500);
//        System.out.println("99%");
//        Thread.sleep(500);
//        System.out.println("100%");
//        System.out.println("Downloading finished!");

//        System.out.println("Start!");
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//            Thread.sleep(500);
//        }
//        System.out.println("Finish!");

        System.out.println("Для старта нажми на enter!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.print("До старта осталось -> ");
        Thread.sleep(1000);
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
            Thread.sleep(1000);
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Go! ");
            Thread.sleep(250);
        }

//        System.out.print("Введите текст: ");
//        String text = scanner.nextLine();
//        System.out.print("Ваш текст: ");
//        for (int i = 0; i < text.length(); i++) {
//            System.out.print(text.charAt(i));
//            Thread.sleep(100);
//        }
    }
}
