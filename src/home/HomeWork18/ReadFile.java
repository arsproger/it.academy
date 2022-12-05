package home.HomeWork18;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("oldFile.txt");
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            fileReader.close();
            scanner.close();
        } catch (IOException exception) {
            System.out.println("Ошибка чтения файла!");
        }
    }
}
