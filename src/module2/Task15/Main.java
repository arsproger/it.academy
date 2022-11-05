package module2.Task15;

public class Main {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("Acer ex15", 50000, "22.5.2022", 8, "amd", "User");
        notebook.start();
        notebook.hello();
        notebook.off();
        notebook.download("intellij idea");
    }
}
