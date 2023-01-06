package month1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson12part2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ������ �������:");
        int size = scanner.nextInt();
        System.out.println("������� ������ ���������:");
        int a = scanner.nextInt();
        System.out.println("������� ����� ���������:");
        int b = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("�������� �����: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(a, b);
            if(a > b || a < 0 || b < 0) {
                System.out.println("������!");
                break;
            }
            else if(array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("\n������: " + Arrays.toString(array));
    }
}
