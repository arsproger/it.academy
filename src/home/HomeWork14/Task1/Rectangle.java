package home.HomeWork14.Task1;

public class Rectangle extends Figure{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void square() {
        double res = this.length * this.width;
        System.out.printf("Площадь прямоугольника: %.2f", res);
    }

    @Override
    public void perimeter() {
        double res = Math.pow(this.length,2) * Math.pow(this.width, 2);
        System.out.printf("Периметр прямоугольника: %.2f", res);
    }
}
