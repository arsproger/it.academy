package subject.oop.Task2;

public class Rectangle extends Figure{

    int width;
    int height;
    public Rectangle(int width, int height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return (width * 2) + (height * 2);
    }
}
