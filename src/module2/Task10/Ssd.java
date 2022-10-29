package module2.Task10;

public class Ssd {
    private int size;
    private int speed;

    public Ssd(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ссд{" +
                "Размер=" + size +
                ", Скорость=" + speed +
                '}';
    }
}
