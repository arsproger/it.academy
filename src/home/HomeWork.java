package home;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println("�����������, ������� ��� ���?");
            int age = scanner.nextInt();
            int getAge = 17;
            int resultAge = getAge - age;
            if (age >= 17) {
                System.out.println("�� ������ �������� ������������ �����!");
            } else if (age < 17 && age == 16) {
                System.out.println("�� �� ������ �������� ������������ �����, ��������� ����� " + resultAge + " ���!");
            } else if (age == 15 || age == 14 || age == 13) {
                System.out.println("�� �� ������ �������� ������������ �����, ��������� ����� " + resultAge + " ����!");
            } else if (age < 0) {
                System.out.println("������������ �������!");
            } else {
                System.out.println("�� �� ������ �������� ������������ �����, ��������� ����� " + resultAge + " ���!");
            }

        }
    }

