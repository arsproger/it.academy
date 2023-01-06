package month3.Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

        // Чтение из файла
public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\java");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
