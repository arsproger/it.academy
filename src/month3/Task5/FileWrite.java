package month3.Task5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args)  {
        try {
            String sep = File.separator;
//            File file = new File("C:\\Users\\user\\Desktop\\java");
            File file = new File("C:" + sep + "Users" + sep + "user" + sep + "Desktop" + sep + "java");
            FileWriter fileWriter = new FileWriter(file, true); // false ������ ���������� �� ���������!
                                                                      // true ���������� ��� ��������!
            fileWriter.write("Java");
            fileWriter.close();
            System.out.println("�������!");
        } catch (IOException exception) {
            System.out.println("������!");
        }
    }
}
