package home.HomeWork16;

public class Book implements Printable{

    private String name;
    @Override
    public void print() {
        System.out.println("Book");
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
