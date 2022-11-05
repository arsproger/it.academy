package home.HomeWork11;

public class Circle {
    private final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void areaOfCircle() {
        System.out.printf("Площадь круга: %.2f\n", PI * Math.pow(this.radius, 2));
    }

    public static void circumference(double radius) {
        final double pi = Math.PI;
        System.out.printf("Длина окружности: %.2f\n", 2 * pi * radius);
    }

    public double getPI() { return PI; }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }
}
