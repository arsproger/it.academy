package practice.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 значения для 1 листа: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        list1.add(a1);
        list1.add(b1);
        list1.add(c1);
        System.out.print("Введите 3 значения для 2 листа: ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();
        list2.add(a2);
        list2.add(b2);
        list2.add(c2);
        StringBuilder listOne = new StringBuilder();
        for (int list : list1) {
            listOne.append(list);
        }
        StringBuilder listTwo = new StringBuilder();
        for(int list : list2) {
            listTwo.append(list);
        }
        listOne.reverse();
        listTwo.reverse();
        int a = 0;

        System.out.println(list1);
        System.out.println(list2);
    }
}
