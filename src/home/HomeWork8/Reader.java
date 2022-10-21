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

    String[] book = {"Пиковая дама", "Гробовщик", "Русалка", "Капитанская дочка", "Метель", "Полтава", "Каменный гость"};
    void takeBook(int amount) {
        String res;
        if(amount == 1) { res = "книгу"; }
        else if(amount == 2 || amount == 3 || amount == 4) { res = "книги"; }
        else { res = "книг"; }
        System.out.println(this.fullName + " взял(а) " + amount + " " + res);
    }
    void takeBook(String[] book, int amount) {
        String bookInfo = book[0];
        for (int i = 1; i < amount; i++) {
            bookInfo += ", " + book[i];
        }
        System.out.println(this.fullName + " взял(а) книги: " + bookInfo);
    }
    void takeBook(Book ... book) {
        String bookInfo = book[0].nameAndAutorBook;
        for (int i = 1; i < book.length; i++) {
            bookInfo += ", " + book[i].nameAndAutorBook;
        }
        System.out.println(this.fullName + " взял(а) книги: " + bookInfo);
    }
    void returnBook(int amount) {
        String res;
        if(amount == 1) { res = "книгу"; }
        else if(amount == 2 || amount == 3 || amount == 4) { res = "книги"; }
        else { res = "книг"; }
        System.out.println(this.fullName + " вернул(а) " + amount + " " + res);
    }
    void returnBook(String[] book, int amount) {
        String bookInfo = book[0];
        for (int i = 1; i < amount; i++) {
            bookInfo += ", " + book[i];
        }
        System.out.println(this.fullName + " вернул(а) книги: " + bookInfo);
    }
    void returnBook(Book ... book) {
        String bookInfo = book[0].nameAndAutorBook;
        for (int i = 1; i < book.length; i++) {
            bookInfo += ", " + book[i].nameAndAutorBook;
        }
        System.out.println(this.fullName + " вернул(а) книги: " + bookInfo);
    }



}
