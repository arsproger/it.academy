package month1;
import java.util.Scanner;

public class Lesson9part4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬ведите размер массива:");
        int count = scanner.nextInt();
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i] + " ");
        }
        
    }
}
