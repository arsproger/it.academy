package home.HomeWork10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print symbol for Square: ");
        char symbolForSquare = scanner.next().charAt(0);
        Square square = new Square(symbolForSquare);
        square.draw();
        System.out.print("Print symbol for Triangle: ");
        char symbolForTriangle = scanner.next().charAt(0);
        Triangle triangle = new Triangle(symbolForTriangle);
        triangle.draw();
    }
}
