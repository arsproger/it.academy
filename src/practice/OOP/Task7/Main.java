package practice.OOP.Task7;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\nГлавное меню:" +
                    "\n1) Создание машины" +
                    "\n2) Создание пассажира" +
                    "\n3) Добавление пассажира в машину" +
                    "\n4) Вывод информации о машине" +
                    "\n0) Выход с главного меню");
            System.out.print("\nНомер меню: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Car.createCar();
                    break;
                case 2:
                    Car.createPassenger();
                    break;
                case 3:
                    System.out.print("Введите модель машины: ");
                    String modelCar = scanner.next();
                    System.out.print("Введите имя пассажира: ");
                    String namePassenger = scanner.next();
                    Car.addPassenger(modelCar, namePassenger);
                    break;
                case 4:
                    System.out.print("Введите модель машины: ");
                    String modelCar2 = scanner.next();
                    Car.searchCar(modelCar2);
                    break;
                case 0:
                    System.out.println("Вы вышли с главного меню!");
                    return;
                default:
                    System.out.println("Введите номер с меню!");
                    break;
            }

        }
    }
}
