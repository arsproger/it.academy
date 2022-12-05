package home.HomeWork18;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileWrite = new FileWriter("oldFile.txt");
            fileWrite.write("Проверяемые исключения (checked) представляют собой ошибки, " +
                    "\nкоторые нужно обрабатывать в программе разработчику вручную. " +
                    "\nК этому типу относятся все потомки класса Exception (но не RuntimeException), " +
                    "\nа также класс Throwable.\n" +
                    "\n" +
                    "\nПроверяемые исключения проверяются во время компиляции. " +
                    "\nЭто означает, что на этапе компиляции компилятор проверяет, " +
                    "\nвсе ли проверяемые исключения были обработаны, если нет, то выдается ошибка компиляции.\n" +
                    "\n" +
                    "\nНепроверяемые исключения (unchecked) представляют собой ошибки, " +
                    "\nкоторые не нужно обрабатывать вручную. " +
                    "\nК ним относятся классы Error и RuntimeException (наследник класса Exception) и их наследники. " +
                    "\nЭто означает, что если программа генерирует непроверяемое исключение, " +
                    "\nи даже если вы не обрабатывали или не объявляли это исключение, " +
                    "\nпрограмма не выдаст ошибку компиляции.");
            fileWrite.close();
            System.out.println("Успешно!");
        } catch (IOException exception) {
            System.out.println("Ошибка записи в файл!");
        }
    }
}
