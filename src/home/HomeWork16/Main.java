package home.HomeWork16;

public class Main {
    public static void main(String[] args) {
        Printable book = new Book("Book1");
        Printable book2 = new Book("Book1");
        Printable magazine = new Magazine("Magazine1");
        Printable magazine2 = new Magazine("Magazine1");
        Printable[] array = {book, magazine};
        for (Printable printable : array) {
            printable.print();
        }
    }
}
