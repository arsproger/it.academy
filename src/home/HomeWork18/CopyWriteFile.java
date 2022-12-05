package home.HomeWork18;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyWriteFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("oldFile.txt");
            FileWriter fileWriter = new FileWriter("newFile.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                for (int i = 0; i < line.length; i++) {
                    fileWriter.write(line[i]);
                }
                fileWriter.write("\n");
            }
            fileReader.close();
            fileWriter.close();
        } catch (IOException exception) {;
            System.out.println("Ошибка записи в файл!");
        }
    }
}
