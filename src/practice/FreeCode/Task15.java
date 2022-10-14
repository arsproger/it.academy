package practice.FreeCode;

/* 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
Пример:
Введено число 10. Сгенерирован следующий массив:
[4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
Информация о массиве:
Длина массива: 10
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
        System.out.println("Введите размер массива: ");
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
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + a8);
        System.out.println("Количество чисел равных 1: " + a1);
        System.out.println("Количество четных чисел: " + count2);
        System.out.println("Количество нечетных чисел: " + count1);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
