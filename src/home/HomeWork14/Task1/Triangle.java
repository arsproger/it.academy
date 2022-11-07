package home.HomeWork14.Task1;

public class Triangle extends Figure{
    double length;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public void square() {
        double res = (Math.pow(this.length,2) * Math.sqrt(3)) / 4;
        System.out.printf("Площадь треугольника: %.2f\n", res);
    }

    @Override
    public void perimeter() {
        double res = this.length * 3;
        System.out.printf("Периметр треугольника: %.2f\n", res);
    }
}
