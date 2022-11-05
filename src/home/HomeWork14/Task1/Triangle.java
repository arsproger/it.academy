package home.HomeWork14.Task1;

public class Triangle extends Figure{
    double length;

    public Triangle(double length) {
        this.length = length;
    }

    @Override
    public void square() {
        double res = (Math.pow(this.length,2) * Math.sqrt(3)) / 4;
        System.out.printf("������� ������������: %.2f", res);
    }

    @Override
    public void perimeter() {
        double res = Math.pow(this.length, 3);
        System.out.printf("�������� ������������: %.2f", res);
    }
}
