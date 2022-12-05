package module3.Task5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

        // Запись в файл
public class FilePrint {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\user\\Desktop\\java");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Test1");
        printWriter.println("Test2");
        printWriter.close();
    }
}
