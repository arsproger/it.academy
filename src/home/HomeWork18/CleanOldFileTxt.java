package home.HomeWork18;

import java.io.FileWriter;
import java.io.IOException;

public class CleanOldFileTxt {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("oldFile.txt");
            fileWriter.write("");
            System.out.println("�������� ������ �����");
            fileWriter.close();
        } catch (IOException exception) {
            System.out.println("������ ������ �����!");
        }
    }
}
