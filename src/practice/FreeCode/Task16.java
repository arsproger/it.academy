package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;

/* 2. ������� ����� ������ ������� 100 � ��������� ��� ���������� ������� ��
��������� �� 0 �� 10000.
�����, ��������� ����� for �������:
- ���������� ������� �������
- ���������� ������� �������
- ���������� ��������� �������, �������������� �� 0
- ����� ��������� �������, �������������� �� 0
 */
public class Task16 {
    public static void main(String[] args) {
        int[] array = new int[50];
        Random random = new Random();
        int max = 0;
        int min = 10000;
        int a = 0;
        int sumA = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            if(array[i] > max)
                max = array[i];
            if(array[i] < min)
                min = array[i];
            if(array[i] % 10 == 0) {
                sumA += array[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("���������� ������� �������: " + max);
        System.out.println("���������� ������� �������: " + min);
        System.out.println("���������� ��������� �������, �������������� �� 0: " + a);
        System.out.println("����� ��������� �������, �������������� �� 0: " + sumA);
    }
}
