package module2.Task11;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("Турбо", "Бензин", 5.0);
        Wheels wheels = new Wheels("Michelin", 19, "Лето");
        Music music = new Music("Какая то магнитола");
        Auto auto = new Auto("BMW", engine, wheels, music);
        System.out.println(auto);
    }
}
