package home.HomeWork8;

public class Reader {
    String fullName;
    int numberPhone;
    String dateOfBirth;
    String faculty;
    int libraryCardNumber;

    public Reader() {}

    public Reader(String fullName, int numberPhone, String dateOfBirth, String faculty, int libraryCardNumber) {
        this.fullName = fullName;
        this.numberPhone = numberPhone;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.libraryCardNumber = libraryCardNumber;
    }

    String[] book = {"������� ����", "���������", "�������", "����������� �����", "������", "�������", "�������� �����"};
    void takeBook(int amount) {
        String res;
        if(amount == 1) { res = "�����"; }
        else if(amount == 2 || amount == 3 || amount == 4) { res = "�����"; }
        else { res = "����"; }
        System.out.println(this.fullName + " ����(�) " + amount + " " + res);
    }
    void takeBook(String[] book, int amount) {
        String bookInfo = book[0];
        for (int i = 1; i < amount; i++) {
            bookInfo += ", " + book[i];
        }
        System.out.println(this.fullName + " ����(�) �����: " + bookInfo);
    }
    void takeBook(Book ... book) {
        String bookInfo = book[0].nameAndAutorBook;
        for (int i = 1; i < book.length; i++) {
            bookInfo += ", " + book[i].nameAndAutorBook;
        }
        System.out.println(this.fullName + " ����(�) �����: " + bookInfo);
    }
    void returnBook(int amount) {
        String res;
        if(amount == 1) { res = "�����"; }
        else if(amount == 2 || amount == 3 || amount == 4) { res = "�����"; }
        else { res = "����"; }
        System.out.println(this.fullName + " ������(�) " + amount + " " + res);
    }
    void returnBook(String[] book, int amount) {
        String bookInfo = book[0];
        for (int i = 1; i < amount; i++) {
            bookInfo += ", " + book[i];
        }
        System.out.println(this.fullName + " ������(�) �����: " + bookInfo);
    }
    void returnBook(Book ... book) {
        String bookInfo = book[0].nameAndAutorBook;
        for (int i = 1; i < book.length; i++) {
            bookInfo += ", " + book[i].nameAndAutorBook;
        }
        System.out.println(this.fullName + " ������(�) �����: " + bookInfo);
    }



}
