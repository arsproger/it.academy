package home.HomeWork16;

public class Magazine implements Printable{

    private String name;

    @Override
    public void print() {
        System.out.println("Magazine");
    }

    public static void  printMagazines(Printable[] printable) {

    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
