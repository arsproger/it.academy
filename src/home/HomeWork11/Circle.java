package home.HomeWork11;

public class Circle {
    private final double pi = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void areaOfCircle() {
        System.out.printf("Площадь круга: %.2f\n", pi * this.radius * this.radius);
    }

    public static void circumference(double radius) {
        final double pi = Math.PI;
        System.out.printf("Длина окружности: %.2f\n", 2 * pi * radius);
    }

    public double getPi() { return pi; }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }
}
