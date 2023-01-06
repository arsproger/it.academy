package subject.freeCode;

/* Описать процедуру sortInc3(), с параметрами int a, int b, int c,
меняющую содержимое переменных a, b, c - таким образом,
чтобы их значения оказались упорядоченными по возрастанию.
Числа a, b, c - брать через Scanner.
Вывести результат.
 */
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
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
