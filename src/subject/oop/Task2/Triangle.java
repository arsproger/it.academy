package subject.oop.Task2;

public class Triangle extends Figure{

    int sideLength1;
    int sideLength2;
    int sideLength3;
    public Triangle(int sideLength1, int sideLength2, int sideLength3, String color) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    @Override
    public double area() {
        int p = (sideLength1 + sideLength2 + sideLength3) / 2;
        return Math.sqrt(p * (p-sideLength1) * (p-sideLength2) * (p-sideLength3));
    }

    @Override
    public double perimeter() {
        return sideLength1 + sideLength2 + sideLength3;
    }
}
