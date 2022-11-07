package home.HomeWork14.Task1;

public class Circle extends Figure{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void square() {
        double res = PI * (Math.pow(this.radius, 2));
        System.out.printf("Площадь круга: %.2f\n", res);
    }

    @Override
    public void perimeter() {
        double res = 2 * PI * this.radius;
        System.out.printf("Периметр круга: %.2f\n", res);
    }
}
