package home.HomeWork17;

public class Task3 {
    public static void main(String[] args) {
        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception: Вы вышли за пределы массива!");
        }
    }
}
