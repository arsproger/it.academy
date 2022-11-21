package exam2;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Group group = null;
        Group group1 = new Group(1, "Java", 3);
        Group group2 = new Group(2,"Python", 5);
        Student student1 = new Student("Gosha");
        Student student2 = new Student("Masha");
        Student student3 = new Student("Sasha");
        Student student4 = new Student("Dasha");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n������� ����:" +
                    "\n1) ���������� �������� � ������" +
                    "\n2) ����� �� �������� ������ � ����� �������� ���� ������" +
                    "\n3) �������� ���� ����� � �� ��������");
            System.out.print("\n����� ����: \n");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.print("������� �������� ������: ");
                String nameGroup = scanner.next();
                System.out.print("������� ��� ��������: ");
                String nameStudent = scanner.next();
                System.out.println(Group.addStudent(nameGroup, nameStudent));
            } else if (number == 2) {
                System.out.print("������� �������� ������: ");
                String nameGroup = scanner.next();
                Group.searchGroupStudent(nameGroup);
            } else if (number == 3) {
                Group.viewAllGroupAndStudent();
            } else {
                System.out.println("������� ����� � ����!");
            }

        }
    }
}
