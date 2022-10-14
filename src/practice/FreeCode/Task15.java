package practice.FreeCode;

/* 1. � ���������� �������� ����� n - ������ �������. ���������� ������� ������
���������� ������� � ��������� ��� ���������� ������� �� 0 �� 10. ����� �������
���������� ������� � �������, � ����� ������� � ������� ���������� �:
�) ����� �������
�) ���������� ����� ������ 8
�) ���������� ����� ������ 1
�) ���������� ������ �����
�) ���������� �������� �����
�) ����� ���� ��������� �������
������:
������� ����� 10. ������������ ��������� ������:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
���������� � �������:
����� �������: 10
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a8 = 0;
        int a1 = 0;
        int count2 = 0;
        int count1 = 0;
        int sum = 0;
        System.out.println("������� ������ �������: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,11);
            sum += array[i];
            if(array[i] > 8)
                a8++;
            if(array[i] == 1)
                a1++;
            if(array[i] % 2 == 0)
                count2++;
            if(array[i] % 2 == 1)
                count1++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("����� �������: " + array.length);
        System.out.println("���������� ����� ������ 8: " + a8);
        System.out.println("���������� ����� ������ 1: " + a1);
        System.out.println("���������� ������ �����: " + count2);
        System.out.println("���������� �������� �����: " + count1);
        System.out.println("����� ���� ��������� �������: " + sum);
    }
}
