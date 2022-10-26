package module2.Task8;

public class Box {
    int width;
    int height;
    int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    int volume() {
        return this.height * this.length * this.width;
    }
}
