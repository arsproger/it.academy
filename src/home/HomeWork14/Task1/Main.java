package home.HomeWork14.Task1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        Triangle triangle = new Triangle(8);
        Rectangle rectangle = new Rectangle(5,9);
        circle.square();
        triangle.square();
        rectangle.square();
        circle.perimeter();
        triangle.perimeter();
        rectangle.perimeter();
    }
}
