package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;

/* ����� ������������� � ������������ �������� � ������ ������ �������.
������� ��������� ������ 5�8 ���� int � ���������������� ��� � ������� ����� ��� �������������.
����� ������������ � ����������� �������� � ������ "������" � �������� ��� �������� � ���������� ������ 5�2.
����������� ������, ���������� ������������ � ����������� ��������.
  */
public class Task11 {
    public static void main(String[] args) {
        int[][] array = new int[5][8];
        int[][] array2 = new int[5][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random random = new Random();
                array[i][j] = random.nextInt(10, 100);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < array.length; i++) {
            int max = 0;
            int min = 100;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    array2[i][0] = max;
                }
                if (min > array[i][j]) {
                    min = array[i][j];
                    array2[i][1] = min;
                }
            }
    }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
        }
    }


