package module3.Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderClass {
    public static void main(String[] args)  {
        

        try {
            String sep = File.separator;
//            FileReader file = new FileReader("C:\\Users\\user\\Desktop\\java");
            FileReader file = new FileReader("C:" + sep + "Users" + sep + "user" + sep + "Desktop" + sep + "java");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Error!");
        }
    }
}
