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
            System.out.println("\nГлавное меню:" +
                    "\n1) Добавление студента в группу" +
                    "\n2) Поиск по названию группы и вывод учеников этой группы" +
                    "\n3) Просмотр всех групп и их учеников");
            System.out.print("\nНомер меню: \n");
            int number = scanner.nextInt();
            if (number == 1) {
                System.out.print("Введите название группы: ");
                String nameGroup = scanner.next();
                System.out.print("Введите имя студента: ");
                String nameStudent = scanner.next();
                System.out.println(Group.addStudent(nameGroup, nameStudent));
            } else if (number == 2) {
                System.out.print("Введите название группы: ");
                String nameGroup = scanner.next();
                Group.searchGroupStudent(nameGroup);
            } else if (number == 3) {
                Group.viewAllGroupAndStudent();
            } else {
                System.out.println("Введите номер с меню!");
            }

        }
    }
}
