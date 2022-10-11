package practice.FreeCode;

// Вывод простых чисел

public class Task4 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 2; i <= number; i++) {
            boolean count = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = false;
                    break;
                }
            }
            if (count) {
                System.out.print(i + " ");
            }
        }

    }
}

