package module2.Task11;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("�����", "������", 5.0);
        Wheels wheels = new Wheels("Michelin", 19, "����");
        Music music = new Music("����� �� ���������");
        Auto auto = new Auto("BMW", engine, wheels, music);
        System.out.println(auto);
    }
}
