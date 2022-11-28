package practice.OOP.Task7;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n������� ����:" +
                    "\n1) �������� ������" +
                    "\n2) �������� ���������" +
                    "\n3) ���������� ��������� � ������" +
                    "\n4) ����� ���������� � ������" +
                    "\n0) ����� � �������� ����");
            System.out.print("\n����� ����: ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Car.createCar();
                    break;
                case 2:
                    Car.createPassenger();
                    break;
                case 3:
                    System.out.print("������� ������ ������: ");
                    String modelCar = scanner.next();
                    System.out.print("������� ��� ���������: ");
                    String namePassenger = scanner.next();
                    Car.addPassenger(modelCar, namePassenger);
                    break;
                case 4:
                    System.out.print("������� ������ ������: ");
                    String modelCar2 = scanner.next();
                    Car.searchCar(modelCar2);
                    break;
                case 0:
                    System.out.println("�� ����� � �������� ����!");
                    return;
                default:
                    System.out.println("������� ����� � ����!");
                    break;
            }

        }
    }
}
