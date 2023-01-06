package month1;

public class Lesson10part2 {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
              array[i][j] = i * j;
            }
        }


    }
}
