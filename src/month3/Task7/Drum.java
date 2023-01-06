package month3.Task7;

public class Drum implements MusicTools {
    private double size;

    public Drum(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("������ ���������� ������� � �������� " + this.size);
    }
}
