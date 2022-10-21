package practice.OOP.Figure;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.println("Периметр красных фигур: " + calculateRedPerimeter(figures));
        System.out.println("Площадь красных фигур: " + calculateRedArea(figures));

    }
    public static double calculateRedPerimeter(Figure[] figures) {
        double count = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i].color.equals("Red")) {
                count += figures[i].perimeter();
            }
        }
        return count;
    }

    public static double calculateRedArea(Figure[] figures) {
        double count = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i].color.equals("Red")) {
                count += figures[i].area();
            }
        }
        return count;
    }

}
