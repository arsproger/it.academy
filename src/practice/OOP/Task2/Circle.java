package practice.OOP.Task2;

public class Circle extends Figure {

    int circleRadius;

    public Circle(int circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }


    @Override
    public double area() {
        return Math.PI * (circleRadius * circleRadius);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * circleRadius;
    }
}
