package module2.Task7;

public class Circle {
    double radius;
    String color;
    boolean transparent = false;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(double radius, String color, boolean transparent) {
        this.radius = radius;
        this.color = color;
        this.transparent = transparent;
    }
    void circleLength() {
        double res = 2 * Math.PI * this.radius;
        System.out.printf("Длина круга: %.2f \n", res);
    }
    void sircleSquare() {
        double res = Math.PI * this.radius * this.radius;
        System.out.printf("Площадь круга: %.2f \n", res);
    }
}
