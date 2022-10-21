package practice.FreeCode;

import java.util.Arrays;
import java.util.Random;

/* 3. ��������� ��������� ������ (�������) ���������� ������� �� 0 �� 50. ������
������� ������
m=12, n=8 (m - ����������� �� �������, n - ����������� �� ��������).
� ������� ������� ������ ������, ����� ����� � ������� �����������. ���� �����
����� ���������, ������� ������ ��������� �� ���.
 */
public class Task17 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        int count = 0;
        String result = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
                if(array[i][j] >= count) {
                    count = array[i][j];
                    result = ("Max element index: [" + i + "] [" + j + "]");
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("\n" + result);
    }
}
