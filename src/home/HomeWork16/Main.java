package home.HomeWork16;

public class Main {
    public static void main(String[] args) {
        Printable book = new Book();
        Printable magazine = new Magazine();
        Printable[] array = {book, magazine};
        for (Printable printable : array) {
            printable.print();
        }
    }
}
