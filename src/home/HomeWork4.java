package home;

/* ������ � �������� ����
�������� ���������, �������:
� ����������� �� ������������ ������ ������� ,
� ������� ������ � �������� ��������,
� ��������� ������ ���������� ������� �� 1 �� 12
� ������� ���� ������ �� ������� ����� ���������
������ �������� ������ �������
� ������ ������ ��������� ������ �����  */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("������� ������ �������:");  // ����������� �� ������������ ������ �������
        int size = scanner.nextInt();
        int[] array = new int[size];   // ������� ������ � �������� ��������
        String res = null;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 13); //��������� ������ ���������� ������� �� 1 �� 12
            System.out.print(array[i] + " ");
            switch (array[i]) {
                case 1: res = "������"; break;
                case 2: res = "�������"; break;
                case 3: res = "����"; break;
                case 4: res = "������"; break;
                case 5: res = "���"; break;
                case 6: res = "����"; break;
                case 7: res = "����"; break;
                case 8: res = "������"; break;
                case 9: res = "��������"; break;
                case 10: res = "�������"; break;
                case 11: res = "������"; break;
                case 12: res = "�������"; break;
            }
            System.out.println(res);  //� ������ ������ ��������� ������ �����
        }
        System.out.println(Arrays.toString(array));  //������ �������� ������ �������
    }
}
