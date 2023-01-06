package subject.freeCode;

import java.util.Random;

/* Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:

n! = 1*2*...*n;?
0! = 1;
5! = 1*2*3*4*5;
Число n задается случайным образом (используйте Math.random()). Оно должно быть в диапазоне от 0 до 5.

*/
public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
     //   int n = random.nextInt(10);
        int n = 5;
        System.out.println(n + "!");
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
