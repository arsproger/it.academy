package home.HomeWork18;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWrite = new FileWriter("oldFile.txt");
            fileWrite.write("����������� ���������� (checked) ������������ ����� ������, " +
                    "\n������� ����� ������������ � ��������� ������������ �������. " +
                    "\n� ����� ���� ��������� ��� ������� ������ Exception (�� �� RuntimeException), " +
                    "\n� ����� ����� Throwable.\n" +
                    "\n" +
                    "\n����������� ���������� ����������� �� ����� ����������. " +
                    "\n��� ��������, ��� �� ����� ���������� ���������� ���������, " +
                    "\n��� �� ����������� ���������� ���� ����������, ���� ���, �� �������� ������ ����������.\n" +
                    "\n" +
                    "\n������������� ���������� (unchecked) ������������ ����� ������, " +
                    "\n������� �� ����� ������������ �������. " +
                    "\n� ��� ��������� ������ Error � RuntimeException (��������� ������ Exception) � �� ����������. " +
                    "\n��� ��������, ��� ���� ��������� ���������� ������������� ����������, " +
                    "\n� ���� ���� �� �� ������������ ��� �� ��������� ��� ����������, " +
                    "\n��������� �� ������ ������ ����������.");
            fileWrite.close();
            System.out.println("�������!");
        } catch (IOException exception) {
            System.out.println("������ ������ � ����!");
        }
    }
}
