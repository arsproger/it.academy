package home;

/* Массив с месяцами года
Напишите программу, которая:
· Запрашивает от пользователя размер массива ,
· Создает массив с заданным размером,
· Заполняет массив случайными числами от 1 до 12
· Выводит этот массив на консоль двумя способами
Просто значение внутри массива
К какому месяцу относится данное число  */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива:");  // Запрашивает от пользователя размер массива
        int size = scanner.nextInt();
        int[] array = new int[size];   // Создает массив с заданным размером
        String res = null;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 13); //Заполняет массив случайными числами от 1 до 12
            System.out.print(array[i] + " ");
            switch (array[i]) {
                case 1: res = "Январь"; break;
                case 2: res = "Февраль"; break;
                case 3: res = "Март"; break;
                case 4: res = "Апрель"; break;
                case 5: res = "Май"; break;
                case 6: res = "Июнь"; break;
                case 7: res = "Июль"; break;
                case 8: res = "Август"; break;
                case 9: res = "Сентябрь"; break;
                case 10: res = "Октябрь"; break;
                case 11: res = "Ноябрь"; break;
                case 12: res = "Декабрь"; break;
            }
            System.out.println(res);  //К какому месяцу относится данное число
        }
        System.out.println(Arrays.toString(array));  //Просто значение внутри массива
    }
}
