package home.HomeWork8;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов А.Б", 0505112233,
                "29.08.2005", "Программирование", 101);

        Reader reader2 = new Reader("Петрова М.И", 0505223344,
                "03.10.2000", "Медицина", 102);

        Reader reader3 = new Reader("Смирнов В.Б", 0505334455,
                "25.02.2003", "Экономика", 103);

        Book book1 = new Book("А.В Приключения");
        Book book2 = new Book("В.П Словарь");
        Book book3 = new Book("Б.С Энциклопедия");

        reader1.takeBook(4);
        reader2.takeBook(reader2.book, 5);
        reader3.takeBook(book1, book2, book3);
        reader1.takeBook(reader1.book, 6);

        reader1.returnBook(1);
        reader3.returnBook(reader3.book, 3);
        reader2.returnBook(book3);
        reader3.returnBook(book1, book2);

    }
}
