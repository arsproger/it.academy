package home.HomeWork8;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("������ �.�", 0505112233,
                "29.08.2005", "����������������", 101);

        Reader reader2 = new Reader("������� �.�", 0505223344,
                "03.10.2000", "��������", 102);

        Reader reader3 = new Reader("������� �.�", 0505334455,
                "25.02.2003", "���������", 103);

        Book book1 = new Book("�.� �����������");
        Book book2 = new Book("�.� �������");
        Book book3 = new Book("�.� ������������");

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
