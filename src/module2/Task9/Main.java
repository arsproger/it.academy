package module2.Task9;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Arsen", "Java", 500,"Adilet", "ars5", false);
        System.out.println(book);
        book.setAutor("Shild");
        book.setPageCount(550);
        System.out.println(book);
    }
}
