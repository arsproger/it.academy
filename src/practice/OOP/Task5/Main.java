package practice.OOP.Task5;

public class Main {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("Spring");
                break;
            case AUTUMN:
                System.out.println("Autumn");
                break;
            case WINTER:
                System.out.println("Winter");
                break;
            case SUMMER:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Waring");
                break;
        }

    }
}
