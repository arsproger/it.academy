package subject.freeCode;

/* ������� ��������� sortInc3(), � ����������� int a, int b, int c,
�������� ���������� ���������� a, b, c - ����� �������,
����� �� �������� ��������� �������������� �� �����������.
����� a, b, c - ����� ����� Scanner.
������� ���������.
 */
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� 3 �����: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        sortInc3(a, b, c);
    }
    public static void sortInc3(int a, int b, int c) {
        int[] array = {a, b, c};
        int count = 0;
        boolean sort = false;
        while (!sort) {
            for (int i = 0; i < array.length - 1; i++) {
                sort = true;
                if(array[i] > array[i + 1]) {
                    sort = false;
                    count = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = count;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
